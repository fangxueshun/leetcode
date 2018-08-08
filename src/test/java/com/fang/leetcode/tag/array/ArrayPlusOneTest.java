package com.fang.leetcode.tag.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/8
 */
public class ArrayPlusOneTest {

    @Test
    public void plusOne() {
        Assert.assertArrayEquals(new int[]{1},ArrayPlusOne.plusOne(new int[]{0}));
        Assert.assertArrayEquals(new int[]{1,0,0},ArrayPlusOne.plusOne(new int[]{9,9}));
        Assert.assertArrayEquals(new int[]{1,2,4,4},ArrayPlusOne.plusOne(new int[]{1,2,4,3}));
    }
}