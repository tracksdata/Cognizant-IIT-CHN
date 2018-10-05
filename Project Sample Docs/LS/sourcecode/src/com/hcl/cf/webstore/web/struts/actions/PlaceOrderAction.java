package com.hcl.cf.webstore.web.struts.actions;

import java.util.Date;
import java.util.Map;

import com.hcl.cf.webstore.domain.constants.IAddressType;
import com.hcl.cf.webstore.domain.constants.IOrderStatus;
import com.hcl.cf.webstore.domain.interfaces.IAddress;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.ICreditCard;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.opensymphony.xwork2.ActionContext;

public class PlaceOrderAction {

	private String address;

	private long phoneNumber;

	private String city;

	private String state;

	private long zip;

	private String cardType;

	private long cardNumber;

	private Date expiryDate;

	private String country;

	private IWebStoreFacade webStore = new WebStorePOJO();

	private ICart cart;

	private IUserAccount userAccount;

	private IOrder order;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the cardNumber
	 */
	public long getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber
	 *            the cardNumber to set
	 */
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public long getZip() {
		return zip;
	}

	/**
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(long zip) {
		this.zip = zip;
	}

	/**
	 * @return the webStore
	 */
	public IWebStoreFacade getWebStore() {
		return webStore;
	}

	/**
	 * @param webStore
	 *            the webStore to set
	 */
	public void setWebStore(IWebStoreFacade webStore) {
		this.webStore = webStore;
	}

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
		this.cart = cart;
	}

	/**
	 * @return the userAccount
	 */
	public IUserAccount getUserAccount() {
		return userAccount;
	}

	/**
	 * @param userAccount
	 *            the userAccount to set
	 */
	public void setUserAccount(IUserAccount userAccount) {
		this.userAccount = userAccount;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the order
	 */
	public IOrder getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(IOrder order) {
		this.order = order;
	}


	public String execute() {

		if (!getCartFromSession())
			return "sessionerror";

		if (!getUserFromSession()) {
			removeCartFromSession();
			return "sessionerror";
		}

		if (!getOrderFromSession()) {
			removeCartFromSession();
			removeUserFromSession();
			return "sessionerror";
		}

		if (!validate())
			return "showBillingDetails";

		IAddress shippingAddress = webStore.createAddress();
		shippingAddress.setAddress(address);
		shippingAddress.setCity(city);
		shippingAddress.setCountry(country);
		shippingAddress.setState(state);
		shippingAddress.setType(IAddressType.BILLING);
		shippingAddress.setZip(zip);
		shippingAddress.setPhoneNumber(phoneNumber);

		ICreditCard creditCard = webStore.createCreditCard();
		creditCard.setCardType(cardType);
		creditCard.setCreditCardNumber(cardNumber);
		creditCard.setExpiryDate(expiryDate);

		order.setDate(new Date());
		order.setICart(cart);
		order.setIShippingAddress(shippingAddress);
		order.setIUserAccount(userAccount);
		order.setOrderStatus(IOrderStatus.PENDING);
		order.setICreditCard(creditCard);

		return (webStore.addOrder(order)) ? "success" : "error";
	}

	public boolean getCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		cart = (ICart) session.get("cart");

		return (cart == null) ? false : true;
	}

	public boolean removeCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		session.put("cart", null);
		return true;
	}

	public boolean getUserFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		userAccount = (IUserAccount) session.get("userAccount");

		return (userAccount == null) ? false : true;
	}

	public boolean removeUserFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		session.put("userAccount", null);
		return true;
	}

	private boolean getOrderFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		order = (IOrder) session.get("order");
		return (order == null) ? false : true;
	}

	private boolean validate() {
		if (this.address == null || Long.toString(this.cardNumber) == null
				|| this.cardType == null || this.city == null
				|| this.country == null  || (this.expiryDate == null)
				|| Long.toString(this.phoneNumber) == null || this.state == null
				|| Long.toString(this.zip) == null)
			return false;

		if (this.address.isEmpty() || Long.toString(this.cardNumber).isEmpty()
				|| this.cardType.isEmpty() || this.city.isEmpty()
				|| this.country.isEmpty() || Long.toString(this.phoneNumber).isEmpty()
				|| this.state.isEmpty() || Long.toString(this.zip).isEmpty() || this.expiryDate.toString().isEmpty())
			return false;
		return true;
	}
}
