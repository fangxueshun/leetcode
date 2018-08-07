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
public class ArrayDuplicateVeryfyTest {

    @Test
    public void containsDuplicate() {
        Assert.assertEquals(ArrayDuplicateVeryfy.containsDuplicate(new int[] {}),false);
        Assert.assertEquals(ArrayDuplicateVeryfy.containsDuplicate(new int[] {1,2,3,1}),true);
        Assert.assertEquals(ArrayDuplicateVeryfy.containsDuplicate(new int[] {4,3,2,4}),true);
        Assert.assertEquals(ArrayDuplicateVeryfy.containsDuplicate(new int[] {1,2,3,4}),false);
    }
}