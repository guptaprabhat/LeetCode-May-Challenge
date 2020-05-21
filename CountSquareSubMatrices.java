package com.leetcode;

public class CountSquareSubMatrices {

	public static void main(String[] args) {
		int[][] arr= {{0,1,1,1},
				  {1,1,1,1},
				  {0,1,1,1}};
		int [][] arr1= {{1,0,1},{1,1,0},{1,1,0}};
		int [][]arr2= {{1,1,1},{1,1,1},{1,1,1}};
		System.out.println(countSquares(arr2));
	}
	 public static int findMin(int a,int b, int c){
	        int l = Math.min(a, b);
	        return Math.min(l, c);
	    }
	 
	 
	public static int countSquares(int[][] matrix) {
		int result[][]=new int[matrix.length][matrix[0].length];
		int count=0;
		for(int i=0; i < matrix.length; i++){
            result[i][0] = matrix[i][0]; 
            if(matrix[i][0]==1)
            	count++;
        }
		for(int i=1; i < matrix[0].length; i++){
            result[0][i] = matrix[0][i];
            if(matrix[0][i]==1)
            	count++;
        }
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[0].length;j++) {
				if(matrix[i][j]==0) {
					result[i][j]=0;
					continue;
				}	
				int t= findMin(result[i-1][j],result[i-1][j-1],result[i][j-1]);
				result[i][j]=t+1;
				count+=result[i][j];
				
			}
		}
		return count;
	}

}
