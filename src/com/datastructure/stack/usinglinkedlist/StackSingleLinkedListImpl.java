package com.datastructure.stack.usinglinkedlist;

public class StackSingleLinkedListImpl {

	private class Node {
		int item;
		Node next;

		private Node(int item) {
			this.item = item;
		}
	}

	private Node top;

	StackSingleLinkedListImpl() {
		this.top = null;
	}

	public void push(int item) {
		Node newNode = new Node(item);
		/*
		 * if (newNode == null) { throw new RuntimeException("Heap Overflow"); }
		 */
		newNode.next = top;
		top = newNode;
	}

	public int pop() {
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		}

		int temp = top.item;
		Node t = top;
		top = top.next;
		t.next = null;
		t = null;
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
