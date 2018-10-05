package com.hcl.cf.webstore.domain.interfaces;

import java.util.Date;

public interface ICreditCard {

	/**
	 * @return the cardType
	 */
	String getCardType();

	/**
	 * @return the creditCardNumber
	 */
	long getCreditCardNumber();

	/**
	 * @return the expiryDate
	 */
	Date getExpiryDate();

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @param cardType
	 *            the cardType to set
	 */
	void setCardType(String cardType);

	/**
	 * @param creditCardNumber
	 *            the creditCardNumber to set
	 */
	void setCreditCardNumber(long creditCardNumber);

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	void setExpiryDate(Date expiryDate);
}
