package com.leetcode;

public class FirstUniqChar {

	public static void main(String[] args) {
		String s="leetcode";
		int res=Integer.MAX_VALUE;
		for(char ch='a'; ch<'z';ch++) {
			int index=s.indexOf(ch);
			if(index!=-1 && index==s.lastIndexOf(ch)) {
				res=Math.min(res, index);
			}
		}
		res= res==Integer.MAX_VALUE?-1:res;
		System.out.println(res);
			

	}

}
