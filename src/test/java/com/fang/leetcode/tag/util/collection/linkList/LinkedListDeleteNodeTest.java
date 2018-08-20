package com.fang.leetcode.tag.util.collection.linkList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/21
 * Time: 0:51
 */
public class LinkedListDeleteNodeTest {

    @Test
    public void deleteNode() {
        UnidirectionalLinkedList linkedList = new UnidirectionalLinkedList();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(9);
        LinkedListDeleteNode.deleteNode(linkedList.get(2));
        Assert.assertEquals("4->5->9",linkedList.toString());



    }
}