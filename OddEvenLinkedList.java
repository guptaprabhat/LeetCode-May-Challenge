package com.leetcode;

public class OddEvenLinkedList {

	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;
		ListNode oddList = head;
		ListNode evenList = head.next;
		ListNode evenListHead = evenList;

		while (evenList != null && evenList.next != null) {
			oddList.next = evenList.next;
			oddList = oddList.next;
			evenList.next = oddList.next;
			evenList = evenList.next;

		}

		oddList.next = evenListHead;
		return head;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
