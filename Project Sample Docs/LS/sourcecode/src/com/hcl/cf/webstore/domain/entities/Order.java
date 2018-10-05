package com.hcl.cf.webstore.domain.entities;

import java.util.Date;

import com.hcl.cf.webstore.domain.interfaces.IAddress;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.ICreditCard;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;

public class Order implements IOrder {

	private long id;

	private UserAccount userAccount;

	private Cart cart;

	private String orderStatus;

	private CreditCard creditCard = new CreditCard();

	private Address shippingAddress = new Address();

	private Date date;

	/**
	 * @return the cart
	 */
	public ICart getCart() {
		return cart;
	}

	/**
	 * @param cart
	 *            the cart to set
	 */
	public void setCart(ICart cart) {
		this.cart = (Cart) cart;
	}

	/**
	 * @param cart
	 *            the cart to set
	 */
	public void setCart(Cart cart) {
		this.cart = (Cart) cart;
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

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the userAccount
	 */
	public UserAccount getUserAccount() {
		return userAccount;
	}

	/**
	 * @param userAccount
	 *            the userAccount to set
	 */
	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	/**
	 * @return the userAccount
	 */
	public IUserAccount getIUserAccount() {
		return userAccount;
	}

	/**
	 * @param userAccount
	 *            the userAccount to set
	 */
	public void setIUserAccount(IUserAccount userAccount) {
		this.userAccount = (UserAccount) userAccount;
	}

	/**
	 * @return the creditCard
	 */
	public CreditCard getCreditCard() {
		return creditCard;
	}

	/**
	 * @param creditCard
	 *            the creditCard to set
	 */
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	/**
	 * @return the shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param shippingAddress
	 *            the shippingAddress to set
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/*
	 * @return
	 */
	public ICart getICart() {
		return cart;
	}

	/*
	 * @return
	 */
	public ICreditCard getICreditCard() {
		return creditCard;
	}

	/*
	 * @return
	 */
	public IAddress getIShippingAddress() {
		return shippingAddress;
	}

	/*
	 * @param cart
	 */
	public void setICart(ICart cart) {
		this.cart = (Cart) cart;
	}

	/*
	 * @param creditCard
	 */
	public void setICreditCard(ICreditCard creditCard) {
		this.creditCard = (CreditCard) creditCard;
	}

	/*
	 * @param shippingAddress
	 */
	public void setIShippingAddress(IAddress shippingAddress) {
		this.shippingAddress = (Address) shippingAddress;
	}
}
