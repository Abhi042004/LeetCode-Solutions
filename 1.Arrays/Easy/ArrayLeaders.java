import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static void main(String[] args) {
        
    
        // Brute Force
    //     int[] arr = {51,87};
    //     int flag;
    //     ArrayList<Integer> list = new ArrayList<>();

    //     for (int i = 0; i < arr.length; i++) {
    //         flag = 1;

    //         for (int j = i+1; j < arr.length; j++) {
    //             if (arr[i]<arr[j]) {
    //                 flag = 0;
    //                 break;
    //             }
    //         }
    //         if (flag == 1) {
    //             list.add(arr[i]);
    //         }
    //     }
    //     System.out.println(list);

    // Better Solution

        int[] arr = {9,6,4,14,3,8,2,1};
        int max = -1;
        ArrayList<Integer> list = new ArrayList<>();



        for (int i = arr.length-1; i >= 0; i--) {
            
            if (arr[i]>=max) {
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    
}
