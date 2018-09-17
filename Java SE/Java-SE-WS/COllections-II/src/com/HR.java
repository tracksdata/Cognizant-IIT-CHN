package com;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class HR {

	public static void main(String[] args) throws ParseException {

		Employee e1 = new Employee(130, "Abcd", 838847, Employee.setDate(20, 02, 2018));

		Address addr1 = new Address();
		Address addr2 = new Address();

		addr1.setAddrType("Present");
		addr1.setAddrId(10);
		addr1.setAddress("Chennai");

		addr2.setAddrType("Parmanet");
		addr2.setAddrId(11);
		addr2.setAddress("Hyderabad");

		// e1.setAddr(addr1);
		// e1.setAddr(addr2);

		e1.getAddrs().add(addr1);
		e1.getAddrs().add(addr2);

		Employee.display(e1);

	}

}
