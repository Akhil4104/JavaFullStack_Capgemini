package ObjectProgram;

public class Outer1 {
    class Inner {  

        static void display() {
            System.out.println("Non-Static Method");
        }

        void test() {
            System.out.println("Another Non-Static Method");
        }
    }
}
