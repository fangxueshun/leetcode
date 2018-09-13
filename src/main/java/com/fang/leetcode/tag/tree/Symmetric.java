package com.fang.leetcode.tag.tree;

import com.fang.leetcode.tag.util.tree.TreeNode;

import java.util.Stack;

/**
 * Author: fangxueshun
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 说明:
 *
 * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 *
 * Description:
 * Date: 2018/9/14
 * Time: 1:16
 */
public class Symmetric {


    /**
     * 通过迭代的方式
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode root) {
        if(null == root || (null == root.left && null == root.right)){
            return true;
        }
        if(null == root.left || null == root.right){
            return false;
        }
        Stack<TreeNode> leftStack = new Stack<>();
        leftStack.push(root.left);
        Stack<TreeNode> rightStack = new Stack<>();
        rightStack.push(root.right);
        while (!leftStack.isEmpty()){
            TreeNode tempLeftNode = leftStack.pop();
            TreeNode tempRightNode = rightStack.pop();
            if(tempLeftNode.val != tempRightNode.val){
                return false;
            }
            if(null == tempLeftNode && null!= tempRightNode){
                return false;
            }
            if(null == tempRightNode && null!= tempLeftNode){
                return false;
            }

            if(null != tempLeftNode.left){
                leftStack.push(tempLeftNode.left);
            }
            else {
                if(null != tempRightNode.right){
                    return false;
                }
            }


            if(null != tempLeftNode.right){
                leftStack.push(tempLeftNode.right);
            }
            else {
                if(null != tempRightNode.left){
                    return false;
                }
            }

            //镜像对称，右子树先让右边入栈
            if(null != tempRightNode.right){
                rightStack.push(tempRightNode.right);
            }
            if(null != tempRightNode.left){
                rightStack.push(tempRightNode.left);
            }

            if(leftStack.size() != rightStack.size()){
                return false;
            }

        }
        return true;

    }


    /**
     * 递归
     *
     * @param root
     * @return
     */
    public static boolean isSymmetricByRecuresive(TreeNode root){
        if(null == root || (null == root.left && null == root.right)){
            return true;
        }
        if(null == root.left || null == root.right){
            return false;
        }
        return isMirror(root.left,root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        if(null == left & null == right){
            return true;
        }
        if(null == left || null == right){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }

}
