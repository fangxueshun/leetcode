package com.fang.leetcode.tag.array;

/**
 * description
 *给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * @author fangxueshun
 * @date 2018/8/6
 */
public class ArrayRemoveDuplicates {

    /**
     * 考察点：数组索引的使用
     * 关键点：注意到排序后的数组，索引和索引对应的值直接的关系，以及触发更新索引值的条件
     *
     *
     * @param nums
     * @return
     */
    public static int[] removeDuplicates(int[] nums){
        for(int index = 1; index < nums.length ;index ++){
            int currentNum = nums[index];
            int lastNum = nums[index-1];
            if(currentNum != lastNum){
                nums[currentNum-1] = currentNum;
            }
        }
        return nums;
    }

}
