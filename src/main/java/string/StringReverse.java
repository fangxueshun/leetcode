package string;


import util.EasyArray;

/**
 * Author: fangxueshun
 * Description:
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "olleh"
 * 示例 2:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: "amanaP :lanac a ,nalp a ,nam A"
 * <p>
 * Date: 2018/8/11
 * Time: 22:35
 */
public class StringReverse {

    /**
     * 题目比较简单，String类型使用数组存储的，本质上就是个数组反转
     *
     * @param s
     * @return
     */
    public static String reverseString(String s) {
        if (null == s || s.length() < 2) {
            return s;
        }
        char[] charArray = s.toCharArray();
        EasyArray.reverseCharArray(charArray);
        return new String(charArray);
    }

}
