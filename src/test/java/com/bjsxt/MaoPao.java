package com.bjsxt;

public class MaoPao {
	private static final int[] INT_ARR = {1,10,9,8,7,6,5,4,3,2,1};
	public static void main(String[] args) {
	int p = 0;
	for(int i = 0;i<INT_ARR .length;i++) {
		for(int j = i+1;j<INT_ARR .length;j++) {
			if(INT_ARR[i]>INT_ARR[j]) {
				p = INT_ARR[i];
				INT_ARR[i] = INT_ARR[j];
				INT_ARR[j] = p;
			}
		}
	}
	for (int string : INT_ARR) {
		System.out.println(string);
	}
	
		
	}
}
