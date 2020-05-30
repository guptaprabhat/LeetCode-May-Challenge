package com.leetcode;

import java.util.*;

public class KClosestPointToOrigin {

	public static void main(String[] args) {
		int [][]points = {{3,3},{5,-1},{-2,4}};
		int [][]points1 = {{1,0},{1,0}};
		int K = 2;
		kClosest1(points, K);
	}
	public static int[][] kClosest(int[][] points, int K) {
		Comparator<int[]> c=(int[]a,int[]b)->(a[0]*a[0] + a[1]*a[1])  - (b[0]*b[0] + b[1]*b[1]);
		Arrays.parallelSort(points, c);
		
		return Arrays.copyOfRange(points, 0, K);
		
	}
	 public static int[][] kClosest1(int[][] points, int K) {
	        PriorityQueue<int[]> p = new PriorityQueue<>((a, b) -> b[0] * b[0] + b[1] * b[1] - a[0] * a[0] - a[1] * a[1]);
	        for (int[] point : points) {
	            p.add(point);
	            if (p.size() > K) {                              
	                p.poll();
	            }
	        }
	        return p.toArray(new int[0][0]);
	    }

}
