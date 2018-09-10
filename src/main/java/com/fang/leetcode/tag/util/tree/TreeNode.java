package com.fang.leetcode.tag.util.tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/6
 * Time: 0:21
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }


    public static String toString(TreeNode treeNode) {
        if (null == treeNode) {
            return "[]";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[" + treeNode.val);

        int deep = getTreeDeep(treeNode);


        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    /**
     *
     * 使用递归解法，从叶子节点开始，每次返回子树的深度（最小单元深度为0或1），每次加1
     *：对任意一个子树的根节点来说，它的深度=左右子树深度的最大值+1
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
        return leftDeep > rightDeep ? leftDeep+1 : rightDeep+1;
    }


    /**
     * 经典的非递归层次遍历：利用辅助队列，先将头节点入队列，当队列不空时出队列的节点记为current，
     * 当current左节点不空时入队列，其右节点不空时入队列，如此循环即可。
     * 求深度：构造变量cur记录当前层访问到的节点数，width记录当前层的总个数，每当访问过一层层数deep++；
     * 此种方法同时可以求最大宽度，访问第几层的第几个节点，是一种通用方法
     * @param treeNode
     * @return
     */
    public static int getTreeDeepByStack(TreeNode treeNode,int d,int n) {
        TreeNode result=null;
        TreeNode current;					//记录当前节点
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();		//声明辅助队列
        int cur, width , deep=0 , maxwidth=0;			//cur记录当前层所访问的个数，width为当前层的个数,deep记录层数
        queue.offer(treeNode);
        while(!queue.isEmpty()){
            cur=0;
            width=queue.size();						//当前队列中所含元素的个数便是该层树的宽度
            if(width>maxwidth)	maxwidth=width;		//若当前宽度大于最大宽度，则将当前宽度设为最大宽度
            while(cur<width){
                current=queue.poll();
                if(deep+1==d&&cur+1==n)					//找到符合条件的节点
                    result=current;
                if(current.left!=null)		//左节点存在则入队列
                    queue.offer(current.left);

                if(current.right!=null)	//右节点存在则入队列
                    queue.offer(current.right);
                cur++;
            }
            deep++;
        }
        System.out.println("当前二叉树的深度为:"+deep+ " 其最大层数为："+maxwidth);
        System.out.println("该二叉树中第"+d+"层的第"+n+"个节点值为:"+result.val);
        return maxwidth;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.left.left = new TreeNode(51);
        treeNode.right.left.right = new TreeNode(52);
        treeNode.right.right = new TreeNode(6);
        treeNode.right.right.left = new TreeNode(61);
        treeNode.right.right.right = new TreeNode(62);
        System.out.println(toString(treeNode));
    }


    public static TreeNode initArray2Tree(String[] array) {
        if (null == array || array.length == 0) {
            return null;
        }
        if ("null".equals(array[0])) {
            throw new NullPointerException("root node should not be null");
        }
        TreeNode root = new TreeNode(Integer.valueOf(array[0]));
        TreeNode currentNode = root;
        for (int i = 1; i < array.length; i++) {
            //判断当前指针指向节点非null；
            if (null == currentNode) {
                continue;
            }
            String currentStringValue = array[i];
            TreeNode tempNode = null;
            if (!"null".equals(currentStringValue)) {
                tempNode = new TreeNode(Integer.valueOf(currentStringValue));
            }
            //先向左子树赋值
            if (null == currentNode.left) {
                currentNode.left = tempNode;
            }
            //向右子树赋值
            else if (null == currentNode.right) {
                currentNode.right = tempNode;
                currentNode = currentNode.left;
            } else if (null == currentNode.left) {
                currentNode = currentNode.left;
            } else if (null == currentNode.right) {
                currentNode = currentNode.right;
            }

        }
        return root;
    }


}
