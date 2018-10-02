package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/10/2
 * Time: 23:04
 */
public class CountPrimesTest {

    @Test
    public void countPrimes() {
//        Assert.assertEquals(0,CountPrimes.countPrimes(1));
//        Assert.assertEquals(4,CountPrimes.countPrimes(10));
        Assert.assertEquals(1,CountPrimes.countPrimes(3));
        Assert.assertEquals(114155,CountPrimes.countPrimes(1500000));
    }
}