import java.util.Stack;

public class PostfixToInfix {

    static String postToInfix(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            Character ch = exp.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {

                stack.push(ch.toString());
            } else {
                String b = stack.pop();
                String a = stack.pop();

                String temp = "(" + a + ch + b + ")";
                stack.push(temp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "ab*c+";

        String result = postToInfix(exp);

        System.out.println("Postfix : " + exp);
        System.out.println("Infix   : " + result);
    }
}