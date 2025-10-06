public class MinElemInSortArray {
    public static void main(String[] args) {
        // 153. Find Minimum in Rotated Sorted Array
        
        int[] nums = {2,5,6,0,1,2};
        System.out.println(findMin(nums));

    }

     static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }

        if(nums.length == 1){
            return nums[0];
        }

        while(low<=high){
            int mid = low+(high - low)/2;

            if(mid<high && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(low<mid && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid]>nums[low]){
                low = mid + 1;
            }
            else{
                high = mid -1 ;
            }
        }
        return -1;
    }
}
