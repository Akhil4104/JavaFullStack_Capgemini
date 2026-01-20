package queuePrograms;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.offer(10);
		a.offer(20);
		a.offer(130);
		a.offer("Hello");
		a.offerFirst(5);
		a.offerLast(50);
		a.poll();
		a.pollFirst();
		a.pollLast();
		a.offerFirst("Hi");
		System.out.println(a);

	}

}
