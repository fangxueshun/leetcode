package com.fang.leetcode.tag.string;

import com.fang.leetcode.tag.util.EasyArray;

/**
 * Author: fangxueshun
 * Description:
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 * Date: 2018/8/11
 * Time: 23:12
 *
 *
 *
 *
 */
public class StringReverseInteger {

    /**
     * 比较容易想到的解法，将int 转为string，之后反转数组，再转换为int，记得要考虑反转后的溢出问题，但是效率较低
     *
     * @param x
     * @return
     */
    public static int reverseLostTime(int x) {
        if (x > -9 && x < 9) {
            return x;
        }
        String s = Integer.toString(x);
        char[] schars = s.toCharArray();
        if (x > 0) {
            EasyArray.reverseCharArray(schars);
        } else {
            EasyArray.reverseCharArray(schars, 1, schars.length - 1);
        }

        Integer target = 0;
        try {
            target = Integer.parseInt(new String(schars));
        } catch (NumberFormatException e) {
            return 0;
        }

        return target;
    }

    /**
     * 对于非0的10进制数，每次对10取于即为个位数值，然后，然后每次循环乘以10，即可把低位替换到高位
     * 溢出的点为乘以10或加上余数，要学会变通，变为待比较的数处以10，同时当limit = result 时个位数正数不能正数超过7负数不能或8
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        if (x > -9 && x < 9) {
            return x;
        }
        int limit = -Integer.MAX_VALUE / 10;
        boolean negative = false;
        if (x < 0) {
            negative = true;
            limit = Integer.MIN_VALUE / 10;
        }

        int result = 0;
        while (x != 0) {
            Integer digit = x % 10;
            //判断是否溢出
            if((negative && result < limit )||(result == limit && digit>8)){
                return 0;
            }
            //判断是否溢出
            if((!negative && -result < limit )||(result == limit && digit>7)){
                return 0;
            }
            result = result * 10 + digit;
            x = x / 10;
        }
        return result;
    }


}
