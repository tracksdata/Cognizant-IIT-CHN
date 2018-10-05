package com.hcl.cf.webstore.test.nonJUnit;

import java.util.Date;

import com.hcl.cf.webstore.domain.entities.UserAccount;
import com.hcl.cf.webstore.facade.WebStorePOJO;

public class TestUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestUser.createAndStoreUser();
		// TestUser.listUsers ();
	}

	public static void createAndStoreUser() {

		UserAccount usr1 = TestUser.createUser("sush", "r", new Date(), "x@x.x","123", "userName1", "password1");
		UserAccount usr2 = TestUser.createUser("sush", "r", new Date(), "x@x.x","123", "userName2", "password2");
		UserAccount usr3 = TestUser.createUser("sush", "r", new Date(), "x@x.x","123", "userName3", "password3");
		UserAccount usr4 = TestUser.createUser("sush", "r", new Date(), "x@x.x","123", "userName4", "password4");
		UserAccount usr5 = TestUser.createUser("sush", "r", new Date(), "x@x.x","123", "userName5", "password5");


		//		Address adr1 = TestAddress.createAddress("adress1", "city1", "state1", "zip1", "country1", "type1");
		//		Address adr2 = TestAddress.createAddress("adress2", "city2", "state2", "zip2", "country2", "type2");
		//		CreditCard crd1 = TestCreditCard.createCreditCard("type1", "number1", new Date ());
		//		CreditCard crd2 = TestCreditCard.createCreditCard("type2", "number2", new Date ());

		//		usr1.addAddress(adr1);
		//		usr1.addAddress(adr2);
		//		usr1.addCreditCard(crd1);
		//		usr1.addCreditCard(crd2);

		WebStorePOJO webStore = new WebStorePOJO ();
		webStore.addUserAccount(usr1);
		webStore.addUserAccount(usr2);
		webStore.addUserAccount(usr3);
		webStore.addUserAccount(usr4);
		webStore.addUserAccount(usr5);

		//		UserAccount usr = webStore.getUserAccount(1L);
		//		usr = webStore.getUserAccount(0L);
		//		usr = webStore.getUserAccount("userName3");
		//		webStore.removeUserAccount(usr);
		//		usr = webStore.getUserAccount("userName4", "password4");
		//		usr = webStore.getUserAccount(5L);



	}

	// public static void listUsers() {
	// Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	// session.beginTransaction();
	//		
	// List result = session.createQuery("from UserAccount").list();
	//		
	// for (int i = 0; i < result.size(); i++) {
	// UserAccount usr = (UserAccount) result.get(i);
	// System.out.println("email " + usr.getEmailID());
	// System.out.println("FName " + usr.getFirstName());
	// System.out.println("LName " + usr.getLastName());
	// System.out.println("Ph No: " + usr.getPhoneNumber());
	// System.out.println("DOB " + usr.getBirthDate());
	//			
	// Set ccrds = usr.getCreditCards();
	// Iterator icrd = ccrds.iterator();
	//			
	// while (icrd.hasNext()) {
	// CreditCard crd = (CreditCard) icrd.next();
	// System.out.println(crd.getCardType());
	// System.out.println(crd.getCreditCardNumber());
	// System.out.println(crd.getExpiryDate());
	// }
	//			
	// Set addrs = usr.getAddresses();
	// Iterator iadrs = addrs.iterator();
	//			
	// while (iadrs.hasNext()) {
	// Address adr = (Address) iadrs.next();
	// System.out.println(adr.getAddress());
	// System.out.println(adr.getCity());
	// System.out.println(adr.getCountry());
	// System.out.println(adr.getState());
	// System.out.println(adr.getType());
	// System.out.println(adr.getZip());
	// }
	// }
	//		
	// session.getTransaction().commit();
	// }
	//	
	public static UserAccount createUser(String fName, String lName, Date dob,
			String email, String phNo, String userName, String password) {

		UserAccount usr = new UserAccount();
		usr.setBirthDate(dob);
		usr.setEmailID(email);
		usr.setFirstName(fName);
		usr.setLastName(lName);
		//usr.setPhoneNumber(phNo);
		usr.setUserName(userName);
		usr.setPassword(password);
		return usr;
	}
}
