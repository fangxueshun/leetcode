package com.fang.leetcode.tag.tree;

import com.fang.leetcode.tag.util.tree.TreeNode;

import java.util.Arrays;

/**
 * Author: fangxueshun
 * Description:
 * 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * Date: 2018/9/16
 * Time: 16:26
 */
public class ArrayToBST {

    /**
     * 通过递归的方式，每次完成一个节点的二叉搜索树生成
     * @param nums
     * @return
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        if(nums.length == 1){
            return new TreeNode(nums[0]);
        }
        int middleIndex = nums.length/2;
        TreeNode root = new TreeNode(nums[middleIndex]);
        //拷贝的数组是铅笔后开的区间
        int[] leftArray = Arrays.copyOfRange(nums,0,middleIndex);
        int[] rightArray = Arrays.copyOfRange(nums,middleIndex+1,nums.length);
        root.left = sortedArrayToBST(leftArray);
        root.right = sortedArrayToBST(rightArray);
        return root;
    }
}
