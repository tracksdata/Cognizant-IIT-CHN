package com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Sample2 {

	public static void main(String[] args) throws ParseException {
		LocalDate now = LocalDate.now();
		System.out.println(now);

		String s1 = "1990-10-10";
		String s2 = "1991-08-12";
		//Date df=DateFormat.getInstance().parse(s1);
		//System.out.println("-- Date : "+df);

		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		DateFormat sss=DateFormat.getInstance();
		
		

		Date sd=sf.parse(s1);
		Date ed=sf.parse(s1);
		
		
		LocalDate d1 = LocalDate.parse(s1);
		LocalDate d2 = LocalDate.parse(s2);
		//LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);

		Period p = Period.between(d1, d2);
		long p2 = ChronoUnit.DAYS.between(d1, d2);

		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays() + " days old. (" + p2 + " days total)");

	}

}
