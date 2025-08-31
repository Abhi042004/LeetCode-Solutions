import java.util.Arrays;

public class BuildArrayFromPermutation {

    // Problem: 1920. Build Array from Permutation
    // Source: LeetCode
    // Approach: For each index i, place nums[nums[i]] into the new array

    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[nums[i]];
        }  

        return arr;
    }

    public static void main(String[] args) {
        // Example Test Case
        int[] nums = {0,2,1,5,3,4};
        System.out.println("Output: " + Arrays.toString(buildArray(nums)));
        // Output: [0,1,2,4,5,3]

        /*
        Other Test Cases:
        Input: nums = {5,0,1,2,3,4}
        Output: [4,5,0,1,2,3]

        Input: nums = {0,1,2}
        Output: [0,1,2]
        */
    }
}
