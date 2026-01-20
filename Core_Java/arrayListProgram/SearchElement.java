package arrayListProgram;

import java.util.ArrayList;

public class SearchElement {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(new Student("Rahul", 11));
        System.out.println(a1.contains(10));   
        System.out.println(a1.indexOf(30));    
        System.out.println(a1.contains(new Student("Rahul", 11)));
    }
}
