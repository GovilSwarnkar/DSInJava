package com.datastructure.stack.and.queue.impl;

import java.util.Stack;

public class PostfixEvolution {

	public int postfixEvolution(String exp) {
		Stack<Integer> operandStack = new Stack<>();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (ch == ' ') {
				continue;
			} else if (Character.isDigit(ch)) {
				int n = 0;
				while (Character.isDigit(ch)) {
					n = n * 10 + (int) (ch - '0');
					i++;
					ch = exp.charAt(i);
				}
				--i;
				operandStack.push(n);
			} else {
				int operand1 = operandStack.pop();
				int operand2 = operandStack.pop();
				switch (ch) {
				case '+': {
					operandStack.push(operand2 + operand1);
					break;
				}
				case '-': {
					operandStack.push(operand2 - operand1);
					break;
				}
				case '*': {
					operandStack.push(operand2 * operand1);
					break;
				}
				case '/': {
					operandStack.push(operand2 / operand1);
					break;
				}
				}
			}
		}
		return operandStack.pop();
	}

}
