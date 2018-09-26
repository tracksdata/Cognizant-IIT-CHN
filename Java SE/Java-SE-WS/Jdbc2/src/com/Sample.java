package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Sample {

	public static void main(String[] args) throws ParseException {
			SimpleDateFormat sdm=new SimpleDateFormat("dd-MM-yyyy");
			String s1="10-07-1997";
			Date dob=sdm.parse(s1);
			
			Calendar cl=Calendar.getInstance();
			cl.setTime(dob);
			
			System.out.println(cl.get(Calendar.MONTH));
			System.out.println(cl.get(Calendar.DATE));
			
	}

}
