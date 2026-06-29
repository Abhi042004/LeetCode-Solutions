class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int count = 1;

        while (tail.next != null) {
            count++;
            tail = tail.next;
        }

        k %= count;

        if (k == 0) {
            return head;
        }

        k = count - k;

        ListNode newHead = head;
        ListNode temp1 = null;

        int x = 0;
        while (x < k) {
            temp1 = newHead;
            newHead = newHead.next;
            x++;
        }

        temp1.next = null;
        tail.next = head;

        return newHead;
    }
}

public class RotateLinkedList {

    // Create linked list from an array
    static ListNode createList(int[] arr) {

        if (arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Print linked list
    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        ListNode head = createList(arr);

        System.out.println("Original List:");
        printList(head);

        Solution solution = new Solution();

        head = solution.rotateRight(head, k);

        System.out.println("\nRotated List:");
        printList(head);
    }
}