import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // 1. Two Sum
    public static void main(String[] args) {
        
    // Example 1:

    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    // Example 2:

    // Input: nums = [3,2,4], target = 6
    // Output: [1,2]
    // Example 3:

    // Input: nums = [3,3], target = 6
    // Output: [0,1]

        // int[] nums = {3,2,4};
        // int target = 6;
        // int[] arr = new int[2];

        //Brute Force Solution
        // int flag = 0;
        
        // for(int i = 0;i<nums.length;i++){

        //     for(int j = 0;j<nums.length;j++){
        //         if(i == j){continue;}
        //         if(nums[i]+nums[j]==target){
        //             arr[0] = i;
        //             arr[1] = j;
        //             flag = 1;
        //         }
        //     }
        //     if(flag == 1){
        //         break;
        //     }
        // }
        
        // System.out.println(Arrays.toString(arr));

    //Better Solution
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     map.put(nums[0], 0);
    //     for (int i = 1; i < nums.length; i++) {
            
    //         if (map.containsKey(target - nums[i])) {
    //             arr[0] = map.get(target - nums[i]);
    //             arr[1] = i;
    //             break;
    //         }
    //         map.put(nums[i],i);
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    // No optimal solution for this variation only better one is there this
    // is for another variation
//    int[] nums = {2, 5, 5, 11};
//    int target = 10;
//    Arrays.sort(nums);

//     int[] arr = new int[2];

//     int i = 0;
//     int j = nums.length-1;

//     while (i!=j) {

//         int sum = nums[i]+nums[j];

//         if (sum==target) {
//             arr[0] = i;
//             arr[1] = j;
//             break;
//         }
//         if (sum>target) {
//             j--;
//         }
//         else{
//             i++;
//         }
       
//         }
//         System.out.println(Arrays.toString(arr));
    }
}
