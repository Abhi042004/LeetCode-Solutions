public class largestNo {
    public static void main(String[] args) {
        
    // Largest Element in Array

        int arr[] = {1, 8, 7, 56, 90};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
