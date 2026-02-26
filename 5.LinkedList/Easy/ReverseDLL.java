import java.util.Stack;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.prev = null;
        this.data = data;
        this.next = null;
    }

    Node(Node prev,int data,Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

public class ReverseDLL {

     public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    // public static Node reverse(Node head){

    //     if (head == null) {
    //         return head;
    //     }

    //     Stack<Integer> stack = new Stack<>();
    //     Node temp = head;
    //     while (temp!=null) {
    //         stack.push(temp.data);
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     while (temp!=null) {
    //         temp.data = stack.peek();
    //         stack.pop();
    //         temp = temp.next;
    //     }
    //     return head;
    // }


    public static Node reverse(Node head){

        if (head == null) {
            return head;
        }
        if (head.prev == null && head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;
        while (current!=null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }
        head = temp.prev;
        return head;
    }
    
    public static void main(String[] args) {
        
        Node head = new Node(1);
        Node second = new Node(head, 2, null);
        head.next = second;

        Node third = new Node(second, 3, null);
        second.next = third;

        Node fourth = new Node(third, 4, null);
        third.next = fourth;

        System.out.print("Original: ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed: ");
        printList(head);
    }
}
