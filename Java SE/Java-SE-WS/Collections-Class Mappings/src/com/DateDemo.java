package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		Date rDate = new Date();
		System.out.println(d);

		System.out.println("year: " + (d.getYear() + 1900));
		System.out.println("Month: " + (d.getMonth() + 1));
		System.out.println("Date: " + d.getDate());
		String regDate = "12-03-2018:17:23:45";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MMM-dd");
		rDate = sdf.parse(regDate);

		System.out.println(rDate);
		
		String displayDate=	sdf1.format(rDate);	
		
		System.out.println("My Formated date: "+displayDate);
		
	}

}
