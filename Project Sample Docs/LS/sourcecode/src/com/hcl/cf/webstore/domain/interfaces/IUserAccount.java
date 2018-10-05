package com.hcl.cf.webstore.domain.interfaces;

import java.util.Date;

public interface IUserAccount {

	/**
	 * @return the address
	 */
	IAddress getIAddress();

	/**
	 * @return the birthDate
	 */
	Date getBirthDate();

	/**
	 * @return the emailID
	 */
	String getEmailID();

	/**
	 * @return the firstName
	 */
	String getFirstName();

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @return the lastName
	 */
	String getLastName();

	/**
	 * @return the password
	 */
	String getPassword();

	/**
	 * @return the userName
	 */
	String getUserName();

	void removeAddress();

	/**
	 * @param address
	 *            the address to set
	 */
	void setIAddress(IAddress address);

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	void setBirthDate(Date birthDate);

	/**
	 * @param emailID
	 *            the emailID to set
	 */
	void setEmailID(String emailID);

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	void setFirstName(String firstName);

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	void setLastName(String lastName);

	/**
	 * @param password
	 *            the password to set
	 */
	void setPassword(String password);

	/**
	 * @param userName
	 *            the userName to set
	 */
	void setUserName(String userName);
}
