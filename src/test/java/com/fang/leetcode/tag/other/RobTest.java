package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/25
 * Time: 23:33
 */
public class RobTest {

    @Test
    public void rob() {
        Assert.assertEquals(4,Rob.rob(new int[]{1,2,3,1}));
        Assert.assertEquals(12,Rob.rob(new int[]{2,7,9,3,1}));
        Assert.assertEquals(2,Rob.rob(new int[]{2,1}));
        Assert.assertEquals(4,Rob.rob(new int[]{2,1,1,2}));
    }
}