// File: MergeTwoSortedLists.java

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class mergeTwoLists {

    // ================= BRUTE FORCE APPROACH =================
    /*
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ArrayList<Integer> arr = new ArrayList<>();

        // store values
        while (list1 != null) {
            arr.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            arr.add(list2.val);
            list2 = list2.next;
        }

        // sort
        Collections.sort(arr);

        // rebuild list
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for (int val : arr) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return dummy.next;
    }
    */

    // ================= OPTIMIZED APPROACH =================
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        ListNode l1 = list1;
        ListNode l2 = list2;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        // attach remaining
        temp.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    // ================= HELPER =================
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // List 1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1,
                            new ListNode(2,
                            new ListNode(4)));

        // List 2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1,
                            new ListNode(3,
                            new ListNode(4)));

        System.out.print("List 1: ");
        printList(list1);

        System.out.print("List 2: ");
        printList(list2);

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}