import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

    private Queue<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }

    // Push element onto stack
    public void push(int x) {
        int size = queue.size();

        queue.offer(x);

        // Rotate previous elements behind the new one
        while (size-- > 0) {
            queue.offer(queue.poll());
        }
    }

    // Remove top element
    public int pop() {
        return queue.poll();
    }

    // Get top element
    public int top() {
        return queue.peek();
    }

    // Check if stack is empty
    public boolean empty() {
        return queue.isEmpty();
    }

    // Display the internal queue (for learning)
    public void display() {
        System.out.println(queue);
    }
}

public class ImplementStackUsingQueue {

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("After pushing 10,20,30:");
        stack.display();

        System.out.println("Top : " + stack.top());

        System.out.println("Pop : " + stack.pop());

        System.out.println("After pop:");
        stack.display();

        System.out.println("Is Empty : " + stack.empty());
    }
}