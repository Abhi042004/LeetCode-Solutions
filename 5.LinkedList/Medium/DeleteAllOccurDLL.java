class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp = head;

        while (temp != null) {

            if (temp.data == x) {

                // If head node is to be deleted
                if (temp == head) {
                    head = temp.next;
                }

                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                // Fix links
                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }

                if (prevNode != null) {
                    prevNode.next = nextNode;
                }

                temp = nextNode;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}

public class DeleteAllOccurDLL {

    // Create DLL from array
    public static Node createDLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

        return head;
        
    }

    // Print DLL forward
    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int x = 2;

        Node head = createDLL(arr);

        System.out.print("Original DLL: ");
        printDLL(head);

        head = Solution.deleteAllOccurOfX(head, x);

        System.out.print("After Deletion: ");
        printDLL(head);
    }
}