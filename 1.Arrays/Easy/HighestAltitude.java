public class HighestAltitude{

    // 1732. Find the Highest Altitude

    public static void main(String[] args) {
        
    // Example 1:

    // Input: gain = [-5,1,5,0,-7]
    // Output: 1
    // Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
    // Example 2:

    // Input: gain = [-4,-3,-2,-1,4,3,2]
    // Output: 0
    // Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

       int[] gain = {-5,1,5,0,-7};
       int[] ans = new int[gain.length+1];
       int max = ans[0];
    

       for (int i = 0; i < gain.length; i++) {

        ans[i+1] = ans[i] + gain[i];
        
        if(max<ans[i+1]){
            max = ans[i+1];
        }
    
       }
       System.out.println(max);
      
    }
}