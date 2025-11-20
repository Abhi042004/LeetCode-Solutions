import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int [] nums = {0};
        // int [] temp = new int[nums.length];
        // int index = 0;

        //    for(int i = 0; i < nums.length; i++){
        //     if(nums[i]!=0){
        //         temp[index] = nums[i];
        //         index++;
        //     }
        // }
        // for (int i = 0; i < temp.length; i++) {
        //     nums[i] = temp[i];
        // }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[index++]=nums[i];
                
            } 
        }
        while (index!=nums.length) {
            nums[index++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
