import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        

        String s = "a good   example";
        String[] words = s.trim().split("\\s+");

        StringBuilder text = new StringBuilder();

        for (int i = words.length-1; 0 <= i ; i--) {
           text.append(words[i]);
           if (i !=0) {
                text.append(' ');
           }
        }
        System.out.println(text);
    }
}
