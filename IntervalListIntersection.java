package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {

	public static void main(String[] args) {
		int[][] A = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
		int[][] B = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
		//[[1, 2], [5, 5], [8, 10], [8, 10], [15, 23], [24, 24], [25, 25], [0, 0]]
		intervalIntersection(A, B);
	}

	public static int[][] intervalIntersection(int[][] A, int[][] B) {
		int i=0,j=0;
		int low=0;
		int high=0;
		List<int[]> result=new ArrayList<>();
		while(i<A.length && j<B.length) {
			if(A[i][0]<=B[j][1] && B[j][0]<=A[i][1]) {
				 low=Math.max(A[i][0], B[j][0]);
				 high=Math.min(A[i][1], B[j][1]);
				 result.add(new int[] {low,high});
			}
			if(A[i][1]< B[j][1]) {
				i++;
			}else {
				j++;
			}
			
			
		}
		return  result.toArray(new int[result.size()][]);
	}
}