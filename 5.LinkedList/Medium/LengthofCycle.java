

public class LengthofCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static int CycleLength(ListNode head) {
        int count = 0;
        

        ListNode slow = head;
        ListNode fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;

            if (slow == fast) {
                return count;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        // 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create cycle (last node points to node with value 2)
        head.next.next.next.next = head.next;

        int result = CycleLength(head);
        System.out.println(result);
        


    }
}

