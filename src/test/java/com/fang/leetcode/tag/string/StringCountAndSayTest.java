package com.fang.leetcode.tag.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/16
 */
public class StringCountAndSayTest {

    @Test
    public void countAndSay() {
        Assert.assertEquals("1",StringCountAndSay.countAndSay(1));
        Assert.assertEquals("1211",StringCountAndSay.countAndSay(4));
    }
}