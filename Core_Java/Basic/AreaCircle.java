import java.util.*;
class AreaCircle
{
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) 
    {
        Circle();
        Square();
        Triangle();
    }

    public static void Circle()
    {
        System.out.println("Enter Radius:");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    public static void Square()
    {
        System.out.println("Enter side:");
        int s = sc.nextInt();
        System.out.println("Area of Square: " + (s * s));
    }

    public static void Triangle()
    {
        System.out.println("Enter height:");
        double h = sc.nextDouble();
        System.out.println("Enter breadth:");
        double b = sc.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * b * h)); 
    }
}
