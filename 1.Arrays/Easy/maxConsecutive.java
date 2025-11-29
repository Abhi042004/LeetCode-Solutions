public class maxConsecutive {
    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};
        
        int max = -1;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                temp++;
                if(max<temp){
                    max = temp;
                }
            }
            else{
                temp=0;
            }
        }
        System.out.println(max);

    }
}
