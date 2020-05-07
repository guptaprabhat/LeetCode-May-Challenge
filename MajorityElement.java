package com.leetcode;

public class MajorityElement {

	public static void main(String[] args) {
		MajorityElement me=new MajorityElement();
		int[] arr= {1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,6,7,8,9,0,1,12,13};
		int num=me.majorityElement(arr);

	}
	public int majorityElement(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return majorityElement(nums, 0);
    }
    private int majorityElement(int[] nums, int start){
        int count = 1;
        int num = nums[start];
        for(int i = start+1;i<nums.length;i++){
            if(num == nums[i]) count++;
            else count--;
            if(count == 0) return majorityElement(nums,i+1);
        }
        return num;
    }
}
