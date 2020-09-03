package com.lyh.show.easy._21_merge_two_sorted_list;

public class Solution {

    public ListNode<Integer> mergeTwoSortedList(ListNode<Integer> l1, ListNode<Integer> l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode<Integer> root = new ListNode<Integer>(0);
        ListNode<Integer> cur = root;
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return root.next;
    }

}

class ListNode<T> {
    T value;
    ListNode<T> next;

    ListNode(T value) {
        this.value = value;
    }
}
