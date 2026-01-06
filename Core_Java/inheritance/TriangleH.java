package inheritance;

public class TriangleH extends ShapeH {
    int base;
    int height;
    TriangleH(int b, int h) {
        this.base = b;
        this.height = h;
    }
    void area() {
        double result = 0.5 * base * height;
        System.out.println("Triangle Area : " + result);
    }
}