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

    public UnidirectionalLinkedList() {
    }

    public Node<E> get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("index should be in 0 to "+(size - 1));
        }
        Node currentNode = first;
        for(int i = 0;i<=index;i++){
            if(i == index){
                return currentNode;
            }
            currentNode = currentNode.nextNode;
        }
        return currentNode;
    }

    public void add(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            /*final 修饰变量，基础类型值不可便，引用类型不能再指向新的引用*/
            l.nextNode = newNode;
        }
        size++;
    }

    public static class Node<E> {
        E value;
        Node<E> nextNode;

        private Node(E node, Node<E> nextNode) {
            this.value = node;
            this.nextNode = nextNode;
        }
    }

    @Override
    public String toString() {
        Node currentNode = first;
        StringBuilder stringBuilder = new StringBuilder();
        while (currentNode != null) {
            stringBuilder.append(currentNode.value + (currentNode.nextNode == null ? "" : "->"));
            currentNode = currentNode.nextNode;
        }
        return stringBuilder.toString();
    }
}
