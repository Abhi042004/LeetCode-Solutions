class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveFromLast {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        /*
        ------------------- BRUTE FORCE APPROACH -------------------

        if (n == 1 && head.next == null) {
            return null;
        } 
        else {
            int cnt = 0;
            ListNode temp = head;

            while (temp != null) {
                cnt++;
                temp = temp.next;
            }

            int count = cnt - n;

            if (count == 0) {
                return head.next;
            }

            int k = 1;
            temp = head;

            while (count > k) {
                k++;
                temp = temp.next;
            }

            temp.next = temp.next.next;
            return head;
        }

        Time Complexity : O(N) + O(N)
        Space Complexity : O(1)
        */

        // ------------------- OPTIMAL APPROACH (Two Pointer) -------------------

        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // If fast becomes null → remove head
        if (fast == null) {
            return head.next;
        }

        ListNode slow = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        head = removeNthFromEnd(head, n);

        printList(head);
    }
}