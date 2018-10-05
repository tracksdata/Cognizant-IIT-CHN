package com.hcl.cf.webstore.domain.entities;

import java.util.Date;

import com.hcl.cf.webstore.domain.interfaces.ICreditCard;

public class CreditCard implements ICreditCard {

	private long id;

	private long creditCardNumber;

	private Date expiryDate;

	private String cardType;

	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @param cardType
	 *            the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * @return the creditCardNumber
	 */
	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * @param creditCardNumber
	 *            the creditCardNumber to set
	 */
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	private void setId(long id) {
		this.id = id;
	}

	//	@Override
	//	public boolean equals(Object obj) {
	//
	//		if (this == obj)
	//			return true;
	//
	//		if (this.getClass() != obj.getClass())
	//			return false;
	//
	//		CreditCard objP = (CreditCard) obj;
	//
	//		return (objP.id == this.id) ? true : false;
	//	}
	//
	//	@Override
	//	public int hashCode() {
	//
	//		int hash = 7;
	//		hash = hash * 31 + new Integer(Long.toString(id));;
	//		return hash;
	//	}

}
