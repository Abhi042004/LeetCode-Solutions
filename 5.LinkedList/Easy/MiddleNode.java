class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MiddleNode {

        public static ListNode middleNode(ListNode head) {
        
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        len = len/2;
        int count = 0;
        temp = head;
        while(count<len){
            count++;
            temp = temp.next;
        }
        return temp;
    }
    // Function to create linked list from array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Helper function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};

        ListNode head = createList(values);
        ListNode temp = middleNode(head);
        printList(temp);


    }
}
