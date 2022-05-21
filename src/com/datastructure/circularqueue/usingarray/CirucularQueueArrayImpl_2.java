package com.datastructure.circularqueue.usingarray;

import java.util.function.Predicate;

public class CirucularQueueArrayImpl_2 {

	private int front, rear;
	private int capacity;
	private int[] q;

	private Predicate<CirucularQueueArrayImpl_2> isFull = queue -> queue.front == queue.rear;
	private Predicate<CirucularQueueArrayImpl_2> isEmpty = isFull;
	
	public CirucularQueueArrayImpl_2(int capacity) {
		this.front = -1;
		this.rear = -1;
		this.capacity = capacity + 1;
		this.q = new int[this.capacity];
	}

	public void enqueue(int item) {
		this.rear = (this.rear + 1) % capacity;
		if (isFull.test(this)) {
			if (this.rear == 0) {
				this.rear = this.capacity - 1;
			} else {
				this.rear -= 1;
			}
			throw new RuntimeException("Queue is full");
		} else {
			this.q[rear] = item;
		}
	}

	public int dequeue() {
		if (isEmpty.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		this.front = (this.front + 1) % capacity;
		int item = q[this.front];
		return item;
	}

	public int front() {
		if (isEmpty.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		return this.q[ (this.front + 1) % capacity];
	}

	public int rear() {
		if (isEmpty.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		return this.q[this.rear];
	}
}
