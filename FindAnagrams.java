package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {

	public static void main(String[] args) {
		String s="cbaebabacd";
		String p="abc";
		System.out.println(findAnagram(s,p));

	}
	public static List<Integer> findAnagram(String s,String p) {
		int[] char_count=new int[26];
		for(char ch:p.toCharArray()) {
			char_count[ch-'a']++;
		}
		List<Integer> listOfIndex=new ArrayList<Integer>();
		int left=0,right=0, count=p.length();
	
		while(right<s.length()) {
			if(char_count[s.charAt(right++)-'a']-- >=1) {
				/*char_count[s.charAt(right)-'a']--;
				count--;*/
				count--;
			}
				
			if(count==0)
				listOfIndex.add(left);
			if(right-left==p.length() && char_count[s.charAt(left++)-'a']++ >=0) {
				/*char_count[s.charAt(left)-'a']++;
				left++;*/
				count++;
			}
			
				
			
		}
		return listOfIndex;	
			
		}
		
	}
	

