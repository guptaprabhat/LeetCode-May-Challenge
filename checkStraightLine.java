package com.leetcode;

public class checkStraightLine {

	public static void main(String[] args) {
		int [][] coordinates = {{1,2},
								{2,3},
								{3,4},
								{4,5},
								{5,6},
								{6,7}};
		int [][] coordinate= {{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}};
 	boolean result=checkline(coordinate);
 	System.out.println(result);
 	
	}
	public static boolean checkline(int[][] coordinates) {
		int[] p1=coordinates[0];
		int[] p2=coordinates[1];	
		float gslope=slope(p1, p2);
		for(int i=1;i<coordinates.length;i++) {
			int[] p3=coordinates[i];
			int[] p4=coordinates[0];
			float slop=slope(p3, p4);
			if(gslope!=slop)
			return false;
		}
		
		return true;
	}
	public static float slope(int[] p1,int []p2) {
		if(p1[0]-p2[0]==0)
			return 0;
		return (float)(p2[1]-p1[1])/(p2[0]-p1[0]);
		
	}
		
}
