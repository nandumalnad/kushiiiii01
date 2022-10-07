package collections;

import java.util.PriorityQueue;

public class PriorityQueue2 {
public static void main(String[] args) {
	PriorityQueue<String> queue = new PriorityQueue<String>();
	queue.add("hi");
	queue.add("hello");
	queue.add("hihello");
	queue.add("bye");
	queue.add("goodbye");
	System.out.println(queue);
	System.out.println(queue.peek());
	System.out.println(queue.poll());
	System.out.println(queue);
	
	
	
}
}
