public class Search2D {

    // 74. Search a 2D Matrix
    public static void main(String[] args) {

        
        // Example 1:
        
        // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
        // Output: true
        // Example 2:
        
        
        // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
        // Output: false
        
    int[][] matrix = {
        {1,3,5,7},
        {10,11,16,20},
        {23,30,34,60}
    };

    int target = 3;
    System.out.println(binarySearch(matrix , target));


    }
    static boolean binarySearch(int[][] matrix, int target) {


        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = (m*n)-1;

        while (low<=high) {
            int mid = ( low + high )/ 2;
            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col]== target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                low = mid + 1 ;
            }
            else{
                high = mid - 1;
            }
        }
        return false;

    }
}
