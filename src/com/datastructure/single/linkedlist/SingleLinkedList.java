package com.datastructure.single.linkedlist;

public class SingleLinkedList {

	private class Node {
		int data;
		Node next;

		private Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node head = null;

	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void insertAfterGivenNode(int key, int data) {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			Node newNode = new Node(data);
			while (temp != null && key != temp.data) {
				temp = temp.next;
			}
			if (temp != null && key == temp.data) {
				newNode.next = temp.next;
				temp.next = newNode;
			} else {
				System.out.println("Given node is not found");
			}
		}
	}

	public void insertBeforeGivenNode(int key, int data) {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node newNode = new Node(data);
			if (head.data == key) {
				newNode.next = head;
				head = newNode;
				return;
			}
			Node temp = head;
			Node prev = null;
			while (temp != null && key != temp.data) {
				prev = temp;
				temp = temp.next;
			}
			if (temp != null && key == temp.data) {
				newNode.next = temp;
				prev.next = newNode;
				return;
			}
			if (temp == null) {
				System.out.println("Node not found befoe that new node could be inserted");
			}
		}
	}

	public int deleteFirst() {
		if (head == null) {
			System.out.println("List is emtpy");
			return -1;
		} else {
			Node temp = head;
			int deleted = temp.data;
			head = head.next;
			temp.next = null;
			temp = null;
			return deleted;
		}
	}

	public int deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return -1;
		} else {
			int deleted;
			if (head.next == null) {
				deleted = head.data;
				head = null;
			} else {
				Node t = head;
				while (t.next.next != null) {
					t = t.next;
				}
				deleted = t.next.data;
				t.next = null;
				t = null;
			}
			return deleted;
		}
	}

	public int delete(int key) {
		if (head == null) {
			System.out.println("List is empty");
			return -1;
		} else {
			Node t = head;
			int deleted = -1;
			if (key == head.data) {
				deleted = head.data;
				head = head.next;
				t.next = null;
				t = null;
			} else {
				while (t.next != null && key != t.next.data) {
					t = t.next;
				}
				if (t.next != null && key == t.next.data) {
					deleted = t.next.data;
					t.next = t.next.next;
				} else {
					System.out.println("Key not found");
				}
			}
			return deleted;
		}
	}

	public void reverseRecursive() {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			reverse(null, head);
		}
	}

	private void reverse(Node prev, Node curr) {
		if (curr != null) {
			reverse(curr, curr.next);
			curr.next = prev;
		} else {
			head = prev;
		}
	}

	public void reverseIterative() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node curr = head;
			Node prev = null, nextNode = null;
			while (curr != null) {
				nextNode = curr.next;
				curr.next = prev;
				prev = curr;
				curr = nextNode;
			}
			head = prev;
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("List --> ");
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
