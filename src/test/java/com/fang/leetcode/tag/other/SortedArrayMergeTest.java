package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/9/17
 */
public class SortedArrayMergeTest {

    @Test
    public void merge() {
        int[] target = new int[]{1,2,3,0,0,0};
        int[] enums = new int[]{2,5,6};
        SortedArrayMerge.merge(target,3,enums,3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6},target);
    }
}