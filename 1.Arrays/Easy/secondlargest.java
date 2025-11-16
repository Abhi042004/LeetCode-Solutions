public class secondlargest {
    public static void main(String[] args) {
        // Second Largest Element in Array
        int arr[] = {12 ,35 ,1, 10 ,34 ,1};

        int max = arr[0];
        int second = -1;

        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i] ) {
                second = max;
                max = arr[i];
            }
            if (max>arr[i] && second < arr[i]) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
