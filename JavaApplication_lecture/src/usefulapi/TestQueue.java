package usefulapi;

import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		Queue <String> queue=new LinkedList<String>();
		queue.add("Morning");
		queue.add("Afternoon");
		System.out.println("첫번째 요소:" + queue.peek());
		System.out.println("큐의 크기:" + queue.size());
		System.out.println("첫번째 요소:" + queue.poll());
		System.out.println("큐의 크기:" + queue.size());
	}
}
