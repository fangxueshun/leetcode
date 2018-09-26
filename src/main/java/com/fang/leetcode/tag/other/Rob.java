package com.fang.leetcode.tag.other;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: fangxueshun
 * Description:
 *
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 *
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * Date: 2018/9/25
 * Time: 23:32
 */
public class Rob {

    /**
     * 满足要求的序列为非连续序列，满足，当新增一个元素，新增的序列中，最大序列等于上上个新增的最大序列加上当前元素
     * 而目标序列为新增序列中的最大序列，与上个序列中的最大序列做比较，其中最大的一个
     *
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        if(nums.length== 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int lastMax = nums[0];
        int currentMax = nums[1];
        if(nums.length == 2){
            return Math.max(lastMax,currentMax);
        }
        for(int i = 2 ; i< nums.length;i++){
            int temp = lastMax + nums[i];
            lastMax = Math.max(currentMax,lastMax);
            currentMax = Math.max(temp,lastMax);
        }
        return currentMax;
    }

    public static void main(String[] args) {

        int [] test = new int[]{1,2,3};
        List list = Arrays.asList(test);
        Collections.shuffle(list);
        int[] temp = Arrays.copyOf(test,test.length);
        test = temp;
        System.out.println(array2String(test));
        System.out.println("temp->"+array2String(temp));
        test[1]=4;
        System.out.println("temp->"+array2String(temp));
    }

    private static String array2String(int[] nums){
        StringBuilder stringBuilder = new StringBuilder();
        for(int num : nums){
            stringBuilder.append(num+",");
        }
        return stringBuilder.toString();

    }
}
