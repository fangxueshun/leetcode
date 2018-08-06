package com.fang.leetcode.tag.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/6
 */
public class ArrayRotateTest {

    @Test
    public void rotate() {
        int[] test = {1,2,3,4,5,6,7};
        int k = 3;
        int[] test2 = {-1,-100,3,99};
        int k2 = 2;
        int[] testExpectResult = {5,6,7,1,2,3,4};
        int [] testExpectResult2 = {3,99,-1,-100};
        ArrayRotate.rotate(test,k);
        ArrayRotate.rotate(test2,k2);
        assertArrayEquals(testExpectResult,test);
        assertArrayEquals(testExpectResult2,test2);
    }
}