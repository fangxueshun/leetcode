package com.fang.leetcode.tag.string;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/16
 *
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 * Time: 1:21
 */
public class Stringstr {


    /**
     *
     * 该解法，比java原生解法要慢
     * 使用快慢指针，需要注意指针回退的情况，
     * 如(miis,is),当匹配到s不匹配时，快指针要回退到第二个i，慢指针置0
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if(haystack == null ||needle == null || needle.length()>haystack.length()){
            return -1;
        }
        if(needle.length() == 0){
            return 0;
        }
        char[] hayChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int fastIndex = 0;
        int lowIndex = 0;
        boolean isMatched = false;
        while(fastIndex < hayChars.length){
            if(hayChars[fastIndex] == needleChars[lowIndex]){
                isMatched = true;
                if(lowIndex == needleChars.length-1){
                    return fastIndex-lowIndex;
                }
                fastIndex++;
                lowIndex++;
                continue;
            }
            if(!isMatched){
                fastIndex++;
                continue;
            }
            //遇到不相等的情况，慢指针置空,快指针要后移,匹配置为false
            fastIndex=fastIndex - lowIndex+1;
            lowIndex=0;
            isMatched = false;
        }
        return -1;

    }
}
