import java.util.*;
class Solution {
    public static String infixToPostfix(String s) {
        // code here
        
        if(s.isEmpty() == true){
            return s;
        }
        
        String ans = "";
        Stack<Character> stack = new Stack<>();
        int i = 0;
        
        while(i < s.length()){
            
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')|| 
            (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
            (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                
                ans += s.charAt(i);
            }
            
            else if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            
            else if(s.charAt(i) == ')'){
                
                while(!stack.isEmpty() && stack.peek() != '('){
                    ans += stack.pop();
                }
                stack.pop();
            }
            
            
            else{
                if(!stack.isEmpty() && stack.peek() == '^' && s.charAt(i) == '^'){
                    stack.push(s.charAt(i));
                }
                else{
                    while(!stack.isEmpty() && priority(stack.peek()) >= priority(s.charAt(i))){
                        ans += stack.pop();
                    }
                    stack.push(s.charAt(i));
                }
            }
            i++;
        }
        
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        
        return ans;
    }
    
    public static int priority(Character op){
        
        if(op == '^'){
            return 3;
        }
        else if(op == '*' || op == '/'){
            return 2;
        }
        else if(op == '+' || op == '-'){
            return 1;
        }
        else{
            return 0;
        }
    }
}