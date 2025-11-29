import java.util.HashMap;
import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        
        int[] arr = {0,2,3};

// This is using HashMap but there is no use of values so we will use hashset because it only stores keys

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i : arr) {
        //     map.put(i, 0);
        // }

        // int i;
        // for (i = 0; i <= arr.length; i++) {
        //     if (map.containsKey(i)==false) {
        //         break;
        //     }
        // }
        // System.out.println(i);

    //     HashSet<Integer> set = new HashSet<>();

    //     for (int i : arr) {
    //         set.add(i);
    //     }
    //     System.out.println(set);
    //     int i;
    //     for (i = 0; i <= arr.length; i++) {
    //         if (set.contains(i)==false) {
    //             break;
    //         }
    //     }
    //     System.out.println(i);

    // One of the Optimal Solution - using sum method
    // int sum = 0;
    // int s;
    // for (int i = 0; i < arr.length; i++) {
    //     sum += arr[i];
    // }
    // System.out.println(sum);

    // s = (arr.length*(arr.length+1))/2;
    // System.out.println(s-sum);
    // }

    // Using XOR
    int XOR1=0;
    int XOR2=0;

    for (int i = 0; i < arr.length; i++) {
        XOR1 = XOR1^i; 
        XOR2 = XOR2^arr[i];
    }
    XOR1 = XOR1^arr.length;
    System.out.println(XOR1^XOR2);
    }
}
