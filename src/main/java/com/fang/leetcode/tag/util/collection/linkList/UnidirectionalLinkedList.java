package com.fang.leetcode.tag.util.collection.linkList;

/**
 * Author: fangxueshun
 * Description: 单向链表节
 * Date: 2018/8/20
 * Time: 22:16
 */
public class UnidirectionalLinkedList<E> {
    private transient int size = 0;
    private transient Node<E> first;
    private transient Node<E> last;

    public UnidirectionalLinkedList (){
    }

    public void add(E e){
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(e,null);
        last = newNode;
        if(l == null){
            first = newNode;
        }else {
            last.nextNode = newNode;
        }
        size++;
    }

    private static class Node<E>{
        E node;
        Node<E> nextNode;
        Node(E node, Node<E> nextNode){
            this.node = node;
            this.nextNode = nextNode;
        }
    }
}
