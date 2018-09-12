package com.fang.leetcode.tag.tree;

import com.fang.leetcode.tag.util.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/13
 * Time: 0:17
 */
public class TreeMaxDepthTest {

    @Test
    public void getTreeDeep() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        Assert.assertEquals(2, TreeMaxDepth.getTreeDeep(treeNode));
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(17);
        Assert.assertEquals(3, TreeMaxDepth.getTreeDeep(treeNode));
        treeNode.left.right = new TreeNode(19);
        Assert.assertEquals(3, TreeMaxDepth.getTreeDeep(treeNode));
    }
}