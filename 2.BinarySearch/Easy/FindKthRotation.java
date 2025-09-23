public class FindKthRotation {
    // Find Kth Rotation 
    // Source Geeks For Geeks

    public static void main(String[] args) {
        
        int[] arr = {5, 1, 2, 3, 4};


        System.out.println(count(arr));
        
    }

     static int count(int[] arr) {
        
      int low = 0;
      int high = arr.length-1;

        
        while (low<=high) {
            
            int mid = low + (high - low)/2;

            if (mid>low && arr[mid] < arr[mid-1]) {
                return mid;
            }
            else if(mid<high && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            else if(arr[low]<arr[mid] ){
                low = mid+1 ;
            }
            else{
                high = mid-1;
            }
        }

        return 0;
       
    }
}

