package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 *
 示例 1:

 输入: 1->2
 输出: false
 示例 2:

 输入: 1->2->2->1
 输出: true
 * Date: 2018/9/3
 * Time: 0:52
 */
public class LinkedListPalindromeTest {

    @Test
    public void isPalindrome() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        head.next=node2;
        Assert.assertEquals(false,LinkedListPalindrome.isPalindrome(head));
        node2.next = node3;
        node3.next=node4;
        Assert.assertEquals(true,LinkedListPalindrome.isPalindrome(head));
    }

    @Test
    public void isPalindromeOdd()  {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        head.next = node2;
        node2.next = node3;
        Assert.assertEquals(true,LinkedListPalindrome.isPalindrome(head));

    }
}