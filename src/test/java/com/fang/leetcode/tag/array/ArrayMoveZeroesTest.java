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
public class ArrayMoveZeroesTest {

    @Test
    public void moveZeroes() {
        Assert.assertArrayEquals(new int[]{},ArrayMoveZeroes.moveZeroes(new int[]{}));
        Assert.assertArrayEquals(new int[]{0},ArrayMoveZeroes.moveZeroes(new int[]{0}));
        Assert.assertArrayEquals(new int[]{0,0},ArrayMoveZeroes.moveZeroes(new int[]{0,0}));
        Assert.assertArrayEquals(new int[]{1,0},ArrayMoveZeroes.moveZeroes(new int[]{0,1}));
        Assert.assertArrayEquals(new int[]{1,3,12,0,0},ArrayMoveZeroes.moveZeroes(new int[]{0,1,0,3,12}));
        Assert.assertArrayEquals(new int[]{3,2,1,5,0,0,0},ArrayMoveZeroes.moveZeroes(new int[]{0,0,3,2,1,0,5}));
    }
}