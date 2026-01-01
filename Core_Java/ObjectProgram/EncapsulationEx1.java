package ObjectProgram;

public class EncapsulationEx1{
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.Inner e1 = o.new Inner();
        Outer1.Inner.display();
        e1.test();
    }
}
