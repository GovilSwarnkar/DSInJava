package com.datastructure.queue.usinglinkedlist;

import java.util.function.Predicate;

public class QueueSingleLinkedListImpl {
	private class Node {
		int key;
		Node next;

		private Node(int key) {
			this.key = key;
		}
	}

	private Node front;
	private Node rear;

	private Predicate<QueueSingleLinkedListImpl> isEmptyFront = queue -> queue.front == null;
	private Predicate<QueueSingleLinkedListImpl> isEmptyRear = queue -> queue.rear == null;

	public void enqueue(int key) {
		Node newNode = new Node(key);
		if (isEmptyFront.test(this)) {
			rear = front = newNode;
		} else {
			rear.next = newNode;
			rear = rear.next;
		}
	}

	public int dequeue() {
		if (isEmptyRear.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		Node temp = front;
		front = front.next;
		temp.next = null;
		int item = temp.key;
		temp = null;

		if (isEmptyFront.test(this)) {
			rear = null;
		}
		return item;
	}

	public int front() {
		if (isEmptyRear.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		return front.key;
	}

	public int rear() {
		if (isEmptyFront.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		return rear.key;
	}
}
