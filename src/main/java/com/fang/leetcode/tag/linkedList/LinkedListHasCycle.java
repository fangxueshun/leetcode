package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.ListNode;

/**
 * description
 *给定一个链表，判断链表中是否有环。
 *
 * 进阶：
 * 你能否不使用额外空间解决此题？
 * @author fangxueshun
 * @date 2018/9/3
 */
public class LinkedListHasCycle {

    /**
     * 对链表节点进行循环，每个节点和之前的节点比较，看是否出现相同的节点，出现则代表有环
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head){
        if(null == head || null == head.next){
            return false;
        }
        int times = 1;
        ListNode nextNode = head.next;
        while (nextNode != null){
            ListNode tempNode = head;
            for(int i =0;i<times;i++){
                if(tempNode == nextNode){
                    return true;
                }
                tempNode = tempNode.next;
            }
            nextNode = nextNode.next;
            times++;
        }
        return false;
    }

    /**
     * 通过快慢指针进行解答，慢指针每次前进一个节点，快指针每次前进两个节点，如果两个指针相遇则代表有环
     * @param head
     * @return
     */
    public static boolean hasCycleBySlowFastPointer(ListNode head){
        if(null == head || null == head.next){
            return false;
        }
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (fastNode != null){
            if(slowNode == fastNode){
                return true;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next;
            if(null == fastNode){
                return false;
            }
            fastNode = fastNode.next;
        }
        return false;
    }
}
