package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.UnidirectionalLinkedList;

import java.util.LinkedList;

/**
 * Author: fangxueshun
 * Description:
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 * Date: 2018/8/22
 * Time: 22:11
 */
public class LinkedListRemoveNthFromEnd {


    /**
     *
     * 双指针解法，快指针先前进n-1步，快指针再开始启动，因为n从1开始，所以可以保证快指针和慢指针相差n-1，比如n=1，则快慢指针相同
     * 要注意n=1，和只有一个节点的情况
     *
     * TODO 其他解法
     * @param head
     * @param n
     * @return
     */
    public static UnidirectionalLinkedList.Node removeNthFromEnd(UnidirectionalLinkedList.Node head, int n) {

        final UnidirectionalLinkedList.Node firstNode = head;

        UnidirectionalLinkedList.Node currentNode = head;
        UnidirectionalLinkedList.Node lowNode = head;
        //倒数第二个节点
        UnidirectionalLinkedList.Node preEndNode = null;
        for(int i = 0 ;i<n-1 ;i++){
            currentNode = currentNode.nextNode;
        }
        while (currentNode.nextNode != null){
            preEndNode = lowNode;
            lowNode = lowNode.nextNode;
            currentNode = currentNode.nextNode;
        }
        if(lowNode.nextNode == null){
            if(preEndNode == null){
                return null;
            }
            preEndNode.nextNode = null;
        }else {
            lowNode.value = lowNode.nextNode.value;
            lowNode.nextNode = lowNode.nextNode.nextNode;
        }


        return firstNode;
    }
}
