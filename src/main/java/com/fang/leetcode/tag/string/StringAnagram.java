package com.fang.leetcode.tag.string;

import java.util.Arrays;

/**
 * Author: fangxueshun
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * <p>
 *
 * TODO 支持Unicode的解法
 * Description:
 * Date: 2018/8/13
 * Time: 23:30
 */
public class StringAnagram {

    public static void main(String[] args) {
        String test = "aDc123";
        test.length();
        System.out.println(test.toLowerCase());
        System.out.println((int) 'Z');
        
        System.out.println(Character.digit('a',10));
    }

    /**
     * 第一种方法：先排序，然后一一验证，不支持Unicode 时间复杂度O（n）
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagramLostTime(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tchars);

        for (int i = 0, j = schars.length - 1; i <= j; i++, j--) {
            if (tchars[i] != schars[i] || tchars[j] != schars[j]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 利用英文字母总数固定不变的特性，记录每个单词出现的次数，验证两个数组字符串次数是否相同；
     * 一共27个字母，利用索引代表字母顺序，如wordsTable[0]='a'
     * char类型中英文字母是顺序对应的，其中'a'=97,b='98'
     *
     * 不支持Unicode
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        //第一行表示s,第二行表示t
        int[][] wordsTable = new int[2][27];

        for (int i = 0; i < schars.length; i++) {
            wordsTable[0][schars[i]-97]++;
            wordsTable[1][tchars[i]-97]++;;
        }

        for (int i = 0; i < 27; i++) {
            if(wordsTable[0][i] != wordsTable[1][i] ){
                return false;
            }
        }
        return true;
    }


}
