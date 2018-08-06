package com.fang.leetcode.tag.array;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * description
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 *
 *
 * 共有3种解法
 *
 * 解法1：翻转前n - k元素，翻转剩下的k个元素，最后翻转全部元素 
 *
 * 解法2：每次把最后一个元素移到第一位，后面的元素后移一位，循环往复，直到第k次。
 *
 * 解法4：交换最后k个元素和最开始的k个元素，在把前面的n-k个元素翻转。
 * @author fangxueshun
 * @date 2018/8/6
 */
public class ArrayRotate {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        arrayReverse(test, 2, test.length - 1);
        System.out.println(Arrays.stream(test).boxed().collect(Collectors.toList()));
    }

    /**
     * 每次向右旋转1步，迭代k次，时间复杂度O(n*k)
     *
     * @param nums
     * @param k
     */
    public static void rotateLostTime(int[] nums, int k) {
        int length = nums.length;
        if (k == 0 || k % length == 0) {
            return;
        }
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < length; i++) {
                int currentNum = nums[i];
                nums[i] = nums[length - 1];
                nums[length - 1] = currentNum;
            }
        }
    }


     /**
     * 每翻转前n - k元素，翻转剩下的k个元素，最后翻转全部元素，时间复杂度O(n)
     *
     * @param nums
     * @param k
     */
    public static int[] rotate(int[] nums, int k) {
        int length = nums.length;

        if (length == 0 || k == 0) {
            return nums;
        }
        //非常重要，防止出现k大于数组长度，且不是数组长度整数倍的情况
        k = k % length;
        arrayReverse(nums, 0, length-k-1);
        arrayReverse(nums, length-k, length - 1);
        arrayReverse(nums,0,length-1);
        return nums;
    }

    /**
     * 数组反转，如[12345]->[54321]
     *
     * @param nums
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static void arrayReverse(int[] nums, int startIndex, int endIndex) {
        while (endIndex > startIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            endIndex--;
            startIndex++;
        }
    }
}
