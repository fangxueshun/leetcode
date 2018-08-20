package com.fang.leetcode.tag.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/17
 */
public class StringPrefixTest {

    @Test
    public void longestCommonPrefix() {
        Assert.assertEquals("fl",StringPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assert.assertEquals("",StringPrefix.longestCommonPrefix(new String[]{"flower","abc","flow","flight","abc"}));
        Assert.assertEquals("a",StringPrefix.longestCommonPrefix(new String[]{"ac","ac","a","a"}));
        Assert.assertEquals("",StringPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}