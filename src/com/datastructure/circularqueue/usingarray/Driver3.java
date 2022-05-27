package com.datastructure.circularqueue.usingarray;

public class Driver3 {

	public static void main(String[] args) {
		CircularQueueArrayImpl_3 queue = new CircularQueueArrayImpl_3(10);
		for (int i = 1; i <= 9; i++) {
			queue.enqueue(i);
		}

		System.out.println("dequeue : " + queue.dequeue());
		System.out.println("dequeue : " + queue.dequeue()); // 2 item deleted, overall 8 item
		queue.enqueue(12);
		queue.enqueue(13); // 2 item addes, overall 10 item

		System.out.println("front : " + queue.front());
		System.out.println("rear : " + queue.rear());

		System.out.println("dequeue : " + queue.dequeue()); // 1 item deleted, overall 9 item
		queue.enqueue(14); // 1 item added, queue is full
		// queue.enqueue(15); //11th item can not add

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
