
public class RemoveOuterParentheses{
   public static void main(String[] args) {
    

        String s = "(()())(())";
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            
            
    
            if (s.charAt(i) == '(') {
                count ++;
                if (count > 1) {
                    ans.append('(');
                }
            }
            else{
                if (count > 1) {
                    ans.append(')');
                }
                count --;
            }
            
        }
        System.out.println(ans.toString());
    } 
}
