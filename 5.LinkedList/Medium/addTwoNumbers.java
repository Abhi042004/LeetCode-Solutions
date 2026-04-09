
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode linkedList = new ListNode(-1);
        ListNode curr = linkedList;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;

        while (temp1 != null || temp2 != null) {
            
            int sum = carry;

            if (temp1 != null) sum += temp1.val;
            if (temp2 != null) sum += temp2.val;

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        // leftover carry
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return linkedList.next;
    }
}

public class addTwoNumbers {
    // helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // l1 = [2,4,3]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // l2 = [5,6,4]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        printList(result); // Expected: 7 -> 0 -> 8 -> null
    }
}