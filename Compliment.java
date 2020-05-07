package com.leetcode;

public class Compliment {

	public static void main(String[] args) {
		findComplement(5);

	}
	 public static void findComplement(int num) {
	        int result=0;
	        int power=1;
	        while(num>0) {
	        	result+=(num%2^1)*power;
	        	power=power*2;
	        	num=num/2;
	        }
	        System.out.println(result);
	    }
	
}
