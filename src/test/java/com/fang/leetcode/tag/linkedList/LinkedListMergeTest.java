package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.UnidirectionalLinkedList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/9/1
 * Time: 22:50
 */
public class LinkedListMergeTest {

    /**
     *  输入：1->2->4, 1->3->4
     *  输出：1->1->2->3->4->4
     */
    @Test
    public void testMergeTwoLists(){

        UnidirectionalLinkedList list1 = new UnidirectionalLinkedList();

        UnidirectionalLinkedList list2 = new UnidirectionalLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        list2.add(1);
        list2.add(3);
        list2.add(4);
        UnidirectionalLinkedList resultList = LinkedListMerge.mergeTwoLists(list1,list2);
        Assert.assertEquals("1->1->2->3->4->4",resultList.toString());
    }

}