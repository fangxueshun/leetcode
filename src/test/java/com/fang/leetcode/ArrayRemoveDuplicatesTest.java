package com.fang.leetcode;

import com.fang.leetcode.tag.array.ArrayRemoveDuplicates;
import org.junit.Assert;
import org.junit.Test;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/6
 */
public class ArrayRemoveDuplicatesTest {

    @Test
    public void removeDuplicates() {
        int[] testNums = {1,2,3,4};
        int[] testNums1 = {1,1,2,2,2,3,4};
        int[] assertNums1 = {1,2,3,4,2,3,4};
        Assert.assertArrayEquals(ArrayRemoveDuplicates.removeDuplicates(testNums),testNums);
        Assert.assertArrayEquals(ArrayRemoveDuplicates.removeDuplicates(testNums1),assertNums1);
    }

}