import java.util.Arrays;

public class FlippingImage {

    // 832. Flipping an Image
    public static void main(String[] args) {
        
    // Example 1:

    // Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    // Output: [[1,0,0],[0,1,0],[1,1,1]]
    // Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    // Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
    // Example 2:

    // Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
    // Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
    // Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
    // Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] arr = new int[image.length][];
        for (int i = 0 ; i<image.length;i++){
            int col =0;
            arr[i] = new int[image[i].length];
            for(int j = image[i].length-1; j>=0 ;j--){
                arr[i][col] = image[i][j];
                col++;
            }
           
        }
        

        for(int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }

        }
        
        for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
        }
    }
}
