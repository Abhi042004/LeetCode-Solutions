import java.util.Arrays;

public class ShuffleTheArray {

    // Problem: 1470. Shuffle the Array
    // Source: LeetCode
    // Approach: Use two pointers (i from 0 to n-1, j from n to 2n-1) and fill new array alternately

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        int index = 0;

        for (int i = 0, j = n; j < nums.length; i++, j++) {
            arr[index] = nums[i];
            arr[index+1] = nums[j];
            index += 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Example Test Case
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println("Output: " + Arrays.toString(shuffle(nums, n)));

        /*
        Other Test Cases:
        Input: nums = [1,1,2,2], n = 2
        Output: [1,2,1,2]

        Input: nums = [1,2,3,4,4,3,2,1], n = 4
        Output: [1,4,2,3,3,2,4,1]
        */
    }
}


