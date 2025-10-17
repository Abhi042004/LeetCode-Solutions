public class SplitArrayLargestSum{
    public static void main(String[] args) {
        // 410. Split Array Largest Sum
        int [] arr = {1,2,3,4,5};
        int k = 16;
        System.out.println(findMinMax(arr , k));
    }

     static int findMinMax(int[] arr, int k) {

        if (arr.length < k) {
            return -1;
        }
        if (k == 1) {
            return sum(arr);
        }

        int low = maximum(arr);
        int high = sum(arr);

        while (low<=high) {
            int mid = low + (high - low)/2;

            int split = findSplit(arr, mid);

            if (split <= k) {
                high = mid -1 ;
                
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

      static int findSplit(int[] arr, int max) {
        int split = 1;
        int total = 0;
        for (int j = 0; j < arr.length; j++) {
            if (total + arr[j] > max) {
                split++;
                total = arr[j];
            }
            else{
                total += arr[j];
            }
        }

        return split;
     }

     static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
     }

     static int maximum(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
     }
}