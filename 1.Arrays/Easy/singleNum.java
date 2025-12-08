public class singleNum {
    public static void main(String args[]){
        // 136. Single Number

        int[] arr = {4,1,2,1,2};
        int xor = 0;
        for (int i : arr) {
            xor = xor^i;
        }
        System.out.println(xor);
    }
}
