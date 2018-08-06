package com.fang.leetcode.tag.array;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * description
 *给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * @author fangxueshun
 * @date 2018/8/6
 */
public class ArrayRotate {

    /**
     * 每次向右旋转1步，迭代k次，时间复杂度O(n²)
     * @param nums
     * @param k
     */
    public static void rotateLostTime(int[] nums, int k) {
        int length = nums.length;
        if(k == 0 || k % length == 0){
            return;
        }
        for(int j = 0; j < k; j++){
            for(int i = 0 ; i < length ; i++){
                int currentNum = nums[i];
                nums[i] = nums[length-1];
                nums[length-1] = currentNum;
            }
        }
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        if(k == 0 || k % length == 0){
            return;
        }
        for(int j = 0; j < k; j++){
            for(int i = 0 ; i < length ; i++){
                int currentNum = nums[i];
                nums[i] = nums[length-1];
                nums[length-1] = currentNum;
            }
        }
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }
}
