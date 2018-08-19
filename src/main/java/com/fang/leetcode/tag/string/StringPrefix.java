package com.fang.leetcode.tag.string;

/**
 * description
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 *
 * @author fangxueshun
 * @date 2018/8/17
 */
public class StringPrefix {

    public static void main(String[] args) {
        String test = "";
        test.startsWith(test);
    }

    /**
     * 将前两个字符串的最大前缀求出，用该前缀依次比对剩余的字符串，得到结果，较耗时
     *其他解法：利用String 类的String.startWith方法
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder prefixBuilder = new StringBuilder();
        char[] statStringArray = strs[0].toCharArray();
        char[] secondStr = strs[1].toCharArray();
        if(statStringArray.length == 0){
            return "";
        }
        for(int i = 0;i< statStringArray.length;i++){
            if(i>=secondStr.length){
                break;
            }
            if(statStringArray[i] ==secondStr[i]){
                prefixBuilder.append(statStringArray[i]);
            }else {
                break;
            }
        }
        int index = 2;
        while (index < strs.length && prefixBuilder.length() != 0){
            String currentStr = strs[index];
            if(currentStr.length() == 0){
                return "";
            }
            if(prefixBuilder.length() != 0){
                char[] prefixArray = prefixBuilder.toString().toCharArray();
                for(int i = 0;i< prefixArray.length;i++){
                    if(i>=currentStr.length() ||prefixArray[i] !=currentStr.charAt(i)){
                        prefixBuilder.delete(i,prefixBuilder.length());
                        break;
                    }
                }
            }
            index++;
        }
        return prefixBuilder.toString();
    }
}
