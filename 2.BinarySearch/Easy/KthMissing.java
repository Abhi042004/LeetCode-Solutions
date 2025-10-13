public class KthMissing{
    public static void main(String[] args) {
        // 1539. Kth Missing Positive Number
        int [] arr = {1,3};
        int k = 1;
        System.out.println(findMissing(arr, k));
        
    }

    static int findMissing(int[] arr,int k){


        if (arr[0]>k) {
            return k;
        }

        int low = 0;
        int high = arr.length-1;

        while (low<=high) {

            int mid = low + (high-low)/2;

            if (arr[mid] - (mid + 1) < k) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return arr[high] + k -(arr[high] - (high + 1));

    }

}