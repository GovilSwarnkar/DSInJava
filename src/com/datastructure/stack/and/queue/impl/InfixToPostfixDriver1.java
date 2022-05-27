package com.datastructure.stack.and.queue.impl;

public class InfixToPostfixDriver1 {

	public static void main(String[] args) {
		InfixToPostfix1 infixToPostfix = new InfixToPostfix1();
		//System.out.println(infixToPostfix.infixToPostfix("(a+b)*c)-d^e^f "));     //  ab+c*def^^-
		System.out.println(infixToPostfix.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i")); //abcd^e-fgh*+^*+i-
		System.out.println(infixToPostfix.infixToPostfix("(a+b*(c^d-e)^(f+g*h)-i)"));
		System.out.println(infixToPostfix.infixToPostfix("(a+b*(c^d-e)^(f+g*h)-i"));
		//System.out.println(infixToPostfix.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i)")); //mactching paranthesis not working
		System.out.println(infixToPostfix.infixToPostfix("-i"));
		System.out.println(infixToPostfix.infixToPostfix("a*b+(c-d)"));
		System.out.println("-----------------------------------------------------------------------------------------");
	}  
}


