package linkedListPrograms;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.remove(1);
		System.out.println(s);
		//peek()
		System.out.println(s.peek());
	}

}
