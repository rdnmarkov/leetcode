package org.example.utils;

import java.util.ArrayList;
import java.util.List;

public class ListNodeOpration {
    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    public static ListNode createListNode(int... val) {
        List<ListNode> list = new ArrayList<>();
        for (int i = 0; i < val.length; i++) {
            ListNode listNode = new ListNode(val[i]);
            if (i != 0) {
                list.get(i - 1).next = listNode;
            }
            list.add(listNode);
        }

        return !list.isEmpty() ? list.get(0) : null;
    }
}
