import java.util.*;
public class BalancedParenthesis{
    public static void main(String[] args) {
        
        String s = "({})";


        char[] arr = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        
        for (Character x : arr) {
            
            if (x == '(' || x == '{' || x == '[' ) {
                stack.push(x);
            }
            else{

                if (stack.size() >= 1) {
                    if (stack.peek() == '(' && x == ')' || stack.peek() == '[' && x == ']' || stack.peek() == '{' && x == '}') {
                        stack.pop();
                    }
                    else{
                        System.out.println("Not a balanced parenthesis");
                        break;
                    }
                }
                else{
                    System.out.println("Not a balanced parenthesis");
                    break;
                }  
            }
        }

        if (stack.size() != 0) {
            System.out.println("Not a balanced parenthesis");
        }
        
    }
}


