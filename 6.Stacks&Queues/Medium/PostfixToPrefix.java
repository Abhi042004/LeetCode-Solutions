import java.util.Stack;

public class PostfixToPrefix {

    static String postToPre(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {

                stack.push(String.valueOf(ch));
            } else {
                String b = stack.pop();
                String a = stack.pop();

                String temp = ch + a + b;
                stack.push(temp);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String exp = "ab*c+";

        String result = postToPre(exp);

        System.out.println("Postfix : " + exp);
        System.out.println("Prefix  : " + result);
    }
}