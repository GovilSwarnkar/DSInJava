package com.datastructure.queue.usinglinkedlist;

public class Driver2 {

	public static void main(String[] args) {
		QueueSingleLinkedListImpl queue = new QueueSingleLinkedListImpl();
		for (int i = 1; i <= 10; i++) {
			queue.enqueue(i);
		}

		System.out.println("dequeue : " + queue.dequeue());
		System.out.println("dequeue : " + queue.dequeue()); // 2 item deleted, overall 8 item
		queue.enqueue(12);
		queue.enqueue(13); // 2 item addes, overall 10 item

		System.out.println("front : " + queue.front());
		System.out.println("rear : " + queue.rear());

		System.out.println("dequeue : " + queue.dequeue()); // 1 item deleted, overall 9 item
		queue.enqueue(14);

		System.out.println("front : " + queue.front());
		System.out.println("rear : " + queue.rear());

		System.out.println("dequeue : " + queue.dequeue());

		System.out.println("front : " + queue.front());
		System.out.println("rear : " + queue.rear());

		queue.enqueue(15);
		// queue.enqueue(16);

		System.out.println("front : " + queue.front());
		System.out.println("rear : " + queue.rear());
	}
}
