package com.datastructure.circularqueue.usingarray;

public class Driver1 {

	public static void main(String[] args) {
		CircularQueueArrayImpl_1 queue = new CircularQueueArrayImpl_1(10);
		for (int i = 1; i <= 10; i++) {
			queue.enqueue(i);
		}

		System.out.println("dequeue : " + queue.dequeue());
		System.out.println("dequeue : " + queue.dequeue()); // 2 item deleted, overall 8 item
		queue.enqueue(12);
		queue.enqueue(13); // 2 item addes, overall 10 item

		System.out.println("dequeue : " + queue.dequeue()); // 1 item deleted, overall 9 item
		queue.enqueue(14); // 1 item added, queue is full
		// queue.enqueue(15); 11th item can not add

		System.out.println("front : " + queue.front());
		System.out.println("rear : " + queue.rear());
	}
}
