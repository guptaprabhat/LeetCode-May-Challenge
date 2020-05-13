package com.leetcode;

import java.util.Stack;

public class RemoveKDigits {

	public static void main(String[] args) {
		// String str="12345";

		String str = "10200";
		System.out.println(removeKdigits(str, 1));
	}

	public static String removeKdigits(String num, int k) {
		if (num.length() == k)
			return "0";
		int count = k;
		while (k > 0) {
			for (int i = 1; i < num.length(); i++) {
				if (num.charAt(i - 1) > num.charAt(i)) {
					num = num.substring(0, i - 1) + num.substring(i, num.length());
					count--;
					break;
				}
			}
			k--;
		}
		if (count != k) {
			num = num.substring(0, num.length() - count);
		}
		while (num.charAt(0) == '0' && num.length() > 1)
			num = num.substring(1, num.length());

		return num;
	}

}
