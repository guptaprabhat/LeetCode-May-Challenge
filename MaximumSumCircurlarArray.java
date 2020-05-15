package com.leetcode;

public class MaximumSumCircurlarArray {

	public static void main(String[] args) {
		int arr[]= {1,0,3,-2};
		System.out.println(maxSubarraySumCircular(arr));
	}
	public static int maxSubarraySumCircular(int arr[]) {
		int maxTillNow=arr[0];
		int maxInTotal=arr[0];
		int minTillNow=arr[0];
		int minInTotal=arr[0];
		int sum=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]+maxTillNow>arr[i])
				maxTillNow+=arr[i];
			else
				maxTillNow=arr[i];
			maxInTotal=Math.max(maxInTotal, maxTillNow);
			
			if(arr[i]+minTillNow<arr[i]) 
				minTillNow+=arr[i];
				else
				minTillNow=arr[i];
			minInTotal=Math.min(minInTotal, minTillNow);
			sum+=arr[i];
		}
		if(sum==minInTotal)return maxInTotal;
		return(Math.max(sum-minInTotal, maxInTotal));
		
	}

}
