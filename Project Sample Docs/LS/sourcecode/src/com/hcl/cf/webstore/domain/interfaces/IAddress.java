package com.hcl.cf.webstore.domain.interfaces;

public interface IAddress {

	/**
	 * @return the address
	 */
	String getAddress();

	/**
	 * @return the city
	 */
	String getCity();

	/**
	 * @return the country
	 */
	String getCountry();

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @return the phoneNumber
	 */
	long getPhoneNumber();

	/**
	 * @return the state
	 */
	String getState();

	/**
	 * @return the type
	 */
	String getType();

	/**
	 * @return the zip
	 */
	long getZip();

	/**
	 * @param address
	 *            the address to set
	 */
	void setAddress(String address);

	/**
	 * @param city
	 *            the city to set
	 */
	void setCity(String city);

	/**
	 * @param country
	 *            the country to set
	 */
	void setCountry(String country);

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	void setPhoneNumber(long phoneNumber);

	/**
	 * @param state
	 *            the state to set
	 */
	void setState(String state);

	/**
	 * @param type
	 *            the type to set
	 */
	void setType(String type);

	/**
	 * @param zip
	 *            the zip to set
	 */
	void setZip(long zip);
}
