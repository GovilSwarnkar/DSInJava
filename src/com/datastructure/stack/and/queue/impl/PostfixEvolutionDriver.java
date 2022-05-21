package com.datastructure.stack.and.queue.impl;

public class PostfixEvolutionDriver {

	public static void main(String[] args) {
		PostfixEvolution postfixEvolution = new PostfixEvolution();
		System.out.println(postfixEvolution.postfixEvolution("100 200 + 2 / 5 * 7 +"));
	}
}
