import java.util.Arrays;

public class ConcatenationOfArray {

    // Problem: 1929. Concatenation of Array
    // Source: LeetCode
    // Approach: Copy array and fill the second half with the same elements

    public static int[] getConcatenation(int[] nums) {
        int[] ans = Arrays.copyOf(nums, 2 * nums.length);

        for (int i = 0; i < nums.length; i++) {
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example Test Case
        int[] nums = {1,2,1};
        System.out.println("Output: " + Arrays.toString(getConcatenation(nums)));
        // Output: [1,2,1,1,2,1]

        /*
        Other Test Cases:
        Input: nums = {1,3,2,1}
        Output: [1,3,2,1,1,3,2,1]

        Input: nums = {5,6,7}
        Output: [5,6,7,5,6,7]
        */
    }
}
