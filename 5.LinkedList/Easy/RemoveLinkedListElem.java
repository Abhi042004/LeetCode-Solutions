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

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp = dummy;

        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return dummy.next;
    }
}

public class RemoveLinkedListElem {
    
    // Helper to create list
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int num : arr) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;

        ListNode head = createList(arr);

        System.out.print("Original List: ");
        printList(head);

        Solution sol = new Solution();
        head = sol.removeElements(head, val);

        System.out.print("After Removal: ");
        printList(head);
    }
}