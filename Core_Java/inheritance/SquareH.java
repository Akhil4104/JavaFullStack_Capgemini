package inheritance;

class SquareH extends ShapeH {
    int side;

    SquareH(int s) {
        this.side = s;
    }
    void area() {
        int result = side * side;
        System.out.println("Square Area: " + result);
    }
}