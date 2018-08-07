package com.fang.leetcode.tag.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * description
 * 存在重复
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 *
 *
 *
 * @author fangxueshun
 * @date 2018/8/7
 */
public class ArrayDuplicateVeryfy {

    /**
     * 空间开销较大
     * @param nums
     * @return
     */
    public static  boolean containsDuplicate(int[] nums) {
        Set<Integer> integerObjectMap = new HashSet<>(nums.length);
        for(int num :nums){
            if(!integerObjectMap.add(num)){
                return true;
            }
        }

        return false;
    }

    /**
     * 时间复杂度O(n²)
     *
     * @param nums
     * @return
     */
    public static  boolean containsDuplicateTimeLost(int[] nums) {
        for(int i = 0 ;i<nums.length-1;i++){
            int currentNum = nums[i];
            for(int j = i+1; j<nums.length;j++){
                if(currentNum == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }


}
