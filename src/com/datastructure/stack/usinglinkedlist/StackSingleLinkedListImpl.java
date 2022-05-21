package com.datastructure.stack.usinglinkedlist;

public class StackSingleLinkedListImpl {

	private class Node {
		int item;
		Node next;
	}

	private Node top;

	StackSingleLinkedListImpl() {
		this.top = null;
	}

	public void push(int item) {
		Node newNode = new Node();
		/*
		 * if (newNode == null) { throw new RuntimeException("Heap Overflow"); }
		 */
		newNode.item = item;
		newNode.next = top;
		top = newNode;
	}

	public int pop() {
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		}

		int temp = top.item;
		top = top.next;

		return temp;
	}

	public int peek() {
		if (top == null) {
			throw new RuntimeException("Stack is empty");
		}

		return top.item;
	}

	public void print() {
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		}
		Node temp = top;
		while (temp != null) {
			System.out.print(" " + temp.item);
			temp = temp.next;
		}
	}
}
