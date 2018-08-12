package com.fang.leetcode.tag.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/12
 * Time: 11:56
 */
public class StringReverseIntegerTest {

    @Test
    public void reverse() {

        Assert.assertEquals(321,StringReverseInteger.reverse(123));
        Assert.assertEquals(0,StringReverseInteger.reverse(0));
        Assert.assertEquals(-321,StringReverseInteger.reverse(-123));
        Assert.assertEquals(0,StringReverseInteger.reverse(Integer.MIN_VALUE));
        Assert.assertEquals(0,StringReverseInteger.reverse(Integer.MAX_VALUE));
        Assert.assertEquals(2147483641,StringReverseInteger.reverse(1463847412));

    }
}