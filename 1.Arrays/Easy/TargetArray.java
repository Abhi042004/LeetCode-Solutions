import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {

    // 1389. Create Target Array in the Given Order
    public static void main(String[] args) {

//Example 1:

// Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
// Output: [0,4,1,3,2]
// Explanation:
// nums       index     target
// 0            0        [0]
// 1            1        [0,1]
// 2            2        [0,1,2]
// 3            2        [0,1,3,2]
// 4            1        [0,4,1,3,2]
// Example 2:

// Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
// Output: [0,1,2,3,4]
// Explanation:
// nums       index     target
// 1            0        [1]
// 2            1        [1,2]
// 3            2        [1,2,3]
// 4            3        [1,2,3,4]
// 0            0        [0,1,2,3,4]
// Example 3:

// Input: nums = [1], index = [0]
// Output: [1]
    int[]   nums = {0,1,2,3,4};
    int[]  index = {0,1,2,2,1};
    int[]  target = new int[nums.length];

    ArrayList<Integer> list = new ArrayList<>(nums.length);

    for (int i = 0; i < index.length; i++) {
        list.add(index[i], nums[i]);
    }
    
    for (int i = 0; i < index.length; i++) {
        target[i] = list.get(i);
    }
    System.out.println(Arrays.toString(target));
    }
}
