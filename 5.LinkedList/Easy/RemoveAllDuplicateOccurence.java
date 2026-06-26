public class RemoveAllDuplicateOccurence {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node createLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static Node removeDuplicates(Node head) {
        Node temp = head;

        while (temp != null && temp.next != null) {
            Node newNode = temp.next;

            while (newNode != null && newNode.data == temp.data) {
                newNode = newNode.next;
            }

            temp.next = newNode;
            temp = temp.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4};

        Node head = createLinkedList(arr);

        System.out.print("Original List: ");
        printList(head);

        head = removeDuplicates(head);

        System.out.print("After Removing Duplicates: ");
        printList(head);
    }
}