public class PeakIndex{
    // 162. Find Peak Element
    // 852. Peak Index in a Mountain Array
    public static void main(String[] args) {
        
// Example 1:
// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.
// Example 2:

// Input: nums = [1,2,1,3,5,6,4]
// Output: 5
// Explanation: Your function can return either index number 1 where the peak element 
// is 2, or index number 5 where the peak element is 6.

        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
        
    }

     static int peakIndexInMountainArray(int[] arr) {

       

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
}