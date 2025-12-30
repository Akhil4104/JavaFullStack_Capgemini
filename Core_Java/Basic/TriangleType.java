package Basic;
import java.util.*;
class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } 
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } 
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
