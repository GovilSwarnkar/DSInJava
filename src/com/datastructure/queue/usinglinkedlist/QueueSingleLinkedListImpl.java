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
			this.rear = this.front = newNode;
		} else {
			this.rear.next = newNode;
			this.rear = this.rear.next;
		}
	}

	public int dequeue() {
		if (isEmptyRear.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		Node temp = this.front;
		this.front = this.front.next;

		if (isEmptyFront.test(this)) {
			this.rear = null;
		}
		return temp.key;
	}

	public int front() {
		if (isEmptyRear.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		return this.front.key;
	}

	public int rear() {
		if (isEmptyFront.test(this)) {
			throw new RuntimeException("Queue is empty");
		}
		return this.rear.key;
	}
}
