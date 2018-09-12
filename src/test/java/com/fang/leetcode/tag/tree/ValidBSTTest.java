package com.fang.leetcode.tag.tree;

import com.fang.leetcode.tag.util.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/13
 * Time: 0:31
 */
public class ValidBSTTest {

    @Test
    public void isValidBST() {
        TreeNode treeNode = TreeNode.initArray2Tree(new String[]{"2","1","3"});
        TreeNode treeNode2 = TreeNode.initArray2Tree(new String[]{"5","1","4","null","null","3","6"});
        TreeNode treeNode3 = TreeNode.initArray2Tree(new String[]{"10","5","15","null","null","6","20"});
        Assert.assertTrue(ValidBST.isValidBST(treeNode));
        Assert.assertFalse(ValidBST.isValidBST(treeNode2));
        Assert.assertFalse(ValidBST.isValidBST(treeNode3));
    }
    @Test
    public void isValidBSTByRecursive() {
        TreeNode treeNode = TreeNode.initArray2Tree(new String[]{"2","1","3"});
        TreeNode treeNode2 = TreeNode.initArray2Tree(new String[]{"5","1","4","null","null","3","6"});
        TreeNode treeNode3 = TreeNode.initArray2Tree(new String[]{"10","5","15","null","null","14","20","6"});
        Assert.assertTrue(ValidBST.isValidBSTByRecursive(treeNode));
        Assert.assertFalse(ValidBST.isValidBSTByRecursive(treeNode2));
        Assert.assertFalse(ValidBST.isValidBSTByRecursive(treeNode3));
    }
}