package com.leetcode.april;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static void main(String[] args) {
		int arr[]= {0,1,0,0,1,1,0};
		System.out.println(findMaxLength(arr));

	}
	public static int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,-1);
        int count=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i]==1?1:-1;
            if(map.containsKey(count)){
                maxLength=Math.max(maxLength,i-(map.get(count)));
            }else
                map.put(count,i);
        }
        return maxLength;
    }
	
}
