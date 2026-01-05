import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        


        int[] nums = {4, 1, 2, 1, 1};

        // int mostfreq = -1;
        // int num = -1;
        
        // Brute Force
        // int x= -1;
        
        // for (int i = 0; i < nums.length; i++) {
            
        //     num = nums[i];
        //     int count = 0;
        //     for (int j = 0; j < nums.length; j++) {
                
        //         if (num==nums[j]) {
        //             count++;
        //         }
        //     }
        //     if ((nums.length/2)<count) {
        //         mostfreq = Math.max(mostfreq, count);
        //         x = nums[i];
        //     }
        // }

        // System.out.println(x);
        // System.out.println(mostfreq);


        // Better Solution
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int n = nums.length;
        // for (int i : nums) {
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }
        
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

        //     if ((n/2)<entry.getValue()) {
        //         num = entry.getKey();
        //         mostfreq = entry.getValue();
        //     }
        // }
        // System.out.println(num);

        // Optimal Solution
        // int[] nums = {2,2,1,1,1,2,2};

        int temp = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if (count == 0) {
                count = 1;
                temp = nums[i];
            }
            else if (temp==nums[i]) {
                count++;
            }
            else{
                count--;
            }
        }
        if (count==0) {
            System.out.println(-1);
        }
        else{
            System.out.println(temp);
        }
        
    }
}
