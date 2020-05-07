package com.leetcode;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		// 
		 boolean result=canConstruct2("bjaa2jgea","2affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec");
		//boolean result = canConstruct("aa", "ab");
		System.out.println(result);
		// canConstruct("a","b");

	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			char ch=magazine.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			char ch=ransomNote.charAt(i);
			if (map.containsKey(ch)&&map.get(ch)>0) {
				map.put(ch, map.get(ch) - 1);
			} else {
				return false;
			}
		}
		return true;

	}
	public static boolean canConstruct1(String ransomNote, String magazine) {
		if(ransomNote==null || ransomNote.trim().isEmpty())
			return false;
		
		if(magazine==null || magazine.trim().isEmpty())
			return false;
		
		int[] freq=new int[26];
		for(int i=0;i<magazine.length();i++)
			freq[magazine.charAt(i)-'a']++;
		for(int i=0;i<ransomNote.length();i++) {
			if(--freq[ransomNote.charAt(i)-'a']<0) {
				return false;
			}		
		}
		return true;
		
	}
	public static boolean canConstruct2(String ransom,String magazine) {
		if (magazine.length() < ransom.length()) return false;
        int caps[] = new int[26];
        for (char c : ransom.toCharArray()) {
            int index = magazine.indexOf(c, caps[c - 'a']);
            if (index == -1)
                return false;
            caps[c - 'a'] = index + 1;
        }
        return true;
    }
	
	
	
	
}
