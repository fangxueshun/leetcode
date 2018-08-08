package com.fang.leetcode.tag.array;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * <p>
 * <p>
 * 两数之和
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * TODO 其他消耗时间段的解法
 * @author fangxueshun
 * @date 2018/8/8
 */
public class ArrayTwoSum {

    /**
     * 常规解法，嵌套循环，时间复杂度O(n²)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumLostTime(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{};
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 使用hashMap，key为值，value为下标，时间复杂度为O(kn)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{};
        }
        int[] result = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer temp = numsMap.get(target-nums[i]);
           if(temp != null && temp!= i){
               result[0]=i;
               result[1]=temp;
               return result;
           }
        }
        return result;
    }
}
