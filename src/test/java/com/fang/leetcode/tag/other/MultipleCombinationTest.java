package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/10/18
 * Time: 23:12
 */
public class MultipleCombinationTest {

    @Test
    public void singleSelectionComb() {
        Assert.assertEquals(new String[]{"13","14","23","24"},MultipleCombination.singleSelectionComb(new String[]{"1","2"}
        ,new String[]{"3","4"}));
    }
}