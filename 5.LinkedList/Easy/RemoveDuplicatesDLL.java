class Node {
    int data;
    Node next, prev;

    Node(int x) {
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}

class Solution {
    Node removeDuplicates(Node head) {

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {
                Node nextNode = temp.next.next;

                temp.next = nextNode;

                if (nextNode != null) {
                    nextNode.prev = temp;
                }
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}

public class RemoveDuplicatesDLL {

    // Create DLL
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

    // Print DLL
    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4};

        Node head = createDLL(arr);

        System.out.print("Original DLL: ");
        printDLL(head);

        Solution sol = new Solution();
        head = sol.removeDuplicates(head);

        System.out.print("After Removing Duplicates: ");
        printDLL(head);
    }
}