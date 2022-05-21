package com.datastructure.stack.usingarray;

public class Driver {

	public static void main(String[] args) {
		StackArrayImpl stack = new StackArrayImpl();

		/*
		 * for(int i = 0; i < 11; i++) { stack.push(i); }
		 */

		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		stack.print();

		System.out.println("\n----------------------------------");
		System.out.println("pop item  : " + stack.pop());
		stack.print();

		System.out.println("\n----------------------------------");
		stack.push(12);
		stack.print();
		
		System.out.println("\n----------------------------------");
		/*
		 * for(int i = 0; i < 12; i++) { stack.pop(); }
		 */
		
		System.out.println(stack.peek());
		
	}

}
