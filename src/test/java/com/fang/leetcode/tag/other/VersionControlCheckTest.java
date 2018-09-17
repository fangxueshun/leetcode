package com.fang.leetcode.tag.other;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/17
 * Time: 23:06
 */
public class VersionControlCheckTest {

    @Test
    public void testVersionControl(){
        Assert.assertEquals(2, VersionControlCheck.firstBadVersion(4));
    }

    @Test
    public void testVersionControlOptimized(){
        Assert.assertEquals(4, VersionControlCheck.firstBadVersionOptimized(5));
    }
}