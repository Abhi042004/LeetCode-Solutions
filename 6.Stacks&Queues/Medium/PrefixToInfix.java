import java.util.Stack;

public class PrefixToInfix {

    static String preToInfix(String preExp) {
        Stack<String> stack = new Stack<>();

        for (int i = preExp.length() - 1; i >= 0; i--) {
            char ch = preExp.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {

                stack.push(String.valueOf(ch));
            } else {
                String a = stack.pop();
                String b = stack.pop();

                String temp = "(" + a + ch + b + ")";
                stack.push(temp);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String preExp = "+*abc";

        String result = preToInfix(preExp);

        System.out.println("Prefix : " + preExp);
        System.out.println("Infix  : " + result);
    }
}