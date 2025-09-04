public class EvenNumber{

    // 1295. Find Numbers with Even Number of Digits
    public static void main(String[] args) {
        
        //Example 1:

        // Input: nums = [12,345,2,6,7896]
        // Output: 2
        // Explanation: 
        // 12 contains 2 digits (even number of digits). 
        // 345 contains 3 digits (odd number of digits). 
        // 2 contains 1 digit (odd number of digits). 
        // 6 contains 1 digit (odd number of digits). 
        // 7896 contains 4 digits (even number of digits). 
        // Therefore only 12 and 7896 contain an even number of digits.
        // Example 2:

        // Input: nums = [555,901,482,1771]
        // Output: 1 
        // Explanation: 
        // Only 1771 contains an even number of digits.

        int[] nums = {12,345,2,6,7896};
        int count = 0;


        for (int i = 0; i < nums.length; i++) {
            if ((int) (Math.log10(nums[i])+1)%2 == 0){
                count++;
            }
        }

        // Second method would be to conver each nums[i] 
        // into string and then applying .length() function to it then modulus 2
        // but it would take some extra time

        System.out.println(count);
    }
}