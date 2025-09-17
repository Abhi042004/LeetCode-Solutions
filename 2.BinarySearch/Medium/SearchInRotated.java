public class SearchInRotated {
    // 33. Search in Rotated Sorted Array
    public static void main(String[] args) {
        
        // Example 1:

        // Input: nums = [4,5,6,7,0,1,2], target = 0
        // Output: 4
        // Example 2:

        // Input: nums = [4,5,6,7,0,1,2], target = 3
        // Output: -1
        // Example 3:

        // Input: nums = [1], target = 0
        // Output: -1
 

        int[] nums = {1,3,5};
        int target = 1;

        System.out.println(find(nums, target));
    }

    static int find(int[] nums, int target){

        if(nums.length == 1){
            if (nums[0] == target) {
                return 0;
            }
            else{
                return -1;
            }
            
        }
        int peak = peak(nums);
        int ans = binarySearchLeft(nums , target , peak);
        if (ans == -1) {
            ans = binarySearchRight(nums, target, peak);
        }
        return ans;
        
    }

     static int binarySearchRight(int[] nums, int target, int peak) {

        int low = peak+1;
        int high = nums.length-1;

        while (low<=high) {
            int mid = low + (high - low)/2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

    static int binarySearchLeft(int[] nums, int target, int peak) {

        int low = 0;
        int high = peak;

        while (low<=high) {
            int mid = low + (high - low)/2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

     static int peak(int[] nums) {

        int low = 0;
        int high = nums.length-1;
     
    
        while (low<=high) {
            int mid = low + (high  - low )/2;

            if (mid<high && nums[mid] > nums[mid+1]) {
                return mid;
            }
            else if (mid>low && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            else if (nums[low] < nums[mid]) {
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}
