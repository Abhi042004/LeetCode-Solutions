import java.util.Arrays;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        

        // Another Variation
        // - Number of positive and negatives are not equal

        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int positive_count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0) {
                positive_count++;
            }
        }
        
        int[] positive_arr = new int[positive_count];
        int[] negative_arr = new int[arr.length - positive_count];
        int posIndex = 0;
        int negIndex = 0;

        for (int i = 0; i <  arr.length; i++) {
            if (arr[i]>=0) {
                positive_arr[posIndex++] = arr[i];
            }
            else{
                negative_arr[negIndex++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(positive_arr));
        System.out.println(Arrays.toString(negative_arr));

        if (posIndex>negIndex) {
            System.out.println("positive greater");
        }
        else{
            System.out.println("Negative is greater");
        }

        int[] new_arr = new int[arr.length];
        int pos_idx = 0;
        int neg_idx = 0;

        for (int i = 0; i < new_arr.length; i++) {
            
            if (i%2==0) {
                if(pos_idx<posIndex){
                    new_arr[i]=positive_arr[pos_idx++];
                }
                else{
                    new_arr[i]=negative_arr[neg_idx++];
                }
            }
            else{
                if(neg_idx<negIndex){
                    new_arr[i] = negative_arr[neg_idx++];
                }
                else{
                    new_arr[i] = positive_arr[pos_idx++];
                }
            }
            
        }
        System.out.println(Arrays.toString(new_arr));


        // int[] arr = {3,1,-2,-5,2,-4};
       
        // Better/Optimal Solution
        // int[] newArray = new int[arr.length];
        // int posIndex = 0;
        // int negIndex = 1;
        // int i = 0;

        // while (i<arr.length) {
        //     if (arr[i]>0) {
        //         newArray[posIndex] = arr[i];
        //         posIndex+=2;

        //     }
        //     else{

        //         newArray[negIndex] = arr[i];
        //         negIndex+=2;
            
        //     }
        //     i++;
        // }
        // System.out.println(Arrays.toString(newArray));
        
    

    }

}
