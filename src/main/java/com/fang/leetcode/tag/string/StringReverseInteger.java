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
 * TODO 高效率转换方法
 */
public class StringReverseInteger {

    /**
     * 比较容易想到的解法，将int 转为string，之后反转数组，再转换为int，记得要考虑反转后的溢出问题，但是效率较低
     * @param x
     * @return
     */
    public static int reverse(int x) {
        if(x>-9 && x < 9){
            return x;
        }
        String s= Integer.toString(x);
        char[] schars = s.toCharArray();
        if(x >0){
            EasyArray.reverseCharArray(schars);
        }else {
            EasyArray.reverseCharArray(schars,1,schars.length-1);
        }

        Integer target = 0;
        try {
            target = Integer.parseInt(new String(schars));
        }catch (NumberFormatException e){
            return 0;
        }

        return target;
    }




}
