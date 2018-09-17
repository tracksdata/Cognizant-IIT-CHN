package com;

import java.util.Calendar;

public class CalendarDemo {
	
	public static void main(String[] args) {
		
		Calendar cl=Calendar.getInstance();
		//System.out.println(cl);
		
		// COnvert Calendar into Date
		
		System.out.println(cl.getTime());
		System.out.println("Year: "+cl.get(Calendar.YEAR));
		System.out.println("Month: "+(cl.get(Calendar.MONTH)+1));
		System.out.println("Date: "+cl.get(Calendar.DATE));
		
		cl.set(2016, 02, 14);
		
		System.out.println("------------------");
		
		System.out.println(cl.getTime());
		System.out.println("Year: "+cl.get(Calendar.YEAR));
		System.out.println("Month: "+(cl.get(Calendar.MONTH)+1));
		System.out.println("Date: "+cl.get(Calendar.DATE));
		
		
		
		
		
		
	}

}
