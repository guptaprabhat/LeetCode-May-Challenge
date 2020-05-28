package com.leetcode;

public class CountingBits {

	public static void main(String[] args) {
	countBits1(12);

	}
	public static  void countBits(int num) {
		int[] arr=new int[num+1];
		for(int i=0;i<=num;i++) {
			arr[i]=getBinary(i);
		}
	        
	    }
	public static int getBinary(int num) {
		int count=0;
		while(num>0) {
			if(num%2==1)
				count++;
			num=num/2;
			
		}
		return count;
	}
	public static int[] countBits1(int num) {
        if (num < 0)
            return new int[1];
        
        // allocate array incuding 0->num
        int[] countBitArray = new int[num + 1];
        
        // initial DP data
        countBitArray[0] = 0;
        
        for (int i = 1; i <= num; i++) {
            // if num is even, bit count is same as num / 2
            // if odd, bit count is same as (num / 2) + 1
        	int value=i/2;;
        	int num1=countBitArray[i >> 1];
            countBitArray[i] = countBitArray[i >> 1] + i % 2;
        }
        
        return countBitArray;

    }
	
	
	}
