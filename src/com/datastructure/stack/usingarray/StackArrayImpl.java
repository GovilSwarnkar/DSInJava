package com.datastructure.stack.usingarray;

public class StackArrayImpl {

	int MAX = 10;
	int[] stack = new int[MAX];
	int top = -1;

	public void push(int item) {
		if (top >= (MAX - 1)) {
			throw new RuntimeException("Stack Overflow");
		}
		stack[++top] = item;
	}

	public int pop() {
		if (top < 0) {
			throw new RuntimeException("Stack underflow");
		}
		int temp = stack[top--];
		return temp;
	}

	public int peek() {
		if (top < 0) {
			throw new RuntimeException("Stack underflow");
		}
		int peek = stack[top];
		return peek;
	}

	public void print() {
		for (int i = top; i > -1; i--) {
			System.out.print(" " + stack[i]);
		}
	}

}
