package com.leetcode;

import java.util.Stack;

public class BSTFromPreOrder {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	
	    public TreeNode bstFromPreorder(int[] preorder) {
	        Stack<TreeNode> stack=new Stack<TreeNode>();
	        TreeNode root=new TreeNode(preorder[0]);
	        stack.push(root);
	        for(int i=1;i<preorder.length;i++){
	            TreeNode curr=null;
	             while (!stack.isEmpty() && preorder[i] > stack.peek().val) { 
	                curr = stack.pop(); 
	            }
	            if (curr != null) { 
	                curr.right = new TreeNode(preorder[i]); 
	                stack.push(curr.right); 
	            } else { 
	                curr = stack.peek(); 
	                curr.left = new TreeNode(preorder[i]); 
	                stack.push(curr.left); 
	            } 
	        }
	        return root;
	    }
	

}
