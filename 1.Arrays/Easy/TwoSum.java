import java.util.Arrays;

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

        int[] nums = {3, 2, 4};
        int target = 6;
        int[] arr = new int[2];

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                System.out.println(nums[i]+nums[j]);
                if(nums[i]+nums[j] == target){
                    arr[0] = nums[i];
                    arr[1] = nums[j];
                    System.out.println(arr[0]);
                    System.out.println(arr[1]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
