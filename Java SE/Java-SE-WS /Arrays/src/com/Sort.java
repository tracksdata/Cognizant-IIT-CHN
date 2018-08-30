package com;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		
		int nums[]= {100,20,101,12};
		
		Arrays.sort(nums);
		
		for(int num:nums) {
			System.out.println(num);
		}
		
		System.out.println("------------------");
		int pos=Arrays.binarySearch(nums, 20);
		System.out.println(pos);
		
	}

}
