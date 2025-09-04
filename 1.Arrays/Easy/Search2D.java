public class Search2D {

    // 74. Search a 2D Matrix
    public static void main(String[] args) {

    int[][] matrix = {
        {1,3,5,7},
        {10,11,16,20},
        {23,30,34,60}
    };

    int target = 3;
        
    // Example 1:

    // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    // Output: true
    // Example 2:


    // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
    // Output: false

        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(target == matrix[i][j]){
                    System.out.println("Element found");
                }
            }
        }
        // otherwise we can return or print not found
    }
}
