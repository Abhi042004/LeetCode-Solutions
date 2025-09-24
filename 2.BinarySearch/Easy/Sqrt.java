public class Sqrt {
    
    public static void main(String[] args) {

        // 69. Sqrt(x)
        int  x = 2147395599;
        System.out.println(sqrt(x));

    }
     static int sqrt(long x) {

        if (x == 0) {
            return 0;
        }
        else if (x == 1) {
            return 1;
        }
        else{

            long low = 2;
            long high = x/2;

            while (low<=high) {
                long mid = low+(high -low)/2;

                if (mid*mid == x) {
                    return (int)mid;
                }
                else if (mid*mid > x) {
                    high = mid -1;
                }
                else {
                    low = mid+1;
                }
            }
            return (int)high;
        }
    }
}