package advancedString;
import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        boolean onlyDigits = true;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) < '0' || n.charAt(i) > '9') {
                onlyDigits = false;
                break;
            }
        }

        if (onlyDigits) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String is not only digits");
        }
    }
}
