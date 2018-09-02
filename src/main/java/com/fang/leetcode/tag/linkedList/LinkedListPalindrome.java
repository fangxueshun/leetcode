package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.ListNode;

/**
 * Author: fangxueshun
 * Description:
 *
 *
 请判断一个链表是否为回文链表。

 示例 1:

 输入: 1->2
 输出: false
 示例 2:

 输入: 1->2->2->1
 输出: true
 进阶：
 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * Date: 2018/9/3
 * Time: 0:41
 */
public class LinkedListPalindrome {

    /**
     * 快慢指针解法，快指针速度是慢指针的已被，快指针到结尾时，慢指针到达中间节点，注意链表长度的
     * 奇偶情况
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head){
        if (null == head ||head.next == null){
            return false;
        }

        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(fastNode == null){
                break;
            }
        }

        slowNode = slowNode.next;
        //反转慢指针后面的链表
        slowNode = linkedListReverse(slowNode);
        //判断是否回文
        while (slowNode != null){
            if(slowNode.val != head.val){
                return false;
            }
            slowNode = slowNode.next;
            head = head.next;
        }
        return true;
    }

    /**
     * @param node
     * @return
     */
    private static ListNode linkedListReverse(ListNode node) {
        if(null == node || null == node.next){
            return node;
        }
        ListNode head = linkedListReverse(node.next);
        node.next.next = node;
        node.next=null;
        return head;
    }
}
