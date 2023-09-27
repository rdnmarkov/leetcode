package org.example.task;

import org.example.utils.ListNode;

public class MergeTwoSortedLists {

    /*

    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.

    */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    /*


    f1(value=1, next=f2),f2(value=2, next=f4),f4(value=4, next=null)
    s1(value=1, next=s3),s3(value=3, next=s4),s4(value=4, next=null)

    s1.next = mergeTwoLists(f1,s3)


    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]
    Example 2:

    Input: list1 = [], list2 = []
    Output: []
    Example 3:

    Input: list1 = [], list2 = [0]
    Output: [0]

    */

    public static void main(String[] args) {
        ListNode listHeadFirst = new ListNode(1);
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(4);
        listHeadFirst.next = list1;
        list1.next = list2;

        ListNode listHeadSecond = new ListNode(1);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        listHeadSecond.next = list3;
        list3.next = list4;

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode n = mergeTwoSortedLists.mergeTwoLists(listHeadFirst, listHeadSecond);

        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }

    }

}
