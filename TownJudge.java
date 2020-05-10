package com.leetcode;



public class TownJudge {

	public static void main(String[] args) {
		int [][] arr=  {{1,3},
						};
		int N=4;
		System.out.println(findJudge(N, arr));
	}
	public static int findJudge(int N, int[][] trust) {
			if(trust.length==1)
				return trust[0][1];
			int count[] = new int[N+1];
			for(int []arr:trust) {
				count[arr[0]]--;
				count[arr[1]]++;
			}
			for(int i=1;i<=N;i++)
				if(count[i]==N-1)
					return i;
			return -1;
	}

}
