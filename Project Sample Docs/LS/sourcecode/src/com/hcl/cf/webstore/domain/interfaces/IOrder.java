package com.hcl.cf.webstore.domain.interfaces;

import java.util.Date;

public interface IOrder {

	/**
	 * @return the cart
	 */
	ICart getICart();

	/**
	 * @return the creditCard
	 */
	ICreditCard getICreditCard();

	/**
	 * @return the date
	 */
	Date getDate();

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @return the userAccount
	 */
	IUserAccount getIUserAccount();

	/**
	 * @return the orderStatus
	 */
	String getOrderStatus();

	/**
	 * @return the shippingAddress
	 */
	IAddress getIShippingAddress();

	/**
	 * @param cart
	 *            the cart to set
	 */
	void setICart(ICart cart);

	/**
	 * @param creditCard
	 *            the creditCard to set
	 */
	void setICreditCard(ICreditCard creditCard);

	/**
	 * @param date
	 *            the date to set
	 */
	void setDate(Date date);

	/**
	 * @param userAccount
	 *            the userAccount to set
	 */
	void setIUserAccount(IUserAccount userAccount);

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	void setOrderStatus(String orderStatus);

	/**
	 * @param shippingAddress
	 *            the shippingAddress to set
	 */
	void setIShippingAddress(IAddress shippingAddress);
}
