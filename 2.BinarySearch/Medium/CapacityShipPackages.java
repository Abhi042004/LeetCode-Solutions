public class CapacityShipPackages {
    public static void main(String[] args) {
        
        int[] weights = {1,2,3,4,5,6};
        int days = 3;

        // capacity(weights , days);
        System.out.println(capacity(weights, days));
    }

    static int capacity(int[] weights, int days) {


        int low = max(weights);
        int high = sum(weights);

        while (low<=high) {
            int mid = low+(high-low)/2;

            int d = check(weights, mid);

            if (d <= days) {
                high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }

        return low;
    }

    static int check(int[] weights, int mid) {
        int d = 1;
        int total = 0;
        for (int i = 0; i < weights.length; i++) {
            
            if (total+weights[i]>mid) {
                d+=1;
                total = weights[i];
            }
            else{
                total+=weights[i];
            }          
        }
        return d;
    }

    static int sum(int[] weights) {
        int total = 0;
        for (int i = 0; i < weights.length; i++) {
            total+= weights[i];
        }

        return total;
    }

    static int max(int[] weights) {
        int max = weights[0];
        for (int i = 0; i < weights.length; i++) {
            if (max<weights[i]) {
                max = weights[i];
            }
        }
        return max;
     }
}
