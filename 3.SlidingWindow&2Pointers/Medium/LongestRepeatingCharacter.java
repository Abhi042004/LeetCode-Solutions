import java.util.*;

public class LongestRepeatingCharacter {
    
    
    public static void main(String[] args) {

        // Brute Force
        
        // String s = "AABBABB";
        // int max = 0;
        // int k = 2;

        // for (int i = 0; i < s.length(); i++) {
        //     int[] hash = new int[26];
        //     for (int j = i; j < s.length(); j++) {

        //         hash[s.charAt(j) - 'A']++;

        //         if (j-i+1 - find(hash) > k) {
        //             break;
        //         }

        //         max = Math.max(max, j-i+1);
        //         System.out.print(s.charAt(j));
        //     }
        //     System.out.println();
        // }
        // System.out.println(max);

        // Better Solution

        String s = "AABBABB";
        int max = 0;
        int k = 2;
        int right = 0;
        int left = 0;
        int maxFreq = 0;
        int[] hash = new int[26];

        while (right<s.length()) {

            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right)- 'A']);
            
            while (right-left+1 - maxFreq> k) {
                hash[s.charAt(left) - 'A']--;
                left++;
            }
            
            max = Math.max(max, right-left+1);
            
            right++;
        }
        System.out.println(max);
    }

    // public static int find(int[] arr){
    //         int max =0;
    //         for (int i = 0; i < arr.length; i++) {
    //             max = Math.max(max, arr[i]);
    //         }
    //         return max;
    //     }
    }

    

