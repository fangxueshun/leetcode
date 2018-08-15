package com.fang.leetcode.tag.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/14
 */
public class StringPalindromeTest {

    @Test
    public void isPalindrome() {
        Assert.assertTrue(StringPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertTrue(StringPalindrome.isPalindrome("     "));
        Assert.assertFalse(StringPalindrome.isPalindrome("race a car"));
        Assert.assertFalse(StringPalindrome.isPalindrome("ab"));
    }
}