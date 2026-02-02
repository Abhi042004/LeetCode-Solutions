public class MaximumPoints {
    public static void main(String[] args) {
        
        int[] points = {9,7,7,9,7,7,9};
        int k = 7;
        int max = 0;
        int sum = 0;
        

        for (int i = 0; i < k; i++) {
            sum +=points[i];
            max = Math.max(max, sum);
        }     

        int right_side = points.length-1;
        for (int i = k-1; i >= 0; i--) {
            
            sum -= points[i];
            sum += points[right_side--];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
