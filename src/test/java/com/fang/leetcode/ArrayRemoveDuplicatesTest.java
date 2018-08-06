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
        int[] testNums2 = {-1,0,0,0,0,3,3};
        int[] testNums3 = {-3,-1};
        int[] testNums4 = {1,1,2};
        Assert.assertEquals(ArrayRemoveDuplicates.removeDuplicates(testNums),4);
        Assert.assertEquals(ArrayRemoveDuplicates.removeDuplicates(testNums1),4);
        Assert.assertEquals(ArrayRemoveDuplicates.removeDuplicates(testNums2),3);
        Assert.assertEquals(ArrayRemoveDuplicates.removeDuplicates(testNums3),2);
        Assert.assertEquals(ArrayRemoveDuplicates.removeDuplicates(testNums4),2);
    }

}