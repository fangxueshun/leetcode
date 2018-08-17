package com.fang.leetcode.tag.string;

/**
 * description
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 *
 * @author fangxueshun
 * @date 2018/8/16
 */
public class StringCountAndSay {

    /**
     * 完成应方法，根据已当前字符串，求下一个字符串。
     * 引入两个临时变量，连续字符出现的次数和上个字符
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("line should great than 0");
        }
        if(n == 1){
            return "1";
        }
        if(n == 2){
            return "11";
        }
        String target = "11";
        int lineIndex = 2;
        while (lineIndex < n) {
            target = nextString(target);
            lineIndex ++;
        }
        return target;
    }

    private static String nextString(String str) {

        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        char lastChar = chars[0];
        for(int i = 1;i < chars.length;i++){
            char c = chars[i];
            if(c == lastChar){
                count++;
                if(i == chars.length-1){
                    stringBuilder.append(count);
                    stringBuilder.append(lastChar);
                }
                continue;
            }
            stringBuilder.append(count);
            stringBuilder.append(lastChar);
            count=1;
            if(i == chars.length-1){
                stringBuilder.append(count);
                stringBuilder.append(c);
            }
            lastChar=c;
        }

        return stringBuilder.toString();
    }
}
