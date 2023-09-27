package org.example.task;

import org.example.utils.ListNode;
import org.example.utils.ListNodeOpration;

public class RemoveDuplicatesFromSortedList {

    /*

    Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.

    */


    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode listNode = head;

        while (listNode.next != null) {
            if (listNode.val != listNode.next.val) {
                listNode = listNode.next;
            } else {
                listNode.next = listNode.next.next;
            }
        }

        return head;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        if(head == null || head.next == null) return head;

        if(head.val == head.next.val){
            head = deleteDuplicates1(head.next);
        }else{
            head.next = deleteDuplicates1(head.next);
        }

        return head;
    }

    /*

    Input: head = [1,1,2]
    Output: [1,2]

    Input: head = [1,1,2,3,3]
    Output: [1,2,3]

    */

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

        ListNode listNode = ListNodeOpration.createListNode(1, 1, 2);
        listNode = removeDuplicatesFromSortedList.deleteDuplicates1(listNode);
        ListNodeOpration.printListNode(listNode);

        ListNode listNode1 = ListNodeOpration.createListNode(1, 1, 2, 3, 3);
        listNode1 = removeDuplicatesFromSortedList.deleteDuplicates1(listNode1);
        ListNodeOpration.printListNode(listNode1);


    }


}
