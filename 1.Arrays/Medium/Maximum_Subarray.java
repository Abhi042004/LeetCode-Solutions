import java.util.HashMap;
import java.util.HashSet;

public class Maximum_Subarray {

    public static void main(String[] args) {
        
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // int max = arr[0];

        // for (int i = 0; i < arr.length; i++) {

        //     int temp = 0;

        //     for (int j = i; j < arr.length; j++) {

        //         temp+=arr[j];
        //         max = Math.max(temp, max);

        //     }

        // }
        //  System.out.println(max);

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start=0;
        int ansStart=0;
        int ansEnd=0;
        // -2,1,-3,4,-1,2,1,-5,4
        for (int i = 0; i < arr.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum+=arr[i];

            if (max<sum) {
                max = sum;
                ansStart = start;
                ansEnd = i;

            }
            
            if (sum<0) {
                sum = 0;
            }
        }

        System.out.println(max);

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}