public class MaximumConsecutive3 {
    public static void main(String[] args) {
        
        //Brute Force
        // int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        // int k = 3;
        // int max = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     int temp = k;
           
        //     for (int j = i; j < nums.length; j++) {
        //         if (nums[j] == 0) {
        //             temp--;
        //         }
        //         if (temp == -1) {
        //             break;
        //         }  
        //         max = Math.max(max, j-i+1);
        //     }
        // }
        // System.out.println(max);

        // Better Solution
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int left = 0;
        int right = 0;
        int zeroes = 0;
        int max = 0;

       
        while (right<nums.length) {

            if (nums[right] == 0) {
                zeroes++;
            }

            if (zeroes>k) {
                
                if (nums[left] == 0) {
                    zeroes --;
                }
                left++;
            }

            if (zeroes<=k) {
                max = Math.max(max, right-left+1);
            }
            
            // while (zeroes>k){
            //     if (nums[left] == 0) {
            //             zeroes--;
            //     }
            //     left++;
            // }

            // max = Math.max(max, right-left+1);

            right ++;
            
        }
        System.out.println(max);
    }
}
