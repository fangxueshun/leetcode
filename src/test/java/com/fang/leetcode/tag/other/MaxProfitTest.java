package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/19
 * Time: 22:54
 */
public class MaxProfitTest {

    @Test
    public void maxProfit() {
        Assert.assertEquals(5,MaxProfit.maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0,MaxProfit.maxProfit(new int[]{7,6,4,3,1}));
    }
    @Test
    public void maxProfitByOneLoop() {
        Assert.assertEquals(5,MaxProfit.maxProfitByOneLoop(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0,MaxProfit.maxProfitByOneLoop(new int[]{7,6,4,3,1}));
        Assert.assertEquals(1,MaxProfit.maxProfitByOneLoop(new int[]{1,2}));
    }
}