// File: SortList.java

import java.util.Arrays;

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

public class SortList {

    // ================= BRUTE FORCE APPROACH =================
    /*
    public static ListNode sortList(ListNode head) {
        
        ListNode temp = head;
        int count = 0;

        // Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Store values in array
        int[] arr = new int[count];
        temp = head;
        int k = 0;

        while (k < count) {
            arr[k] = temp.val;
            temp = temp.next;
            k++;
        }

        // Sort array
        Arrays.sort(arr);

        // Put sorted values back into list
        temp = head;
        k = 0;

        while (temp != null) {
            temp.val = arr[k];
            temp = temp.next;
            k++;
        }

        return head;
    }
    */

    // ================= OPTIMIZED APPROACH (MERGE SORT) =================
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode middle = findMiddle(head);
        ListNode rightHead = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        return merge(left, right);
    }

    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

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
        // Example: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4,
                            new ListNode(2,
                            new ListNode(1,
                            new ListNode(3))));

        System.out.print("Original List: ");
        printList(head);

        head = sortList(head);

        System.out.print("Sorted List: ");
        printList(head);
    }
}