package com.fang.leetcode.tag.tree;

import com.fang.leetcode.tag.util.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *  *
 *  *     1
 *  *    / \
 *  *   2   2
 *  *  / \ / \
 *  * 3  4 4  3
 *  * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *  *
 *  *     1
 *  *    / \
 *  *   2   2
 *  *    \   \
 *  *    3    3
 * Date: 2018/9/14
 * Time: 1:19
 */
public class SymmetricTest {


    public static void main(String[] args) {
        System.out.println(TreeNode.intArrayToStringArray("[1,2,2,null,3,null,3]"));
    }

    @Test
    public void isSymmetric() {
        TreeNode treeNode = TreeNode.initArray2Tree(new String[]{"1","2","2","3","4","4","3"});
        TreeNode treeNode2 = TreeNode.initArray2Tree(new String[]{"1","2","2","null","3","null","3"});

        Assert.assertTrue(Symmetric.isSymmetric(treeNode));
        Assert.assertFalse(Symmetric.isSymmetric(treeNode2));
    }

    @Test
    public void isSymmetricByRecursive() {
        TreeNode treeNode = TreeNode.initArray2Tree(new String[]{"1","2","2","3","4","4","3"});
        TreeNode treeNode2 = TreeNode.initArray2Tree(new String[]{"1","2","2","null","3","null","3"});

        Assert.assertTrue(Symmetric.isSymmetricByRecuresive(treeNode));
        Assert.assertFalse(Symmetric.isSymmetricByRecuresive(treeNode2));
    }
}