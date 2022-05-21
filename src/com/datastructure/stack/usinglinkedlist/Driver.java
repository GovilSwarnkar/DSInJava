package com.datastructure.stack.usinglinkedlist;

public class Driver {

	public static void main(String[] args) {
		StackSingleLinkedListImpl stack = new StackSingleLinkedListImpl();
		for(int i = 0; i  < 10; i++) {
			stack.push(i);
		}
		stack.print();
		
		System.out.println("\n--------------------");
		System.out.println("poped item : " + stack.pop());
		stack.print();
		
		System.out.println("\n--------------------");
		stack.push(23);
		stack.print();
		
		System.out.println("\n--------------------");
		System.out.println("peek item : "  +stack.peek());
	}
	
}
