package com.datastructure.single.linkedlist;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int option = 0;
		int data = 0;
		Scanner sc = new Scanner(System.in);
		SingleLinkedList list = new SingleLinkedList();
		while (true) {
			System.out.print("\nChoose option : \n");
			System.out.println(
					"1. Insert at first | 2. Insert at last | 3. Insert after |  4. Insert before | 5. Delete Frirst | 6. Delete Last | 7. Delete Any "
							+ "| 8. Reverse list in recursive way | 9. Reverse list in iterative way | 10. Display list  | 0. Exit");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter data : ");
				data = sc.nextInt();
				list.insertFirst(data);
				break;
			}
			case 2: {
				System.out.println("Enter data : ");
				data = sc.nextInt();
				list.insertLast(data);
				break;
			}
			case 3: {
				System.out.println("After node : ");
				int after = sc.nextInt();
				System.out.println("Enter data : ");
				data = sc.nextInt();
				list.insertAfterGivenNode(after, data);
				break;
			}
			case 4: {
				System.out.println("Before node : ");
				int key = sc.nextInt();
				System.out.println("Enter data : ");
				data = sc.nextInt();
				list.insertBeforeGivenNode(key, data);
				break;
			}
			case 5: {
				int deleted = list.deleteFirst();
				if (deleted != -1) {
					System.out.println("deleted First --> " + deleted);
				}
				break;
			}
			case 6: {
				int deleted = list.deleteLast();
				if (deleted != -1) {
					System.out.println("deleted Last --> " + deleted);
				}
				break;
			}
			case 7: {
				System.out.println("Enter key to delete : ");
				int key = sc.nextInt();
				int deleted = list.delete(key);
				if (deleted != -1) {
					System.out.println("Key is deleted --> " + deleted);
				}
				break;
			}
			case 8: {
				list.reverseRecursive();
				break;
			}
			case 9: {
				list.reverseIterative();
				break;
			}
			case 10: {
				System.out.println("Single Linked List ->");
				list.display();
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
