package com;

public class Multi {
	
	static void test(int[][] dummy,int dummyX) { // formal arguments
		dummy[0][1]=90;
		dummyX=200;
		System.out.println("With in   Method: X value is "+dummyX);
		
	}
	
	public static void main(String[] args) {
		
		int nums[][]= {  { 10,20,30}, {40,50,60 }};  
		
		int x=10;
		System.out.println("Before  Method: X value is "+x);
		
		test(nums,x); // actuval arguments
		
		System.out.println("After  Method: X value is "+x);
		
		//System.out.println(nums.length);
		
		// iterate with for loop
		
		for(int row=0;row<nums.length;row++) {
			
			for(int cols=0;cols<nums[row].length;cols++) {
				System.out.print(nums[row][cols]+"  ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("-----------------------");
		
		
		// for each loop
		
		for(int rows[]:nums) {
			
			for(int col:rows) {
				System.out.print(col+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
