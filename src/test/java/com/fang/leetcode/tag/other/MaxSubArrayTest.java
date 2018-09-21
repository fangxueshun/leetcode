package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/21
 * Time: 23:27
 */
public class MaxSubArrayTest {

    @Test
    public void maxSubArray() {
        Assert.assertEquals(6,MaxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(3,MaxSubArray.maxSubArray(new int[]{1,2}));
    }
}