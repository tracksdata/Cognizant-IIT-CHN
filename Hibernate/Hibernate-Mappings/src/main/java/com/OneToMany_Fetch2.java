package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetomany.Customer;
import com.onetomany.Department;
import com.onetomany.Employee;
import com.onetomany.Vehicle;
import com.utils.HibernateUtils;

public class OneToMany_Fetch2 {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		Customer cust=(Customer) ses.get(Customer.class, "C002");
		
		System.out.println("Cust Id: "+cust.getCustomerId());
		System.out.println("Name: "+cust.getCustomerName());
		
		for(Vehicle veh:cust.getVehicles()) {
			System.out.println("Vehicle Id: "+veh.getRegNo());
			System.out.println("Vehicle Name: "+veh.getVehicleName());
			System.out.println("------------------------------------");
		}
		
		
		
		
		
		
		
		HibernateUtils.shutdown();
		

	}

}
