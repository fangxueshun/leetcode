package com.fang.leetcode.tag.array;

/**
 * description
 * 加一
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * @author fangxueshun
 * @date 2018/8/8
 */
public class ArrayPlusOne {

    /**
     * 从数组末尾开始循环，数值加一，重写该位置数值，如果没有进位，则返回，否则继续循环直到最后一位
     * 如果最后一位有进位，数组左侧扩充一位，填充1返回
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits){
        int length = digits.length;
        if(0 == length){
            return digits;
        }
        for(int i = length-1;i>-1;i--){
            int newNumber = digits[i]+1;
            if( newNumber < 10){
                digits[i]=newNumber;
                break;
            }
            digits[i]=newNumber-10;
            if(i != 0){
                continue;
            }
            int[] newArray = new int[length+1];
            newArray[0]=1;
            for(int j = 0;j<length;j++){
                newArray[j+1] = digits[j];
            }
            return newArray;
        }
        return digits;
    }
}
