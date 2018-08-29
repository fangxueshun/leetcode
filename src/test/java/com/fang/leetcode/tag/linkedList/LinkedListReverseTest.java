package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.UnidirectionalLinkedList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/8/29
 */
public class LinkedListReverseTest {

    @Test
    public void reverseList() {
        UnidirectionalLinkedList linkedList = new UnidirectionalLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        LinkedListReverse.reverseList(linkedList);
        Assert.assertEquals("5->4->3->2->1",linkedList.toStringFromLastNode());
    }
    @Test
    public void reverseListByRecurse() {
        UnidirectionalLinkedList linkedList = new UnidirectionalLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        LinkedListReverse.reverseListByRecurse(linkedList);
        Assert.assertEquals("5->4->3->2->1",linkedList.toStringFromLastNode());
    }
}