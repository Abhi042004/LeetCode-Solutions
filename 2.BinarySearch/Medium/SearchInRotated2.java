public class SearchInRotated2 {
    public static void main(String[] args) {
// 154: “Find Minimum in Rotated Sorted Array II"
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;

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


    static int peak(int[] arr){
        int low = 0;
        int high = arr.length-1;

        if(arr.length==1){
            return 0;
        }

        if (arr[0]>arr[1]) {
            return 0;
        }
        while(low<high){
            int mid = low+(high - low)/2;

          if(arr[low] == arr[mid] && arr[mid] ==arr[high]){
            low ++;
            high --;
            continue;
          }

          if(low<mid && arr[mid] < arr[mid-1]){
            return mid-1;
          }
          else if(high>mid && arr[mid]> arr[mid+1]){
            return mid;
          }
          else if (arr[low] <= arr[mid]) {
            low = mid + 1;
          }
          else{
            high = mid - 1;
          }

        }
        return low;
    }
}
