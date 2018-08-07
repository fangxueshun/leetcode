package com.fang.leetcode.tag.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/7
 * Time: 20:51
 */
public class ArrayIntersectTest {

    @Test
    public void intersect() {
        Assert.assertArrayEquals(new int[]{}, ArrayIntersect.intersect(new int[]{}, new int[]{}));
        Assert.assertArrayEquals(new int[]{}, ArrayIntersect.intersect(new int[]{1234}, new int[]{56789}));
        Assert.assertArrayEquals(new int[]{1,  2,3, 4}, ArrayIntersect.intersect(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{1, 2, 4}, ArrayIntersect.intersect(new int[]{1, 2, 4, 5, 6, 5, 6, 6, 6}, new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{2}, ArrayIntersect.intersect(new int[]{1, 2, 2, 1}, new int[]{2}));
    }
}