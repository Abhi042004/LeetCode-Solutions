import java.util.ArrayList;
import java.util.Collections;

public class FlatteningALinkedList {

    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int data) {
            this.data = data;
            next = null;
            bottom = null;
        }
    }

    // ============================================================
    // BRUTE FORCE APPROACH
    // Time Complexity: O(N log N)
    // Space Complexity: O(N)
    // ============================================================

    /*
    public static Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();

        Node temp1 = head;

        while (temp1 != null) {

            Node temp2 = temp1;

            while (temp2 != null) {
                list.add(temp2.data);
                temp2 = temp2.bottom;
            }

            temp1 = temp1.next;
        }

        Collections.sort(list);

        Node newHead = new Node(list.get(0));
        Node temp = newHead;

        for (int i = 1; i < list.size(); i++) {
            Node newNode = new Node(list.get(i));
            temp.bottom = newNode;
            temp = temp.bottom;
        }

        return newHead;
    }
    */

    // ============================================================
    // OPTIMAL APPROACH
    // Time Complexity: O(N × M)
    // Space Complexity: O(1) (excluding recursion stack)
    // ============================================================

    public static Node flatten(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node mergedHead = flatten(head.next);

        return merge(head, mergedHead);
    }

    public static Node merge(Node list1, Node list2) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                temp.bottom = list1;
                list1 = list1.bottom;
            } else {
                temp.bottom = list2;
                list2 = list2.bottom;
            }

            temp = temp.bottom;
            temp.next = null;
        }

        if (list1 != null) {
            temp.bottom = list1;
        } else {
            temp.bottom = list2;
        }

        return dummy.bottom;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.bottom;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(5);

        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);

        head.next = new Node(10);
        head.next.bottom = new Node(20);

        head.next.next = new Node(19);
        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);

        head.next.next.next = new Node(28);
        head.next.next.next.bottom = new Node(35);
        head.next.next.next.bottom.bottom = new Node(40);
        head.next.next.next.bottom.bottom.bottom = new Node(45);

        Node flattened = flatten(head);

        System.out.println("Flattened Linked List:");
        printList(flattened);
    }
}