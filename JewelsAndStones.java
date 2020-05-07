package com.leetcode;

import java.util.HashSet;

public class JewelsAndStones {

	public static void main(String[] args) {
		numJewelsInStones("aA", "aAAbbbb");
		} 
	 public static  int numJewelsInStones(String J, String S) {
	       HashSet<Character> jewels=new HashSet<Character>();
	        for(char c:J.toCharArray())
	            jewels.add(c);
	        
	        HashSet<Character> stones=new HashSet<Character>();
	        int numJewels=0;
	        for(char c:S.toCharArray()){
	              if(jewels.contains(c))
	                numJewels++;      
	        }
	        return numJewels;      
	    }
}
