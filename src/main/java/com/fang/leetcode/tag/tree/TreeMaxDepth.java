package com.fang.leetcode.tag.tree;

import com.fang.leetcode.tag.util.tree.TreeNode;

import java.util.LinkedList;

/**
 * Author: fangxueshun
 * Description:
 *
 *
 给定一个二叉树，找出其最大深度。

 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

 说明: 叶子节点是指没有子节点的节点。

 示例：
 给定二叉树 [3,9,20,null,null,15,7]，

 3
 / \
 9  20
 /  \
 15   7
 返回它的最大深度 3 。
 *
 * Date: 2018/9/6
 * Time: 0:20
 */
public class TreeMaxDepth {
    /**
     * 使用递归解法，从叶子节点开始，每次返回子树的深度（最小单元深度为0或1），每次加1
     * ：对任意一个子树的根节点来说，它的深度=左右子树深度的最大值+1
     *
     * @param treeNode
     * @return
     */
    public static int getTreeDeep(TreeNode treeNode) {
        if (null == treeNode) {
            return 0;
        }
//        if (treeNode.left == null && treeNode.right == null) {
////            return 1;
////        }
////        int leftDeep = 1;
////        int rightDeep = 1;
////        if (treeNode.left != null) {
////            leftDeep = leftDeep+ getTreeDeep(treeNode.left);
////        }
////        if (treeNode.right != null) {
////            rightDeep = rightDeep + getTreeDeep(treeNode.right);
////        }
        int leftDeep = getTreeDeep(treeNode.left);
        int rightDeep = getTreeDeep(treeNode.right);
        return leftDeep > rightDeep ? leftDeep + 1 : rightDeep + 1;
    }


    /**
     * 经典的非递归层次遍历：利用辅助队列，先将头节点入队列，当队列不空时出队列的节点记为current，
     * 当current左节点不空时入队列，其右节点不空时入队列，如此循环即可。
     * 求深度：构造变量cur记录当前层访问到的节点数，width记录当前层的总个数，每当访问过一层层数deep++；
     * 此种方法同时可以求最大宽度，访问第几层的第几个节点，是一种通用方法
     *
     * @param treeNode
     * @return
     */
    public static int getTreeDeepByStack(TreeNode treeNode, int d, int n) {
        TreeNode result = null;
        TreeNode current;                    //记录当前节点
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();        //声明辅助队列
        int cur, width, deep = 0, maxwidth = 0;            //cur记录当前层所访问的个数，width为当前层的个数,deep记录层数
        queue.offer(treeNode);
        while (!queue.isEmpty()) {
            cur = 0;
            width = queue.size();                        //当前队列中所含元素的个数便是该层树的宽度
            if (width > maxwidth) maxwidth = width;        //若当前宽度大于最大宽度，则将当前宽度设为最大宽度
            while (cur < width) {
                current = queue.poll();
                if (deep + 1 == d && cur + 1 == n)                    //找到符合条件的节点
                    result = current;
                if (current.left != null)        //左节点存在则入队列
                    queue.offer(current.left);

                if (current.right != null)    //右节点存在则入队列
                    queue.offer(current.right);
                cur++;
            }
            deep++;
        }
        System.out.println("当前二叉树的深度为:" + deep + " 其最大层数为：" + maxwidth);
        System.out.println("该二叉树中第" + d + "层的第" + n + "个节点值为:" + result.val);
        return maxwidth;
    }
}
