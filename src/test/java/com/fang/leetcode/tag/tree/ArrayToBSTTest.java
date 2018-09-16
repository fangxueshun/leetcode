package com.fang.leetcode.tag.tree;

import com.fang.leetcode.tag.util.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/16
 * Time: 16:27
 */
public class ArrayToBSTTest {

    @Test
    public void sortedArrayToBST() {
        int[] nums = new int[]{-10,-3,0,5,9};
        Assert.assertEquals("[\"0\",\"-3\",\"9\",\"-10\",\"null\",\"5\"]", TreeNode.toString(ArrayToBST.sortedArrayToBST(nums)));
    }
}