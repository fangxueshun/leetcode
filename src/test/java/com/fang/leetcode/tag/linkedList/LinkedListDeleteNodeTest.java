package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.linkedList.LinkedListDeleteNode;
import com.fang.leetcode.tag.util.collection.linkList.UnidirectionalLinkedList;
import org.junit.Assert;
import org.junit.Test;

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