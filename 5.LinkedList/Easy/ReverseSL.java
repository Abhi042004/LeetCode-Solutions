class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class ReverseSL {

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

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

    // public static ListNode reverse(ListNode head){

    //     Stack<Integer> stack = new Stack<>();
    //     ListNode temp = head;
    //     while (temp!=null) {
    //         stack.push(temp.val);
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     while (temp!=null) {
    //         temp.val = stack.pop();
    //         temp = temp.next;
    //     }

    //     return head;
    // }

    public static ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode front;
        ListNode temp = head;

        while (temp!=null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args){
        int[] values = {10, 20, 30, 40, 50};

        ListNode head = createList(values);
        ListNode rev = reverse(head);
        
        printList(rev);
        
    }


}
