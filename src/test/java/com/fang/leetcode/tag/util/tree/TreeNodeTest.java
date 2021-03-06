package com.fang.leetcode.tag.util.tree;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/11
 * Time: 0:15
 */
public class TreeNodeTest {
    private static Gson gson = new Gson();
    @Test
    public void testToString() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(17);
        Assert.assertEquals("[\"3\",\"9\",\"20\",\"null\",\"null\",\"15\",\"17\"]",TreeNode.toString(treeNode));
        Assert.assertEquals("[9,3,15,20,17]",gson.toJson(treeNode.middleOrderTraversal()));
    }


}