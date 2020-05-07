package com.leetcode;

public class FirstBadVersion {
	static int badVersion = 3;
	
	public static boolean isBadVersion(int index) {
		int[] arr= {1,1,1,1,1,1,0,0,0};
		if(arr[index]==0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int n = 9;
		
		findBadVersion(n);

	}
	public static void findBadVersion(int n) {
		int l=0;
		int r=n-1;
		int mid=l + (r - l) / 2;;
		while(l<=r) {
			if(isBadVersion(mid)) {
				r=mid-1;
				mid=l + (r - l) / 2;
			}
			else {
				l=mid+1;
				mid=l + (r - l) / 2;
			}
		}
		System.out.println(mid);
		
		
	}
}
