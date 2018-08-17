package com.fang.leetcode.tag.string;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/16
 * Time: 1:26
 */
public class StringstrTest {

    @Test
    public void strStr() {
        Assert.assertEquals(4, Stringstr.strStr("mississippi","issip"));
        Assert.assertEquals(2, Stringstr.strStr("hello","ll"));
        Assert.assertEquals(0, Stringstr.strStr("a",""));
        Assert.assertEquals(-1, Stringstr.strStr("aaab","c"));
    }
}