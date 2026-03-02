import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class LinkedListCycle {

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

    // public static boolean hasCycle(ListNode head) {
    //     HashMap<ListNode,Integer> map = new HashMap<>();
    //     ListNode temp = head;
    //     while(temp!=null){
    //         if(map.containsKey(temp) == true){
    //             return true;
    //         }
    //         map.put(temp,1);
    //         temp = temp.next;
    //     }
    //     return false;
    // }

    public static boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow= head;

        while (fast!=null && fast.next!=null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return false;
    }



    public static void main(String[] args){
        int[] values = {10, 20, 30, 40, 50};

        ListNode head = createList(values);
        
        
        printList(head);
        System.out.println("List has a cycle: "+hasCycle(head));
        
    }


}


