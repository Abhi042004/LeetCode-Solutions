import java.util.HashMap;

public class CountNumOfNiceSubArrays {
    public static void main(String[] args) {
        

        // int[] nums = {2,2,2,1,2,2,1,2,2,2};
        // int k = 2;

        // int count = 0;
        // int odd_count = 0;

        // for(int i = 0; i<nums.length; i++){

        //     odd_count = 0;

        //     for(int j = i; j<nums.length; j++){

        //         if(nums[j]%2 != 0){
        //             odd_count++;
        //         }
        //         if(odd_count == k){
        //             count++;
        //         }
        //         if(odd_count>k){break;}
                
        //     }
        // }
        // System.out.println(count);

        // Better Solution

        // int[] nums = {2,2,2,1,2,2,1,2,2,2};
        // int k = 2;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int sum = 0;
        // int count = 0;
        // map.put(0,1);

        // for(int i = 0; i<nums.length; i++){

        //     if(nums[i]%2 != 0){
        //         sum+=1;
        //     }
        //     if(map.containsKey(sum - k)){
        //         count+=map.get(sum-k);
        //     }
        //     map.put(sum, map.getOrDefault(sum, 0)+1);
        // }
        // System.out.println(count);

        // Optimal Solution

        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(atMostKOdds(k, nums) - atMostKOdds(k-1, nums));
        
    }

    public static int atMostKOdds(int k, int[]nums){

        int left = 0;
        int odd_count = 0;
        int result = 0;

        if(k<0){
            return 0;
        } 

        for(int right = 0; right<nums.length; right++){

            if(nums[right]%2 != 0){
                odd_count += 1;
            }
        
            while(odd_count>k){
                if(nums[left]%2 != 0){
                    odd_count -= 1;
                }
                left ++;
            }

            result += right - left + 1;
        }
        return result;
  }
}
