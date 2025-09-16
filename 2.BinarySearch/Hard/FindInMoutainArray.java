public class FindInMoutainArray {

    // 1095. Find in Mountain Array
    public static void main(String[] args) {

// Example 1:

// Input: mountainArr = [1,2,3,4,5,3,1], target = 3
// Output: 2
// Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
// Example 2:

// Input: mountainArr = [0,1,2,4,2,1], target = 3
// Output: -1
// Explanation: 3 does not exist in the array, so we return -1.


    int[] arr = {0,1,2,4,3,2,1};
    int target = 3;
    System.out.println(find(arr,target));
    
}

    static int find(int[] arr, int target){
        
        int peak = peakIndex(arr);
        int index = mountain(arr,target ,peak);
        if (index == -1) {
            return rightHalf(arr, target, peak);
        }

        return index;

        
    }

    static int peakIndex(int[] arr) {

    

        int low = 0;
        int high = arr.length-1;
    
        while (low<high) {

            int middle = low + (high - low)/2;
            
            if (arr[middle] < arr[middle+1]) {
                low = middle+1;
            }
            else{
                high = middle;
            }
        
        }
        return high;

    }


     static int mountain(int[] arr , int target , int peak) {


        int low = 0;
        int high = peak;
  
        

        while (low<=high) {

            int middle = low + (high - low)/2;

            if (target == arr[middle]) {
                return middle;
            }
            
            
            else if (arr[middle] < target) {
                low = middle+1;
            }

            else{
                high = middle-1;
            }
          
        }
        return -1;
    
      
    }


    static int rightHalf(int[] arr, int target, int peak){


        int low = peak;
        int high = arr.length-1;
  
        

        while (low<=high) {

            int middle = low + (high - low)/2;

            if (target == arr[middle]) {
                return middle;
            }
            
            
            else if (arr[middle] > target) {
                low = middle+1;
            }

            else{
                high = middle-1;
            }
          
        }
        return -1;

    }
}
