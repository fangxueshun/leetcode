package com.fang.leetcode.tag.util.tree;

import com.google.gson.Gson;

import java.util.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/6
 * Time: 0:21
 */
public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;
    private static Gson gson = new Gson();
    public TreeNode(Integer val) {
        this.val = val;
    }


    public static String toString(TreeNode root) {
        List<String> target = new ArrayList<>();
        if (null == root) {
            return gson.toJson(target);
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode treeNodeTemp = queue.poll();
            Integer value = treeNodeTemp.val;
            if (null != treeNodeTemp.left) {
                queue.offer(treeNodeTemp.left);
            }
            else if (!queue.isEmpty() && value != null) {
                queue.offer(new TreeNode(null));
            }

            if (null != treeNodeTemp.right) {
                queue.offer(treeNodeTemp.right);
            }
            else if (!queue.isEmpty() && value != null) {
                queue.offer(new TreeNode(null));
            }

            if(null == value){
                target.add("null");
            }else {
                target.add(value+"");
            }


        }

        //去掉最后一层null节点并返回

        return gson.toJson(target).replaceAll("(,\"null\")+\\]$","]");
    }




    public static TreeNode initArray2Tree(String[] array) {
        if (null == array || array.length == 0) {
            return null;
        }
        if ("null".equals(array[0])) {
            throw new NullPointerException("root node should not be null");
        }
        TreeNode root = new TreeNode(Integer.valueOf(array[0]));
        int index = 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        //每次循环组装当前层节点的下一层节点，并将下层节点放入队列
        while (index<array.length){
            //下层节点数量为当前层数量的2倍
            int width = queue.size()<<1;

            for(int i = 0;i<width;i++){
                TreeNode treeNode = queue.poll();
                String leftValue = array[index];
                index++;
                if(!"null".equals(leftValue)){
                    treeNode.left=new TreeNode(Integer.valueOf(leftValue));
                    queue.offer(treeNode.left);
                }
                if(index==array.length){
                    return root;
                }
                String rightValue = array[index];
                index++;
                if(!"null".equals(rightValue)){
                    treeNode.right=new TreeNode(Integer.valueOf(rightValue));
                    queue.offer(treeNode.right);
                }
                if(index==array.length){
                    return root;
                }


            }
        }
        return root;
    }

    /**
     * 中旭遍历到数组
     * @return
     */
    public   List<Integer> middleOrderTraversal(){
        if(null == this){
            return null;
        }
        List<Integer> target = new ArrayList<>();
        if(null != this.left){
            target.addAll(this.left.middleOrderTraversal());
        }
        target.add(this.val);
        if(null != this.right){
            target.addAll(this.right.middleOrderTraversal());
        }
        return target;
    }

    public static String intArrayToStringArray(String str){
        List<String> list = new ArrayList<>();
        str  = str.replace("]","");
        str  = str.replace("[","");
        String[] elemens = str.split(",");
        for(String s :elemens){
            list.add(s);
        }
        return gson.toJson(list);
    }

    public static void main(String[] args) {
        System.out.println(intArrayToStringArray("[10,5,15,null,null,6,20]"));
    }



}
