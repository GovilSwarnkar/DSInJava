package com.datastructure.tree;

public class BinarySearchTreeRecursive {

	private class Node {
		Node left;
		int key;
		Node right;

		Node(int key) {
			this.left = null;
			this.key = key;
			this.right = null;
		}
	}

	private Node root = null;

	public void add(int key) {
		root = addNode(root, key);
	}

	public Node addNode(Node t, int key) {
		if (t == null) {
			return new Node(key);
		}
		if (key < t.key) {
			t.left = addNode(t.left, key);
		} else if (key > t.key) {
			t.right = addNode(t.right, key);
		}
		return t;
	}

	public void traversePreOrder() {
		preOrder(root);
	}

	private void preOrder(Node t) {
		if (t != null) {
			System.out.print(t.key + " ");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void traverseInOrder() {
		inOrder(root);
	}

	private void inOrder(Node t) {
		if (t != null) {
			inOrder(t.left);
			System.out.print(t.key + " ");
			inOrder(t.right);
		}
	}

	public void traversePostOrder() {
		postOrder(root);
	}

	private void postOrder(Node t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.key + " ");
		}
	}

	public int nodeCount() {
		return numberOfNode(root);
	}

	private int numberOfNode(Node t) {
		if (t != null) {
			return (1 + numberOfNode(t.left) + numberOfNode(t.right));
		} else {
			return 0;
		}
	}

	public int leaveNodeCount() {
		return numberOfLeaveNode(root);
	}

	private int numberOfLeaveNode(Node t) {
		if (t == null) {
			return 0;
		}
		if (t.left == null && t.right == null) {
			return 1;
		}
		return numberOfLeaveNode(t.left) + numberOfLeaveNode(t.right);
	}

	public int nonLeaveNodeCount() {
		return numberOfNonLeaveNode(root);
	}

	private int numberOfNonLeaveNode(Node t) {
		if (t == null) {
			return 0;
		}
		if (t.left == null && t.right == null) {
			return 0;
		}
		return (1 + numberOfNonLeaveNode(t.left) + numberOfNonLeaveNode(t.right));
	}

	public int fullNodeCount() {
		return numberOfFullNode(root);
	}

	private int numberOfFullNode(Node t) {
		if (t == null) {
			return 0;
		}
		if (t.left == null && t.right == null) {
			return 0;
		}
		return numberOfFullNode(t.left) + numberOfFullNode(t.right) + ((t.left != null && t.right != null) ? 1 : 0);
	}

	public int heightOfTree() {
		return treeHeight(root);
	}

	private int treeHeight(Node t) {
		if (t == null) {
			return 0;
		}
		if (t.left == null && t.right == null) {
			return 0;
		}
		return 1 + Math.max(treeHeight(t.left), treeHeight(t.right));
	}

	public int deleteNode(int key) {
		return 0;
	}
}
