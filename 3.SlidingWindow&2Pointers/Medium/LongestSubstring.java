import java.util.*;
public class LongestSubstring{
    public static void main(String[] args) {
        
        // String s = "abcabcbb";
        // String text;
        // int count = 0;
        // int max = 0;
   
        // for (int i = 0; i < s.length(); i++) {
        //     text = "";
            
        //     for (int j = i; j < s.length(); j++) {
                
                
        //         if (text.indexOf(s.charAt(j)) != -1) {
        //             break;
        //         }

        //         text+=s.charAt(j);    
        //         max = Math.max(max, text.length());
        //     }

        // }
        // System.out.println(max);


        String s = "";
        int max = 0;
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right<s.length()) {
            char letter = s.charAt(right);
            Integer last = map.get(letter) ;
            if(last != null && last>=left){
                left = map.get(letter)+1;
            }  
            map.put(letter, right);
            max = Math.max(max, right - left + 1);
            right ++; 
        }
        System.out.println(max);

    }
}