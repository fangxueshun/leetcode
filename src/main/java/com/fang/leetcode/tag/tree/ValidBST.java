package com.fang.leetcode.tag.tree;

import com.fang.leetcode.tag.util.tree.TreeNode;

import java.util.Stack;

/**
 * Author: fangxueshun
 * Description:
 * <p>
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 假设一个二叉搜索树具有如下特征：
 * <p>
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 * <p>
 * 输入:
 * 2
 * / \
 * 1   3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:
 * 5
 * / \
 * 1   4
 * / \
 * 3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 * 根节点的值为 5 ，但是其右子节点值为 4 。
 *
 * 注意：左子树的所有节点都要比根节点小，而非只是其左孩子比其小，右子树同样。所以判断左右孩子是BST，并不能证明整棵树就是BST。
 * Date: 2018/9/13
 * Time: 0:31
 */
public class ValidBST {

    /**
     * 满足二叉树时的中序遍历是升序的，将中序遍历的结果存入堆栈，则pop时降序
     *
     * @param root
     * @return
     */
    public static boolean isValidBST(TreeNode root) {
        if (null == root) {
            return true;//空树和只有一个节点的树定义为二叉查找树
        }
        Stack<Integer> stack = midleOrder(root, new Stack<>());
        int temp = stack.pop();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (cur >= temp) {
                return false;
            }
            temp = cur;
        }
        return true;
    }

    public static Stack<Integer> midleOrder(TreeNode treeNode, Stack<Integer> stack) {
        if (null == treeNode) {
            return stack;
        }
        if (null != treeNode.left) {
            midleOrder(treeNode.left, stack);
        }
        stack.push(treeNode.val);
        if (null != treeNode.right) {
            midleOrder(treeNode.right, stack);
        }
        return stack;
    }

    /**
     * 通过递归验证
     *
     * 思路：从根节点开始递归，遍历所有的节点。并且在每个节点处，分别遍历其左右子树，判断其左子树的最大值比其小，右子树的最小值比其大。
     * @param root
     * @return
     */
    public static boolean isValidBSTByRecursive(TreeNode root) {
        if (root == null) return true;
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean valid(TreeNode root, long low, long high) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= high){
            return false;
        }
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }

}
