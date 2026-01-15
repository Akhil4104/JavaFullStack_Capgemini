package advancedString;
import java.util.*;

public class Question8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String word = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                System.out.println(word);
                word = "";
            }
        }

        System.out.println(word);
    }
}
