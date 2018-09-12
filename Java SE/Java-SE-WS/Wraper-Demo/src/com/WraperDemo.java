package com;

public class WraperDemo {

	public static void main(String[] args) {

		int x = 10; // primitive

		Integer intObj = x; // Auto Boxing , Boxing , Up casting, widening

		int i = intObj; // UnBoxing, Down Casting , Narowwing
		int ii = intObj.intValue();// UnBoxing

		float f = intObj; // int to float or double is okay
		float ff = intObj.floatValue();
		short s = intObj.shortValue();
		byte b = intObj.byteValue();

		float fff = 766.34f;
		Float floatObj = 766.34f;
		// int y=fff; // Cannot convert float / double to any int family

		int y = floatObj.intValue();
		long ll = floatObj.longValue();
		// double dd=fff;
		Double doubleObj = (double) floatObj;

		double dd = doubleObj.doubleValue();
		double ddddd = floatObj.doubleValue();

		float ffff = doubleObj.floatValue();
		int yy = doubleObj.intValue();

		String str = "1000";
		int num = Integer.parseInt(str);
		float f1 = Float.parseFloat(str);
		double dddd = Double.parseDouble(str);

		int n = 877;
		Integer nn = 877;
		String s1 = nn.toString();
		String s2 = n + "";
		String s3 = nn + "";

		String msg = "I am very good ?";
		
		byte bValue[]=msg.getBytes();
		
		for(byte bData:bValue) {
			System.out.print((char)bData);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// System.out.println("Binary: "+Integer.toBinaryString(x));

	}

}
