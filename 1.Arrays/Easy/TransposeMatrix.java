import java.util.Arrays;

public class TransposeMatrix {

    // 867. Transpose Matrix

    // Example 1:

    // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    // Output: [[1,4,7],[2,5,8],[3,6,9]]
    // Example 2:

    // Input: matrix = [[1,2,3],[4,5,6]]
    // Output: [[1,4],[2,5],[3,6]]
 
    public static void main(String[] args) {

        int[][] matrix = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                         };
        int[][] arr = new int[matrix[0].length][matrix.length];
        
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length; j++){
                arr[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}   
   
