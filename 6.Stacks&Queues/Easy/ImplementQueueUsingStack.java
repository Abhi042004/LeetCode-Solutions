import java.util.Stack;

class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // ==========================================================
    // OPTIMAL APPROACH
    // Time Complexity:
    // push()  -> O(1)
    // pop()   -> Amortized O(1)
    // peek()  -> Amortized O(1)
    // empty() -> O(1)
    // ==========================================================

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public int peek() {

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    // Display both stacks (for learning)
    public void display() {
        System.out.println("Input Stack  (s1): " + s1);
        System.out.println("Output Stack (s2): " + s2);
        System.out.println();
    }

    /*
    ===========================================================
    LESS OPTIMIZED APPROACH
    Time Complexity:
    push()  -> O(n)
    pop()   -> O(1)
    peek()  -> O(1)
    empty() -> O(1)

    public void push(int x) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(x);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }

    ===========================================================
    */
}

public class ImplementQueueUsingStack {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("After pushing 10,20,30");
        queue.display();

        System.out.println("Peek : " + queue.peek());

        System.out.println();

        System.out.println("Pop : " + queue.pop());
        queue.display();

        System.out.println("Pop : " + queue.pop());
        queue.display();

        queue.push(40);

        System.out.println("After pushing 40");
        queue.display();

        System.out.println("Peek : " + queue.peek());

        System.out.println();

        while (!queue.empty()) {
            System.out.println("Pop : " + queue.pop());
        }

        System.out.println();

        System.out.println("Queue Empty : " + queue.empty());
    }
}