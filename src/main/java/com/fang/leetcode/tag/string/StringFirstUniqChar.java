package com.fang.leetcode.tag.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: fangxueshun
 * Description:
 * <p>
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 * <p>
 * <p>
 * 注意事项：您可以假定该字符串只包含小写字母。
 * Date: 2018/8/12
 * Time: 23:09
 */
public class StringFirstUniqChar {

    /**
     * 使用HasSet保存重复的索引，比较耗时
     *
     * @param s
     * @return
     */
    public static int firstUniqCharLostTime(String s) {

        if (s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        char[] chars = s.toCharArray();
        s.lastIndexOf(chars[0]);
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (integers.contains(i)) {
                continue;
            }
            char temp = chars[i];
            boolean isRepeat = false;
            for (int j = i + 1; j < chars.length; j++) {
                if (integers.contains(j)) {
                    continue;
                }
                if (temp == chars[j]) {
                    isRepeat = true;
                    integers.add(j);
                }
            }
            if (!isRepeat) {
                return i;
            }

        }
        return -1;
    }


    /**
     * 使用String 自带的indexOf判断
     * TODO 查看String indexOf实现细节；
     *
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        int index = -1;
        for (char c = 'a'; c <= 'z'; c++) {
            int firstIndex = s.indexOf(c);
            if (firstIndex != -1 && firstIndex == s.lastIndexOf(c)) {
                index = index == -1 ? firstIndex : Math.min(index, firstIndex);
            }
        }
        return index;
    }
}
