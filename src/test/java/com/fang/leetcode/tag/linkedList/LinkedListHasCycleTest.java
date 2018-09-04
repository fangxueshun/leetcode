package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/9/3
 */
public class LinkedListHasCycleTest {

    @Test
    public void testHasCycle(){
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        head.next = node2;
        node2.next = node3;
        Assert.assertEquals(false,LinkedListHasCycle.hasCycle(head));
        Assert.assertEquals(false,LinkedListHasCycle.hasCycleBySlowFastPointer(head));
        node3.next=head;
        Assert.assertEquals(true,LinkedListHasCycle.hasCycle(head));
        Assert.assertEquals(true,LinkedListHasCycle.hasCycleBySlowFastPointer(head));
    }

}