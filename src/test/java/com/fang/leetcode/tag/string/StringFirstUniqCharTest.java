package com.fang.leetcode.tag.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/12
 * Time: 23:10
 */
public class StringFirstUniqCharTest {

    @Test
    public void firstUniqChar() {
        Assert.assertEquals(-1,StringFirstUniqChar.firstUniqChar("aadadaad"));
        Assert.assertEquals(0,StringFirstUniqChar.firstUniqChar("leetcode"));
        Assert.assertEquals(2,StringFirstUniqChar.firstUniqChar("loveleetcode"));
        Assert.assertEquals(-1,StringFirstUniqChar.firstUniqChar("aabbccddee"));
    }
}