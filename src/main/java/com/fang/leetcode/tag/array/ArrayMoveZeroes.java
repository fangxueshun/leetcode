package com.fang.leetcode.tag.array;

/**
 * description
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 该解法可以用来剔除数组中指定元素
 *
 * @author fangxueshun
 * @date 2018/8/8
 */
public class ArrayMoveZeroes {

    /**
     * 比较常规的解法，从左向右迭代，发现0放大数组尾部，同时其他元素左移一位
     *
     * @param nums
     * @return
     */
    public static int[] moveZeroesLostTime(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int fastPointer = 0;
        int slowPointer = nums.length - 1;
        while (slowPointer != 0 && nums[slowPointer] == 0) {
            slowPointer--;
        }
        for (; fastPointer < slowPointer; fastPointer++) {
            if (nums[fastPointer] == 0) {
                //所有元素左移一位
                for (int i = fastPointer; i < slowPointer; i++) {
                    nums[i] = nums[i + 1];
                }
                nums[slowPointer - 1] = nums[slowPointer];
                nums[slowPointer] = 0;
                slowPointer--;
                fastPointer--;
            }
        }
        return nums;
    }

    /**
     *
     * 时间复杂度O(n)，双指针，慢指针指向当前剔除0之后的位置，对数组内容做左移操作，顺序不变
     * @param nums
     * @return
     */
    public static int[] moveZeroes(int[] nums) {
        if(null == nums || nums.length < 2){
            return nums;
        }
        int index = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i]==0){
                continue;
            }
            if(index != i){
                nums[index]=nums[i];
            }
            index++;
        }
        while(index < nums.length){
            nums[index]=0;
            index++;
        }
        return nums;
    }
}
