package com.fang.leetcode.tag.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/9
 */
public class ArrayMatrixRotateTest {

    @Test
    public void rotate() {
        int[][] data1 = new int[][]{
                { 5, 1, 9,11},
                { 2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        int[][] result1 = new int[][]{
                {15,13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7,10,11}
        };
        ArrayMatrixRotate.rotate(data1);
        Assert.assertArrayEquals(result1,data1);
    }
}