import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        
        int[] arr ={9,9,9,9,9,9};
        int n= arr.length;
        int i =n-1;
        int[] arr1= new int[n+1];
        
       while (i>=0) {
        if(arr[i] == 9){
            arr[i] = 0;
            i--;
            if(i<0){
                int a =1;
                arr1[0] = 1;
                break;
            }
            
        }
        else{
            arr[i]+=1;
            
            break;
        }

       }

       for (int index = 1; index < arr1.length; index++) {
            arr1[index] = 0;
       }
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(arr1));
    }
}
