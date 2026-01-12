import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {

    // Brute Force Solution    
        
    //     int[] arr = {100,4,200,1,3,2};
    //     int max = Integer.MIN_VALUE;
        
    //     for (int i = 0; i < arr.length; i++) {
            
    //         int temp = arr[i];
    //         int count = 1;

    //         while (ls(arr, temp+1) == true) {
    //             temp +=1;
    //             count+=1;
    //         }
    //         max = Math.max(max, count);
    // }
    //         System.out.println(max);

    // Better Solution
    // int[] arr = {100,4,200,1,3,2};
    // Arrays.sort(arr);
    // int last_num = Integer.MIN_VALUE;
    // int longest = 1;
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {
        
    //     if (last_num == arr[i]-1) {
    //         count++;
    //         last_num = arr[i];
    //     }
    //     else if (last_num != arr[i] -1) {
    //         count = 1;
    //         last_num = arr[i];
    //     }
        
    //     longest = Math.max(longest, count);

    // }

    // System.out.println(longest);

    // Optimal So
    int[] arr = {100,4,200,1,3,2};
    int longest = 1;
    int count = 1;
    int x = 0;
    HashSet<Integer> set = new HashSet<>();

    for (int num : arr) {
        set.add(num);
    }

    for (Integer  num : set) {

        if (set.contains(num-1) == false) {
            count = 1;
            x = num;
            while (set.contains(x+1)) {
                count++;
                x += 1;
            }
        }
        longest = Math.max(count, longest);

    }
    System.out.println(longest);

}

// public static boolean ls(int[] arr, int num){
//     for (int i = 0; i < arr.length; i++) {
        
//         if (arr[i] == num) {
//             return true;
//         }
//     }
//     return false;
// }
}
