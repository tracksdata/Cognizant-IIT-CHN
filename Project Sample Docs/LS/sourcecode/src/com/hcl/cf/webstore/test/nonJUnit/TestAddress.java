package com.hcl.cf.webstore.test.nonJUnit;

import org.hibernate.Session;

import com.hcl.cf.webstore.domain.constants.IAddressType;
import com.hcl.cf.webstore.domain.entities.Address;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class TestAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestAddress.storeAddress( TestAddress.createAddress("a house, x lane, y road", "mangalore", "kar",
				"23412", "india", IAddressType.BILLING));

		TestAddress.storeAddress(TestAddress.createAddress("b house, g lane, h road", "bangalore", "kar",
				"55555", "india", IAddressType.SHIPPING));

		TestAddress.storeAddress(TestAddress.createAddress("a house, x lane, y road", "mangalore", "kar",
				"6666", "india", IAddressType.SHIPPING));

		TestAddress.storeAddress(TestAddress.createAddress("a house, x lane, y road", "mangalore", "kar",
				"33333", "india", IAddressType.BILLING));

		TestAddress.storeAddress(TestAddress.createAddress("a house, b lane, c road", "mangalore", "kar",
				"88888", "india", IAddressType.BILLING));
	}

	public static void storeAddress(Address address) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(address);
		session.getTransaction().commit();
	}

	public static Address createAddress(String address, String city,
			String state, String zip, String country, String type) {

		Address addr = new Address();
		addr.setAddress(address);
		addr.setCity(city);
		addr.setCountry(country);
		addr.setState(state);
		addr.setType(type);
		addr.setZip(100);
		addr.setPhoneNumber(121256);

		return addr;
	}
}
