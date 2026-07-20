import java.util.HashMap;
import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElementI {

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = findGreatest(nums2);

        int[] nge = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            nge[i] = map.get(nums1[i]);
        }

        return nge;
    }

    public static HashMap<Integer, Integer> findGreatest(int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums2[i] >= stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            stack.push(nums2[i]);
        }

        return map;
    }
}