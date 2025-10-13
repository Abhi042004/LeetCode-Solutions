public class SmallesDivisor {
// 1283. Find the Smallest Divisor Given a Threshold
    public static void main(String[] args) {
        
        int[] nums = {1,2,5,9};
        int threshold = 5;

        System.out.println(findDivisor(nums , threshold));
    }

     static int findDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = max(nums);
        while (low<=high) {
            int div = low + (high -low)/2;
            int total = sum(nums,div);

            if (total<=threshold) {
                high = div -1;
            }
            else{
                low = div + 1;
            }


        }
        
        return low;
    }

    static int sum(int[] nums,int div) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total+= nums[i]/div;
            if (nums[i]%div != 0) {
                total+=1;
            }
        }

        return total;
    }

    static int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
     }
}