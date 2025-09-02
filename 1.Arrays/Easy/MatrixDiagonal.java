public class MatrixDiagonal {

    // 1572. Matrix Diagonal Sum
    public static void main(String[] args) {

    //Input: mat = [[1,2,3],
    //               [4,5,6],
    //               [7,8,9]]
    // Output: 25
    // Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    // Notice that element mat[1][1] = 5 is counted only once.
    // Example 2:

    // Input: mat = [[1,1,1,1],
    //               [1,1,1,1],
    //               [1,1,1,1],
    //               [1,1,1,1]]
    // Output: 8
    // Example 3:

    // Input: mat = [[5]]
    // Output: 5
        
        int[][] mat = {
                        {1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1}
                    };

        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            
            for (int j = mat[i].length-1; j >= 0; j--) {
              

                if (i!=j && i+j==mat[i].length-1) {
                    sum+=mat[i][j];
                }
                
        }
    }
    System.out.println(sum);
}
}
