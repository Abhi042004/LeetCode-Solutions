public class KokoEatingBananas{
    public static void main(String[] args) {
        // 875. Koko Eating Bananas
        int[] arr = {805306368,805306368,805306368};
        int h = 1000000000;
   
        System.out.println(minInteger(arr , h));

    }

     static int minInteger(int[] arr, int h) {

        int low = 1;
        int high = max(arr);

        while (low<=high) {
            int rate = low + (high - low)/2;

            long total_hour = check(arr , rate);
            
            if (total_hour>h) {

                low = rate + 1;
            }
            else{
                high = rate - 1;
            }
        }
        
        return low;
    }

      static long check(int[] arr, int mid) {
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

                if (arr[i]%mid == 0) {
                    sum+=arr[i]/mid;
                }
                else{
                    sum+=(arr[i]/mid)+1;
                }
            }

        return sum;
     }
     static int max(int[] arr){

        int highest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (highest<arr[i]) {
                highest = arr[i];
            }
        }

        return highest;
     }
}