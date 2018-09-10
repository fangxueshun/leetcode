package com.fang.leetcode.tag.util.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/11
 * Time: 0:15
 */
public class TreeNodeTest {

    @Test
    public void testToString() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(17);
        Assert.assertEquals("[3,9,20,null,null,15,7]",TreeNode.toString(treeNode));
    }

    @Test
    public void testToTreeDeep() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        Assert.assertEquals(2,TreeNode.getTreeDeep(treeNode));
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(17);
        Assert.assertEquals(3,TreeNode.getTreeDeep(treeNode));
        treeNode.left.right=new TreeNode(19);
        Assert.assertEquals(3,TreeNode.getTreeDeep(treeNode));
    }
}