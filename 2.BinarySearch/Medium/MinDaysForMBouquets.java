public class MinDaysForMBouquets {

    // 1482. Minimum Number of Days to Make m Bouquets
    public static void main(String[] args) {
        
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        System.out.println(minDays(bloomDay,m,k));
    }

    static int minDays(int[] bloomDay, int m , int k) {

        int[] minmax = minMax(bloomDay);
        int low = minmax[0];
        int high = minmax[1];
        int ans = -1;

        if (m*k > bloomDay.length) {
            return -1;
        }

        while (low<=high) {
            int mid = low+(high-low)/2;
            int bouquets = check(bloomDay, mid, k);

            if (bouquets >= m) {
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }
        return ans;
    }

    
    
    static int check(int[] bloomDay, int mid, int k) {
        int bouquets = 0;
        int count = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            
        if (bloomDay[i]<=mid) {
            count++;
            if (count == k) {
                bouquets+=1;
                count = 0;
            }
        }
        else{
             count = 0;
        }
                   
        }
        return bouquets;
    }
    
    static int[] minMax(int[] bloomDay) {
        int min = bloomDay[0];
        int max = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            if (max<bloomDay[i]) {
                max = bloomDay[i];
            }
            if (min>bloomDay[i]) {
                min = bloomDay[i];
            }
        }
        return new int[] {min ,max};
     }

}
