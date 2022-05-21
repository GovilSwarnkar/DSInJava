package com.datastructure.circularqueue.usingarray;

public class CircularQueueArrayImpl_1 {

	private int front, rear, size;
	private int capacity;
	private int[] q;

	public CircularQueueArrayImpl_1(int capacity) {
		this.front = this.size = 0;
		this.rear = capacity - 1;
		this.capacity = capacity;
		this.q = new int[capacity];
	}

	private boolean isFull(CircularQueueArrayImpl_1 queue) {
		return (queue.size == queue.capacity);
	}

	private boolean isEmpty(CircularQueueArrayImpl_1 queue) {
		return (queue.size == 0);
	}

	public void enqueue(int item) {
		if (isFull(this)) {
			throw new RuntimeException("Queue is full");
		}
		this.rear = (this.rear + 1) % capacity;
		this.q[rear] = item;
		this.size += 1;
	}

	public int dequeue() {
		if (isEmpty(this)) {
			throw new RuntimeException("Queue is empty");
		}
		int item = this.q[this.front];
		this.front = (this.front + 1) % capacity;
		this.size -= 1;
		return item;
	}

	int front() {
		if (isEmpty(this)) {
			throw new RuntimeException("Queue is empty");
		}

		return this.q[this.front];
	}

	int rear() {
		if (isEmpty(this)) {
			throw new RuntimeException("Queue is empty");
		}

		return this.q[this.rear];
	}

}
