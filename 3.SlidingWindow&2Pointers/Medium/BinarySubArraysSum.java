import java.util.HashMap;

public class BinarySubArraysSum {
    
    public static void main(String[] args) {

        // Brute Force
        
        // int[] nums = {1,0,1,0,1};
        // int goal = 2;
        // int sum = 0;
        // int count = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum+=nums[j];
        //         if (sum == goal) {
        //             count++;
        //         }
        //         if (sum>goal) {
        //             break;
        //         }
        //     }
        // }
        // System.out.println(count);



        //Better Solution

        // int[] nums = {1,0,1,0,1};
        // int goal = 2;
        // int sum = 0;
        // int count = 0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(0,1); // At first we remove nothing from the array

        // for (int i = 0; i < nums.length; i++) {
            
        //     sum+=nums[i];
            
        //     if (map.containsKey(sum - goal)) {
        //         count+=map.get(sum-goal);
        //     }
            
        //     map.put(sum, map.getOrDefault(sum, 0)+1);

        // }

        // System.out.println(count);


        // Optimal Solution using sliding window

        // First calculating how many subarrays sum <=goal  then sum <= goal-1

        int[] nums = {1,0,1,0,1};
        int goal = 0;
        System.out.println(func(goal, nums) - func(goal - 1, nums));
    }

    public static int func (int goal, int[] nums){

        int count = 0;
        int right = 0;
        int left = 0;
        int sum = 0;
        while (right<nums.length) {
            if (goal<0) {
                return 0;
            }
            sum += nums[right];

            while(sum>goal) {
                sum -= nums[left];
                left ++;
            }

            count += right - left + 1;
            right ++;
        }

        return count;
    }
}


