public class SingleElement{
    // 540. Single Element in a Sorted Array
    public static void main(String[] args) {
        

    //Example 1:

    // Input: nums = [1,1,2,3,3,4,4,8,8]
    // Output: 2
    // Example 2:

    // Input: nums = [3,3,7,7,10,11,11]
    // Output: 10
 
        int[] nums = {1,1,2,2,4,4,5,5,6,6,7,8,8};
        System.out.println(single(nums));
        
    }

     static int single(int[] nums) {

        int low = 0;
        int high = nums.length-1;

        while(low<= high){

            int mid = low + (high - low )/2;

            if (nums.length==1){
                return nums[0];
            }

            if (mid == 0 && nums[mid+1] != nums[mid]) {
                return nums[mid];
            }
            else if (mid == nums.length-1 && nums[mid-1] !=  nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] != nums[mid+1] && nums[mid-1] != nums[mid]) {
                return nums[mid];
            }

            else if (mid%2 == 0 && nums[mid+1]== nums[mid] || mid%2 == 1 && nums[mid-1]==nums[mid]) {
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }

        return -1;
    }
}