import java.util.*;
public class FruitIntoBaskets {
    public static void main(String[] args) {
        

        // Brute Force
        // int[] fruits = {1, 2, 3, 2, 2, 1, 4};
        // int dist = 0;
        // int same = 0;
        // int max = -1;
        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < fruits.length; i++) {
            
        //     same = 0;
        //     dist = 0;
        //     set.clear();
        //     for (int j = i; j < fruits.length; j++) {

                
        //             if (set.contains(fruits[j]) != true) {
        //                 dist+=1;
        //                 if (dist == 3) {
        //                     break;
        //                 }
        //                 set.add(fruits[j]);
        //             }
        //             if (dist<=2) {
        //                     same +=1;
        //                     max = Math.max(max, same);
        //                     System.out.print(fruits[j]+" ");
        //             }
        //     }
        //     System.out.println();
        // }
        // System.out.println(max);


        // Better Solution
        int[] fruits = {1,2,3,2,2};
       
       
        int max = -1;
        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int last = 0;

        while (right<fruits.length) {
            
            map.put(fruits[right], map.getOrDefault(fruits[right], 0)+1);
            if(map.size()>2) {
                map.put(fruits[left],map.get(fruits[left])-1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            if (map.size()<=2) {
                max = Math.max(max, right-left+1);
            }
            right ++;
        }
        System.out.println(max);
    }
}
