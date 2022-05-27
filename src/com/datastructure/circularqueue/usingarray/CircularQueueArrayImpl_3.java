package com.datastructure.circularqueue.usingarray;

public class CircularQueueArrayImpl_3 {

	private int rear;
	private int front;
	private int n;
	private int[] q;

	public CircularQueueArrayImpl_3(int n) {
		this.rear = 0;
		this.front = 0;
		this.n = n;
		this.q = new int[n];
	}

	void enqueue(int item) {
		rear = (rear + 1) % n;
		if (rear == front) {
			System.out.println("Queue is full");
			if (rear == 0) {
				rear = n - 1;
			} else {
				rear = rear - 1;
			}
		} else {
			q[rear] = item;
		}
	}

	public int dequeue() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		front = (front + 1) % n;
		int item = q[front];
		return item;
	}

	int rear() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		return q[rear];
	}

	int front() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		return q[front];
	}
}
