import java.util.HashMap;
import java.util.HashSet;

public class maxSubArray {
    public static void main(String[] args) {

    // Brute Force - for both positives and negatives
        
    // int arr[] = {-5, 8, -14, 2, 4, 12};
    // int k = -5;
        
    //     int sum;
       
    //     int max = 0;

    //     for (int i = 0; i < arr.length; i++) {
            
    //         sum = 0;
    
    //         for (int j = i; j < arr.length; j++) {

    //             sum += arr[j];

              
    //             if(sum == k){
    //                 max = Math.max(max, j-i+1);
    //             }

    //         }
    //     }
    //     System.out.println(max);


        //Better Solution - for both positives and negatives

        // int arr[] = {0,0,0,0,0,0,0,0,0,0};
        // int k = 0;
        // long sum = 0;
        // int max = 0;
        // int count = 0;
        //  HashMap<Long, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];

            
        //     if (sum == k) {
        //         max = i + 1;
        //     }
        //     else if (map.containsKey(sum - k)) {
        //         max = Math.max(max, i - map.get(sum-k));
        //     }

        //     map.putIfAbsent(sum, i);
        // }
        // System.out.println(max);

        // Optimal Approach using two pointer only for positives
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;

        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLen = 0;

        while (right < arr.length) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        System.out.println(maxLen);

    }
}
