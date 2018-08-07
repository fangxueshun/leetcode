package com.fang.leetcode.tag.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/7
 */
public class ArraySingleNumberTest {

    @Test
    public void singleNumber() {
        Assert.assertEquals(2,ArraySingleNumber.singleNumber(new int[] {1,2,1,3,3}));
        Assert.assertEquals(0,ArraySingleNumber.singleNumber(new int[] {}));
        Assert.assertEquals(8,ArraySingleNumber.singleNumber(new int[] {4,5,6,4,5,6,8}));

    }
}