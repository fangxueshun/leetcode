package com.fang.leetcode.tag.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/6
 */
public class ArrayMaxProfitTest {

    @Test
    public void maxProfit() {
        int[] test = {7,1,5,3,6,4};
        int[] test2 = {2,3,4,5,6};
        int[] test3 = {3,2,1};
        int[] test4 = {6,1,3,2,4,7};
        int[] test5 = {1,2};
        int[] test6 = {2,1,2,0,1};
        int[] test7 = {2,1,2,1,0,1,2};
        assertEquals(ArrayMaxProfit.maxProfit(test),7);
        assertEquals(ArrayMaxProfit.maxProfit(test2),4);
        assertEquals(ArrayMaxProfit.maxProfit(test3),0);
        assertEquals(ArrayMaxProfit.maxProfit(test4),7);
        assertEquals(ArrayMaxProfit.maxProfit(test5),1);
        assertEquals(ArrayMaxProfit.maxProfit(test6),2);
        assertEquals(ArrayMaxProfit.maxProfit(test7),3);
    }
}