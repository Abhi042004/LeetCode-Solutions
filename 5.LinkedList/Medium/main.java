public class Segregate012LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Solution {

        public Node segregate(Node head) {

            if (head == null || head.next == null) {
                return head;
            }

            Node zeroHead = new Node(-1);
            Node oneHead = new Node(-1);
            Node twoHead = new Node(-1);

            Node zero = zeroHead;
            Node one = oneHead;
            Node two = twoHead;

            Node temp = head;

            while (temp != null) {

                if (temp.data == 0) {
                    zero.next = temp;
                    zero = zero.next;
                } else if (temp.data == 1) {
                    one.next = temp;
                    one = one.next;
                } else {
                    two.next = temp;
                    two = two.next;
                }

                temp = temp.next;
            }

            if (zeroHead.next != null) {
                if (oneHead.next != null) {
                    zero.next = oneHead.next;
                } else {
                    zero.next = twoHead.next;
                }
            }

            if (oneHead.next != null) {
                one.next = twoHead.next;
            }

            two.next = null;

            if (zeroHead.next != null)
                return zeroHead.next;
            else if (oneHead.next != null)
                return oneHead.next;
            else
                return twoHead.next;
        }
    }

    // Insert node at end
    static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Print linked list
    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = null;

        int[] arr = {1, 2, 0, 1, 2, 0, 1, 2};

        for (int x : arr) {
            head = insert(head, x);
        }

        System.out.println("Original List:");
        printList(head);

        Solution obj = new Solution();
        head = obj.segregate(head);

        System.out.println("Segregated List:");
        printList(head);
    }
}