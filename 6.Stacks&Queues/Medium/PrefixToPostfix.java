import java.util.Stack;

public class PrefixToPostfix {

    static String preToPost(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {

                stack.push(String.valueOf(ch));
            } else {
                String a = stack.pop();
                String b = stack.pop();

                String temp = a + b + ch;
                stack.push(temp);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String exp = "+*abc";

        String result = preToPost(exp);

        System.out.println("Prefix  : " + exp);
        System.out.println("Postfix : " + result);
    }
}