package com;

import java.io.Serializable;
import java.util.Calendar;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class IDGenerator implements IdentifierGenerator {

	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		
		String key="ABCHYD";
		
		Calendar cl=Calendar.getInstance();
		StringBuffer date= new StringBuffer();
		int year=cl.get(Calendar.YEAR);
		int month=(cl.get(Calendar.MONTH))+1;
		int day=cl.get(Calendar.DATE);
		int hour=cl.get(Calendar.HOUR);
		int min=cl.get(Calendar.MINUTE);
		int sec=cl.get(Calendar.SECOND);
		int ms=cl.get(Calendar.MILLISECOND);
		
		
		
		//int ns=cl.get(Calendar.);
		
		date.append(year+"");
		date.append(month+"");
		date.append(day+"");
		date.append(hour+"");
		date.append(min+"");
		date.append(sec+"");
		date.append(ms+"");
		
		
		date.insert(0, key);
		
		
		
		return date.toString();
	}
	
	
	

}
