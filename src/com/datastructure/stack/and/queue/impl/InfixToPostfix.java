package com.datastructure.stack.and.queue.impl;

import java.util.Stack;

public class InfixToPostfix {

	public String infixToPostfix(String infix) {
		StringBuilder postfix = new StringBuilder("");
		Stack<Character> operatorStack = new Stack<>();
		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				postfix.append(ch);
			} else if (ch == '(') {
				operatorStack.push(ch);
			} else if (ch == ')') {
				while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
					postfix.append(operatorStack.pop());
				}
				operatorStack.pop();
			} else {
				while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
					postfix.append(operatorStack.pop());
				}
				operatorStack.push(ch);
			}
		}
		while (!operatorStack.isEmpty()) {
			if (operatorStack.peek() == '(') {
				return "Invalid Expression";
			}
			postfix.append(operatorStack.pop());
		}
		return postfix.toString();
	}

	private int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-': {
			return 1;
		}

		case '*':
		case '/': {
			return 2;
		}

		case '^':
			return 3;
		}
		return -1;
	}

}
