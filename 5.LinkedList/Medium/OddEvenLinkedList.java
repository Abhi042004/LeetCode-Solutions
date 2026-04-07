import java.util.*;

public class OddEvenLinkedList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }

    /*
    // ❌ Brute force solution (commented out)
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp1 = head;
        ListNode temp2 = head.next;

        // odd positions
        while (temp1 != null && temp1.next != null) {
            list.add(temp1.val);
            temp1 = temp1.next.next;
        }
        if (temp1 != null) list.add(temp1.val);

        // even positions
        while (temp2 != null && temp2.next != null) {
            list.add(temp2.val);
            temp2 = temp2.next.next;
        }
        if (temp2 != null) list.add(temp2.val);

        // copy back
        int i = 0;
        temp1 = head;
        while (temp1 != null) {
            temp1.val = list.get(i);
            temp1 = temp1.next;
            i++;
        }

        return head;
    }
    */

    // ✅ Optimal solution
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    // Helper: create linked list
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    // Helper: print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        ListNode head = createList(arr);

        System.out.print("Original: ");
        printList(head);

        head = oddEvenList(head);

        System.out.print("After: ");
        printList(head);
    }
}