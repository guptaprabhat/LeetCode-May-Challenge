package com.leetcode;

public class PerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(2147482547));

	}

	public static boolean isPerfectSquare(int num) {// 16
		long l = 0;
		
		long r = num;// 16
		
		long mid = l + (r - l) / 2;// 8
		while (l <= r) {
			if (mid * mid == num)// 1. 64==16 2.9==16
				return true;
			if (mid * mid > num) {// 1. true r=7, mid=3
				r = mid - 1; // r=4
				mid = l + (r - l) / 2;//
			} else { //
				l = mid + 1; // l=4, mid=5
				mid = l + (r - l) / 2;
			}
		}

		return false;

	}
}
