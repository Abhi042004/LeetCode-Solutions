import java.util.Arrays;

public class FirstAndLastPos {
    public static void main(String[] args) {
        
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    static int[] searchRange( int[] nums, int target){
        int first = firstFinder(nums, target);
        int last = lastFinder(nums, target);
        return new int[] {first , last};
    }

    static int firstFinder(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int result = -1;

        while (low<=high) {

            int middle = low + (high - low)/2;
            
            if (target == nums[middle]) {
                result = middle;
                high = middle -1 ;
            }
            else if (nums[middle]<target){
                low = middle +1;
            }
            else{
                high = middle -1 ;
            }
        }
        return result;
    }

        static int lastFinder(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int result = -1;

        while (low<=high) {

            int middle = low + (high - low)/2;
            
            if (target == nums[middle]) {
                result = middle;
                low = middle+1 ;
            }
            else if (nums[middle]<target){
                low = middle +1;
            }
            else{
                high = middle -1 ;
            }
        }
        return result;
    }
}

