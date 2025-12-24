import java.util.*;

class CheckChar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is in lowercase.");
        } 
        else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is in uppercase.");
        } 
        else if (Character.isDigit(ch)) {
            System.out.println(ch + " is digit.");
        } 
        else {
            System.out.println(ch + " is special character.");
        }
    }
}
