package com.fang.leetcode.tag.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/11
 * Time: 22:56
 */
public class StringReverseTest {

    @Test
    public  void TestStringReverse() {
        Assert.assertEquals("abcd", StringReverse.reverseString("dcba"));
        Assert.assertEquals("A man, a plan, a canal: Panama", StringReverse.reverseString("amanaP :lanac a ,nalp a ,nam A"));
        Assert.assertEquals("olleh", StringReverse.reverseString("hello"));
    }

}