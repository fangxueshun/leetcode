package com.fang.leetcode.tag.string;

/**
 * description
 * <p>
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 *
 * @author fangxueshun
 * @date 2018/8/14
 */
public class StringPalindrome {

    public static boolean isPalindrome(String s) {
        if (s == null ) {
            return false;
        }
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char startChar = chars[start];
            if ((startChar >= 'a' && startChar <= 'z') || (startChar >= '0' && startChar <= '9')) {
                while (end > start) {
                    char endChar = chars[end];
                    end--;
                    if ((endChar >= 'a' && endChar <= 'z') || (endChar >= '0' && endChar <= '9')) {
                        if(endChar != startChar){
                            return false;
                        }
                        break;
                    }

                }
            }
            start++;
        }
        return true;
    }

}
