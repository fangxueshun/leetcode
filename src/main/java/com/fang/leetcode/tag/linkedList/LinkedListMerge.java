package com.fang.leetcode.tag.linkedList;

import com.fang.leetcode.tag.util.collection.linkList.UnidirectionalLinkedList;

/**
 * Author: fangxueshun
 * Description:
 *
 *
 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

 示例：

 输入：1->2->4, 1->3->4
 输出：1->1->2->3->4->4
 *
 * Date: 2018/9/1
 * Time: 22:48
 */
public class LinkedListMerge {

    /**
     *
     * 该解法不对，题目理解错误，题目要求合并后的列表也是有序的
     * @param list1
     * @param list2
     * @return
     */
    public static UnidirectionalLinkedList mergeTwoLists(UnidirectionalLinkedList list1,UnidirectionalLinkedList list2){
        UnidirectionalLinkedList.Node currentList1Node = list1.first();
        UnidirectionalLinkedList.Node currentList2Node = list2.first();
        UnidirectionalLinkedList unidirectionalLinkedList = new UnidirectionalLinkedList();
        while (currentList1Node !=null){
            unidirectionalLinkedList.add(currentList1Node.value);
            if(null == currentList2Node ){
                while (currentList1Node.nextNode != null){
                    currentList1Node = currentList1Node.nextNode;
                    unidirectionalLinkedList.add(currentList1Node.value);
                }
                return unidirectionalLinkedList;
            }

            unidirectionalLinkedList.add(currentList2Node.value);

            currentList1Node = currentList1Node.nextNode;
            currentList2Node = currentList2Node.nextNode;
        }

        if(null != currentList2Node){
            while (currentList2Node.nextNode != null){
                currentList2Node = currentList2Node.nextNode;
                unidirectionalLinkedList.add(currentList2Node.value);
            }
            return unidirectionalLinkedList;
        }
        return unidirectionalLinkedList;

    }

    /**
     * // 遍历解法
     * // 同时不断遍历两个链表，取出小的追加到新的头节点后，直至两者其中一个为空
     * // 再将另一者追加的新链表最后
     * public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     *
     *      ListNode dummy = new ListNode(-1);
     *
     *      ListNode curNode = dummy;
     *
     *      while (l1 != null && l2 != null) {
     *          if (l1.val <= l2.val) {
     *              curNode.next = l1;
     *              l1 = l1.next;
     *          } else {
     *              curNode.next = l2;
     *              l2 = l2.next;
     *          }
     *          curNode = curNode.next;
     *      }
     *
     *      curNode.next = (l1 != null) ? l1 : l2;
     *
     *      return dummy.next;
     *  }
     *
     *  // 递归解法
     *  // 递归的核心方法是将问题规模不断缩小化
     *  // 合并两个长度为n和m的链表，在value(n) < value(m)可以将规模缩减为合并长度为(n-1)和m的链表
     * public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     *     if (l1 == null) return l2;
     *     if (l2 == null) return l1;
     *     if (l1.val < l2.val) {
     *         l1.next = mergeTwoLists(l1.next, l2);
     *         return l1;
     *     } else {
     *         l2.next = mergeTwoLists(l1, l2.next);
     *         return l2;
     *     }
     * }
     * */
}
