package advancedString;
import java.util.*;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("Not a rotation");
            return;
        }

        String combined = s1 + s1;

        if (combined.contains(s2)) {
            System.out.println("Rotation of string");
        } else {
            System.out.println("Not a rotation");
        }
    }
}
