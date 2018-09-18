package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 *  示例 1：
 *
 *  输入： 2
 *  输出： 2
 *  解释： 有两种方法可以爬到楼顶。
 *  1.  1 阶 + 1 阶
 *  2.  2 阶
 *  示例 2：
 *
 *  输入： 3
 *  输出： 3
 *  解释： 有三种方法可以爬到楼顶。
 *  1.  1 阶 + 1 阶 + 1 阶
 *  2.  1 阶 + 2 阶
 *  3.  2 阶 + 1 阶
 * Date: 2018/9/18
 * Time: 23:26
 */
public class climbStairsTest {

    @Test
    public void climbStairs() {
        Assert.assertEquals(2,ClimbStairs.climbStairs(2));
        Assert.assertEquals(3,ClimbStairs.climbStairs(3));
        Assert.assertEquals(1134903170,ClimbStairs.climbStairs(44));
    }

    @Test
    public void climbStairsByLoop() {
        Assert.assertEquals(2,ClimbStairs.climbStairsByLoop(2));
        Assert.assertEquals(3,ClimbStairs.climbStairsByLoop(3));
        Assert.assertEquals(1134903170,ClimbStairs.climbStairsByLoop(44));
    }
}