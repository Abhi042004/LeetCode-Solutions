public class arraySortedorNot {
    // 1752. Check if Array Is Sorted and Rotated
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>nums[(i+1)%nums.length]) {
                count++;
            }
            if(count > 1){ 
                System.out.println("false");
                break;
            }
        }
        
    }  
}
