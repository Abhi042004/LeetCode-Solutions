import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        
        
        int[] arr = {1,3,2};
        int idx = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] < arr[i+1]) {
                idx = i;
                break;
            }
        }
        

        if (idx == -1) {
            reverse(arr, 0);
        }
       
        else{
            int i = -1;
            for (i = arr.length-1; i > idx; i--) {
                if (arr[i]>arr[idx]) {

                    swap(arr, i, idx);
                    break;
                }
            }
            reverse(arr, idx+1);
            

        }
        System.out.println(Arrays.toString(arr));
        
    }

    public static void reverse(int[] arr, int start) {
    int end = arr.length - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

    public static void swap(int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
