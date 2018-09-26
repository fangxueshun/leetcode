package com.fang.leetcode.tag.design;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: fangxueshun
 * Description:
 * 打乱一个没有重复元素的数组。
 *
 * 示例:
 *
 * // 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 *
 * // 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 *
 * // 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 * Date: 2018/9/27
 * Time: 0:33
 */
public class Solution {
    private int[] initial;
    private int[] nums;
    private Random r = new Random();
    public Solution(int[] nums) {
        this.initial = Arrays.copyOf(nums,nums.length);
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {

        return Arrays.copyOf(initial,nums.length);
    }

    /**
     *打乱数组的方法，参考jdk实现
     * */
    public int[] shuffle() {
        for(int i = nums.length;i>1;i--){
            swapArray(nums,i-1,r.nextInt(i));
        }
        return nums;
    }

    /**
     *交换数组指定位置元素
     */
    private void swapArray(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
