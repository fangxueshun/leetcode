package com.fang.leetcode.tag.array;

/**
 * description
 *只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 *
 *
 * @author fangxueshun
 * @date 2018/8/7
 */
public class ArraySingleNumber {

    /**
     * 利用异或的特性，任何数异或0为其本身，且异或满足交换律和结合律
     *
     * @param nums
     * @return
     */
    public static  int singleNumber(int[] nums) {
        int number  = 0;
        for(int num : nums){
            number = number ^ num;
        }
        return number;
    }
}
