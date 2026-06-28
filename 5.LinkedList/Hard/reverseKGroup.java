public class reverseKGroup {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ListNode groupStart = head;
        ListNode temp = head;
        ListNode groupEnd;
        ListNode previousGroupEnd = null;

        int count = 0;
        boolean firstGroup = true;

        while (temp != null) {

            count++;

            if (count == k) {

                groupEnd = temp;
                ListNode nextGroupStart = groupEnd.next;
                groupEnd.next = null;

                if (firstGroup) {

                    head = reverse(groupStart);

                    temp = groupStart;
                    groupStart.next = nextGroupStart;

                    previousGroupEnd = groupStart;
                    groupStart = nextGroupStart;

                    firstGroup = false;

                } else {

                    ListNode reversedHead = reverse(groupStart);

                    previousGroupEnd.next = reversedHead;

                    temp = groupStart;
                    previousGroupEnd = groupStart;

                    groupStart.next = nextGroupStart;
                    groupStart = nextGroupStart;
                }

                count = 0;
            }

            temp = temp.next;
        }

        return head;
    }

    static ListNode createList(int[] arr) {

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ListNode head = createList(arr);

        System.out.println("Original List:");
        printList(head);

        head = reverseKGroup(head, 3);

        System.out.println("After Reverse:");
        printList(head);
    }
}