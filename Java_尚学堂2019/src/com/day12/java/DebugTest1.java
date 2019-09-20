package com.day12.java;


public class DebugTest1 {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(arr);//地址值
		
		char[] arr1 = new char[] {'a','b','c'};
		System.out.println(arr1);//abc

		int num=0;
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			num = num + i;
			count=count++;
		}
		System.out.println(num* count);
	}
	
}
