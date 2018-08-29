package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.UnidirectionalLinkedList;

/**
 * description
 * <p>
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * @author fangxueshun
 * @date 2018/8/29
 */
public class LinkedListReverse {

    /**
     * 通过迭代反转链表，核心就是迭代的过程中，将当前节点的next节点赋值为上个节点
     * @param head
     * @return
     */
    public static UnidirectionalLinkedList reverseList(UnidirectionalLinkedList head) {
        UnidirectionalLinkedList.Node currentNode = head.first();
        UnidirectionalLinkedList.Node lastNode = null;
        while (currentNode != null) {
            /** 这里必须这样写，不能写成“final tempNode = currentNode”,后面“currentNode = tempNode.next”,因为final修饰引用时，
             * 只是指该引用不能变换，但是这里引用对象的内部变量还是可以变化的*/
            final UnidirectionalLinkedList.Node nextNode = currentNode.nextNode;
            currentNode.nextNode = lastNode;
            lastNode = currentNode;
            currentNode = nextNode;

        }

        return head;
    }

    /**
     * 通过递归的方式反转，TODO 原理待研究
     *
     * @param head
     * @return
     */
    public static UnidirectionalLinkedList reverseListByRecurse(UnidirectionalLinkedList head) {
        reverse(head.first());
        return head;
    }

    private static UnidirectionalLinkedList.Node reverse(UnidirectionalLinkedList.Node node){
        if(null == node || null == node.nextNode){
            return node;
        }
        UnidirectionalLinkedList.Node headNode = reverse(node.nextNode);
        node.nextNode.nextNode=node;
        node.nextNode=null;
        return headNode;
    }

}
