import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class MinStackDemo {

    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Current Min: " + minStack.getMin());
        System.out.println("Top Element: " + minStack.top());

        minStack.pop();
        System.out.println("\nAfter one pop:");
        System.out.println("Current Min: " + minStack.getMin());
        System.out.println("Top Element: " + minStack.top());

        minStack.pop();
        System.out.println("\nAfter another pop:");
        System.out.println("Current Min: " + minStack.getMin());
        System.out.println("Top Element: " + minStack.top());
    }
}