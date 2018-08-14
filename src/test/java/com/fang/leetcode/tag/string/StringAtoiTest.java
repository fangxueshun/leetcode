package com.fang.leetcode.tag.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/14
 * Time: 23:48
 */
public class StringAtoiTest {

    @Test
    public void myAtoi() {
        Assert.assertEquals(0,StringAtoi.myAtoi("   - 321"));
        Assert.assertEquals(0,StringAtoi.myAtoi("-   234"));
        Assert.assertEquals(0,StringAtoi.myAtoi("   +0 123"));
        Assert.assertEquals(42,StringAtoi.myAtoi("42"));
        Assert.assertEquals(-12,StringAtoi.myAtoi("  -0012a42"));
        Assert.assertEquals(-42,StringAtoi.myAtoi("   -42"));
        Assert.assertEquals(4193,StringAtoi.myAtoi("4193 with words"));
        Assert.assertEquals(0,StringAtoi.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648,StringAtoi.myAtoi("-91283472332"));
        Assert.assertEquals(0,StringAtoi.myAtoi("-"));
        Assert.assertEquals(-1,StringAtoi.myAtoi("-1"));
        Assert.assertEquals(0,StringAtoi.myAtoi("-0"));
        Assert.assertEquals(1,StringAtoi.myAtoi("+1"));
        Assert.assertEquals(1,StringAtoi.myAtoi("    +1"));
        Assert.assertEquals(0,StringAtoi.myAtoi("    +-1"));
    }
}