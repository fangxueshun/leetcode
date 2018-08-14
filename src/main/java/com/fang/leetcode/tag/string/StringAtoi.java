package com.fang.leetcode.tag.string;

/**
 * Author: fangxueshun
 * Description:
 * <p>
 * 实现 atoi，将字符串转为整数。
 * <p>
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * <p>
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * <p>
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * <p>
 * 若函数不能执行有效的转换，返回 0。
 * <p>
 * 说明：
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。如果数值超过可表示的范围，则返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "42"
 * 输出: 42
 * 示例 2:
 * <p>
 * 输入: "   -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 * 我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 * 示例 3:
 * <p>
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * 示例 4:
 * <p>
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 * 因此无法执行有效的转换。
 * 示例 5:
 * <p>
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
 * 因此返回 INT_MIN (−231) 。
 * <p>
 *
 * TODO 简化逻辑
 * Date: 2018/8/14
 * Time: 23:46
 */
public class StringAtoi {


    /**
     * 要分析各种条件，尤其是由‘+’ ‘-’ ‘ ’ ‘0’组成的各种组合
     *
     * @param str
     * @return
     */
    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int result = 0;
        char[] chars = str.toCharArray();
        boolean isNegative = false;
        boolean isAppearPositive = false;
        char lastChar = ' ';
        if (chars[0] == '-') {
            lastChar = '-';
            isNegative = true;
        } else if (chars[0] == '+') {
            lastChar = '+';
            isAppearPositive = true;
        }

        for (int i = isNegative || isAppearPositive ? 1 : 0; i < chars.length; i++) {
            char c = chars[i];
            if (result == 0 && c == ' ' && lastChar == ' ' ) {
                continue;
            }
            if (result == 0 && c == '-' && !isNegative && !isAppearPositive && lastChar != '0') {
                lastChar = '-';
                isNegative = true;
                continue;
            }
            if (result == 0 && c == '+' && !isNegative && !isAppearPositive && lastChar != '0') {
                lastChar = '+';
                isAppearPositive = true;
                continue;
            }
            int currentDigit = Character.digit(c, 10);
            if (currentDigit == -1) {
                break;
            }
            lastChar = c;
            if (result > Integer.MAX_VALUE / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            if (result == Integer.MAX_VALUE / 10) {
                if (currentDigit > 8) {
                    return Integer.MIN_VALUE;
                }
                if (!isNegative && currentDigit > 7) {
                    return Integer.MAX_VALUE;
                }

            }
            result = result * 10 + currentDigit;
        }
        return isNegative ? -result : result;
    }

}
