package com.datastructure.tree;

import java.util.Scanner;

public class BinarySearchTreeRecursiveDriver {

	public static void main(String[] args) {
		int option = 0;
		int data = 0;
		Scanner sc = new Scanner(System.in);
		BinarySearchTreeRecursive binarySearchTree = new BinarySearchTreeRecursive();
		while (true) {
			System.out.print("\nChoose option : \n");
			System.out.println(
					"1. Add node | 2. Traverse Pre Order | 3. Traverse In Order  | 4. Traverse Post Order | 5. Number of Node |  6. Number of Leave Node "
							+ "| 7. Number of Non Leave Node | 8. Number of Full Node | 9. Height of tree | 0. Exit");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter data : ");
				data = sc.nextInt();
				binarySearchTree.add(data);
				break;
			}
			case 2: {
				System.out.println("Traverse Pre Order ->");
				binarySearchTree.traversePreOrder();
				break;
			}
			case 3: {
				System.out.println("Traverse In Order ->");
				binarySearchTree.traverseInOrder();
				break;
			}
			case 4: {
				System.out.println("Traverse Post Order ->");
				binarySearchTree.traversePostOrder();
				break;
			}
			case 5: {
				System.out.println("Number of Node ->" + binarySearchTree.nodeCount());
				break;
			}
			case 6: {
				System.out.println("Number of Leave Node ->" + binarySearchTree.leaveNodeCount());
				break;
			}
			case 7: {
				System.out.println("Number of Leave Node ->" + binarySearchTree.nonLeaveNodeCount());
				break;
			}
			case 8: {
				System.out.println("Number of Leave Node ->" + binarySearchTree.fullNodeCount());
				break;
			}
			case 9: {
				System.out.println("Height of tree ->" + binarySearchTree.heightOfTree());
				break;
			}
			case 0: {
				sc.close();
				return;
			}
			}
		}
	}
}
