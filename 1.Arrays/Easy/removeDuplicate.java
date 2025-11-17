import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

    // Brute Force solution
        // Set<Integer> set = new LinkedHashSet<>();

        // for (int value : nums) {
        //     set.add(value);
        // }
        
        // int i = 0;
        // for (Integer value : set) {
        //     nums[i++] = value;
        // }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(set.size());



        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(index);
    }
}
