package com.leetcode;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		int nums[]= {1,1,2,3,3,4,4,8,8};
		System.out.println(singleNonDuplicate(nums));
	} 
	public static int singleNonDuplicate(int[] nums) {
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
            result=result^nums[i];
        
        return result;
    }

}
