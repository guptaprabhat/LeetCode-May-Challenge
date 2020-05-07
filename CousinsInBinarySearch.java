package com.leetcode;

public class CousinsInBinarySearch {
	TreeNode root;

	public boolean isCousins(TreeNode root, int x, int y) {
		if (root == null)
			return false;
		if (getLevelOfNode(root, x, 1) != getLevelOfNode(root, y, 1))
			return false;
		return !isSibling(root, x, y);
	}

	public int getLevelOfNode(TreeNode node, int data, int level) {
		if (node == null)
			return 0;
		if (node.val == data)
			return level;
		int l = getLevelOfNode(node.left, data, level + 1);
		if (l != 0)
			return l;
		l = getLevelOfNode(node.right, data, level + 1);
		return l;
	}

	public boolean isSibling(TreeNode node, int x, int y) {
		if (node == null)
			return false;
		boolean check = false;

		if (node.left != null && node.right != null) {
			check = (node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x);
		}

		return (check || isSibling(node.left, x, y) || isSibling(node.right, x, y));
	}

	public static void main(String args[]) {
		CousinsInBinarySearch tree = new CousinsInBinarySearch();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.left.right.right = new TreeNode(15);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		tree.root.right.left.right = new TreeNode(8);

		TreeNode Node1, Node2;
		Node1 = tree.root.left.left;
		Node2 = tree.root.right.right;
		if (tree.isCousins(tree.root, Node1.val, Node2.val))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

}
