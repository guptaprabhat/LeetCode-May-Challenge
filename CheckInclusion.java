package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CheckInclusion {

	public static void main(String[] args) {
		String s2="eidbaooo";
		String s1="ab";
		System.out.println(checkInclusion(s2,s1));

	}
	public static boolean checkInclusion(String s2, String s1) {
			int[] char_count=new int[26];
			for(char ch:s1.toCharArray()) {
				char_count[ch-'a']++;
			}
			List<Integer> listOfIndex=new ArrayList<Integer>();
			int left=0,right=0, count=s1.length();
		
			while(right<s2.length()) {
				if(char_count[s2.charAt(right++)-'a']-- >=1) {
					/*char_count[s.charAt(right)-'a']--;
					count--;*/
					count--;
				}
					
				if(count==0)
					return true;
				if(right-left==s1.length() && char_count[s2.charAt(left++)-'a']++ >=0) {
					/*char_count[s.charAt(left)-'a']++;
					left++;*/
					count++;
				}
				
					
				
			}
			return false;	
				
			}
	}


