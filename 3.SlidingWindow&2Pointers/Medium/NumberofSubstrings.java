import java.util.*;

public class NumberofSubstrings {
    public static void main(String[] args) {
        

        // Brute Force

        // String s = "bbacba";
        // int count = 0;
        // int[] hash = new int[3];


        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i; j < s.length(); j++) {  
        //         hash[ s.charAt(j) - 'a'] = 1;
        //         if (hash[0] + hash[1] + hash[2] == 3) {
        //             count = count + (s.length() - j);
        //             break;
//       Brute      count ++;
        //         }
        //     }   
        // }
        // System.out.println(count);

        // Better Solution

        String s = "aaacb";
        int left = 0;
        int count = 0;
        int n = s.length();
        int[] hash = new int[3];


        for (int right = 0; right < s.length(); right++) {
             hash[s.charAt(right) - 'a']++;

            while (hash[0] >=1 && hash[1] >=1 && hash[2] >=1) {
                count = count + (n - right);
                hash[s.charAt(left) - 'a']--;
                left ++;
            }
        }
        System.out.println(count);
    }
}
