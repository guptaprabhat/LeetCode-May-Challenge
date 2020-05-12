package com.leetcode;

import java.util.Arrays;

public class FloodFill {

	public static void main(String[] args) {
		int[][] image=	{{1,1,1},{1,1,0},{1,0,1}};
		int sr = 1, sc = 1, newColor = 2;
		System.out.println(floodFill(image,sr,sc,newColor));

	}
	public static int[][] floodFill(int[][] image,int startRow,int startCol,int newColor) {
		if(image==null||image.length==0||image[startRow][startCol]==newColor)
			return image;
		fillTheImage(image,startRow,startCol,image[startRow][startCol],newColor);
		return image;
	}
	public static void fillTheImage(int [][]image,int startRow,int startCol,int oldColor,int newColor) {
		if(startRow<0 ||startRow>=image.length||startCol<0||startCol>=image[startRow].length ||image[startRow][startCol]!=oldColor)
			return;
		image[startRow][startCol]=newColor;
		fillTheImage(image, startRow+1, startCol, oldColor, newColor);
		fillTheImage(image, startRow-1, startCol, oldColor, newColor);
		fillTheImage(image, startRow, startCol+1, oldColor, newColor);
		fillTheImage(image, startRow, startCol-1, oldColor, newColor);
	}

}
