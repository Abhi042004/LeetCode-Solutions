import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        // int zero = 0;
        // int one = 0;
        // int two = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (0 == nums[i]) {zero++;}
        //     else if (1 == nums[i]) {one++;}
        //     else if (2 == nums[i]) {two++;}
        // }
        // int x = 0;
        // int i = 0;

        // for (i = 0; i < zero; i++) {
        //        nums[i] = 0;
        // }
        // for (int j = 0; j < one; j++) {
        //        nums[i++] = 1;
        // }
        // for (int z =0; z < two; z++) {
        //        nums[i++] = 2;
        // }
        // System.out.println(Arrays.toString(nums));


        // Optimal Solution

        // int[] nums = {2,0,2,1,1,0};

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid<=high) {
            
            if (nums[mid] == 0 && nums[low] == 0) {
                low++;
                mid++;
            }
            else if (nums[mid] == 0) {
                swap(nums ,low ,mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else if (nums[mid] == 2) {
                swap(nums ,high ,mid);
                high --;
            }
        }

        System.out.println(Arrays.toString(nums));
    }


    public static void swap(int[] nums, int y , int x){

        int temp = nums[y];
        nums[y] = nums[x];
        nums[x] = temp;

    }

}

