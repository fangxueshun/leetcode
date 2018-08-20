package com.fang.leetcode.tag.util.collection.linkList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/20
 * Time: 23:51
 */
public class UnidirectionalLinkedListTest {

    @Test
    public void add() {
        UnidirectionalLinkedList<Integer> linkedList = new UnidirectionalLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.toString());
    }
}