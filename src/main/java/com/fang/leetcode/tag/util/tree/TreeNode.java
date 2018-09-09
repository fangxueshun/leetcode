package com.fang.leetcode.tag.util.tree;

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

    public TreeNode(int val){
        this.val = val;
    }


    private static String toString(TreeNode treeNode){
        if(null == treeNode){
            return "null,";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(treeNode.val+",");
        stringBuilder.append(toString(treeNode.left));
        stringBuilder.append(toString(treeNode.right));
        return stringBuilder.toString();
    }



    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
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

    public static TreeNode initArray2Tree(String[] array){
        if(null == array || array.length == 0){
            return null;
        }
        if("null".equals(array[0])){
            throw new NullPointerException("root node should not be null");
        }
        TreeNode root = new TreeNode(Integer.valueOf(array[0]));
        TreeNode currentNode = root;
        for(int i=1;i<array.length;i++){
            //判断当前指针指向节点非null；
            if(null == currentNode){
                continue;
            }
            String currentStringValue = array[i];
            TreeNode tempNode = null;
            if(!"null".equals(currentStringValue)){
                tempNode = new TreeNode(Integer.valueOf(currentStringValue));
            }
            //先向左子树赋值
            if(null == currentNode.left){
                currentNode.left=tempNode;
            }
            //向右子树赋值
            else if(null == currentNode.right){
                currentNode.right = tempNode;
                currentNode = currentNode.left;
            }
            else if(null == currentNode.left){
                currentNode = currentNode.left;
            }
            else if(null == currentNode.right){
                currentNode = currentNode.right;
            }

        }
        return root;
    }


}
