package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.UnidirectionalLinkedList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/22
 * Time: 23:17
 */
public class LinkedListRemoveNthFromEndTest {

    @Test
    public void removeNthFromEnd() {
        UnidirectionalLinkedList linkedList = new UnidirectionalLinkedList();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(9);
        LinkedListRemoveNthFromEnd.removeNthFromEnd(linkedList.first(),2);
        Assert.assertEquals("4->5->9",linkedList.toString());
    }

    @Test
    public void removeNthFromEndLast() {
        UnidirectionalLinkedList linkedList = new UnidirectionalLinkedList();
        linkedList.add(4);
        linkedList.add(5);
        LinkedListRemoveNthFromEnd.removeNthFromEnd(linkedList.first(),1);
        Assert.assertEquals("4",linkedList.toString());
    }

//    @Test
//    public void removeNthFromEndEmpty() {
//        UnidirectionalLinkedList linkedList = new UnidirectionalLinkedList();
//        linkedList.add(4);
//        LinkedListRemoveNthFromEnd.removeNthFromEnd(linkedList.first(),1);
//        Assert.assertEquals("",linkedList.toString());
//    }
}