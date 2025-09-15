public class SmallestLetter {

    // 744. Find Smallest Letter Greater Than Target
    public static void main(String[] args) {

//Example 1:

// Input: letters = ["c","f","j"], target = "a"
// Output: "c"
// Explanation: The smallest character that is lexicographically 
// greater than 'a' in letters is 'c'.
// Example 2:

// Input: letters = ["c","f","j"], target = "c"
// Output: "f"


// Input: letters = ["x","x","y","y"], target = "z"
// Output: "x"

        char[] letters = {'j','j','j'};
        char target = 'j';

        System.out.println(nextGreatestLetter(letters, target));
    }
 
    static char nextGreatestLetter(char[] letters, char target) {
        
        int low = 0;
        int high = letters.length-1;
        while (low <= high) {
            int middle = low + (high-low)/2;

            if (letters[middle] > target) {
                high = middle -1;
            }
            else{
                low = middle +1;
            }
            
        }
        return letters[low%letters.length];
    }
}

