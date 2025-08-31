import java.util.Arrays;

public class RunningSumOf1dArray {

    // Problem: 1480. Running Sum of 1d Array
    // Source: LeetCode
    // Approach: Keep a running sum and fill result array

    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Example Test Case
        int[] nums = {1,2,3,4};
        System.out.println("Output: " + Arrays.toString(runningSum(nums)));

        /*
        Other Test Cases:
        Input: nums = [1,1,1,1,1]
        Output: [1,2,3,4,5]

        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]
        */
    }
}

