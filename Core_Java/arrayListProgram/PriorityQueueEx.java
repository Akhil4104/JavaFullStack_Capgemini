package arrayListProgram;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
//		PriorityQueue q=new PriorityQueue();
//		q.offer(10);
//		q.offer(30);
//		q.offer(3);
//		q.offer(5);
//		q.offer(20);
//		q.offer(1);
//		q.offer(1);
//		System.out.println(q);
		ArrayBlockingQueue a1=new ArrayBlockingQueue(5);
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		a1.add(40);
//		a1.add(50);
		a1.offer(10);
		a1.offer(20);
		a1.offer(30);
		a1.offer(40);
		a1.offer(50);
		a1.offer(60);
		a1.offer(70);
		
		System.out.println(a1);
		

	}

}
