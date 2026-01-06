package inheritance;

class CircleH extends ShapeH {
    int radius;

    CircleH(int r) {
        this.radius = r;
    }
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}