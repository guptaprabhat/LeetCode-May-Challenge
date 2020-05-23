package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {

	public static void main(String[] args) {
		String str = "treeaa";
		System.out.println(frequencySort(str));
	}

	public static String frequencySort(String s) {
		if (s == null || s.length() < 3) {
			return s;
		}

		int[] counts = new int[128];

		for (char c : s.toCharArray()) {
			++counts[c];
		}
		Map<Integer, List<Character>> map = new HashMap<Integer, List<Character>>();
		int maxCount = 0;
		for (int i = 0; i < counts.length; ++i) {
			if (counts[i] > 0) {
				if (!map.containsKey(counts[i])) {
					map.put(counts[i], new ArrayList<Character>(Arrays.asList((char) i)));
					if (counts[i] > maxCount)
						maxCount = counts[i];
				} else {
					map.get(counts[i]).add((char) i);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = maxCount; i > 0; --i) {
			if (map.containsKey(i)) {
				for (char c : map.get(i)) {
					for (int j = 0; j < i; ++j) {
						sb.append(c);
					}
				}
			}
		}

		return sb.toString();
	}
}