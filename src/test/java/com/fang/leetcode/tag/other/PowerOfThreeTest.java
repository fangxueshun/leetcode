package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 27
 * 输出: true
 * 示例 2:
 *
 * 输入: 0
 * 输出: false
 * 示例 3:
 *
 * 输入: 9
 * 输出: true
 * 示例 4:
 *
 * 输入: 45
 * 输出: false
 * Date: 2018/10/16
 * Time: 23:37
 */
public class PowerOfThreeTest {

    @Test
    public void isPowerOfThree() {
        Assert.assertEquals(true,PowerOfThree.isPowerOfThree(27));
        Assert.assertEquals(true,PowerOfThree.isPowerOfThree(1));
        Assert.assertEquals(true,PowerOfThree.isPowerOfThree(3));
        Assert.assertEquals(false,PowerOfThree.isPowerOfThree(0));
        Assert.assertEquals(false,PowerOfThree.isPowerOfThree(6));
        Assert.assertEquals(true,PowerOfThree.isPowerOfThree(9));
        Assert.assertEquals(false,PowerOfThree.isPowerOfThree(45));
    }
}