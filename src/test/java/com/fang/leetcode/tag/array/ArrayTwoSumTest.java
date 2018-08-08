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
public class ArrayTwoSumTest {

    @Test
    public void twoSum() {
        Assert.assertArrayEquals(new int[]{},ArrayTwoSum.twoSum(new int[]{},9));
        Assert.assertArrayEquals(new int[]{3,4},ArrayTwoSum.twoSum(new int[]{1,2,3,4,5},9));
        Assert.assertArrayEquals(new int[]{4,6},ArrayTwoSum.twoSum(new int[]{5,4,17,2,7,12,3},10));
        Assert.assertArrayEquals(new int[]{0,1},ArrayTwoSum.twoSum(new int[]{2, 7, 11, 15},9));
        Assert.assertArrayEquals(new int[]{0,2},ArrayTwoSum.twoSum(new int[]{-3,4,3,90},0));
    }
}