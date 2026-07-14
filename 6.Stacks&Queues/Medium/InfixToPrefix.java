import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

    public static String infixToPrefix(String text) {

        StringBuilder s = new StringBuilder(text);
        s.reverse();

        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int i = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            else if (ch == ')') {
                stack.push(ch);
            }

            else if (ch == '(') {

                while (!stack.isEmpty() && stack.peek() != ')') {
                    ans.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else {

                if (!stack.isEmpty() && stack.peek() == '^' && ch == '^') {
                    ans.append(stack.pop());
                    stack.push(ch);
                } else {

                    while (!stack.isEmpty() &&
                           priority(stack.peek()) > priority(ch)) {
                        ans.append(stack.pop());
                    }

                    stack.push(ch);
                }
            }

            i++;
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }

    public static int priority(char op) {

        if (op == '^')
            return 3;
        else if (op == '*' || op == '/')
            return 2;
        else if (op == '+' || op == '-')
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix Expression: ");
        String infix = sc.nextLine();

        String prefix = infixToPrefix(infix);

        System.out.println("Prefix Expression: " + prefix);

        sc.close();
    }
}