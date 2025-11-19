import java.util.Arrays;

public class rotateArray{
    // 189. Rotate Array
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4};
        int k = 1;
        k = k%nums.length;

        reverse(nums , 0, nums.length-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    

     static int[] reverse(int[] nums, int start , int end) {
        
        for (int i = start; i <= end; i++) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end--] = temp;
            
        }
        return nums;
    }
}
