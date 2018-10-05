package com.hcl.cf.webstore.web.struts.actions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.hcl.cf.webstore.domain.constants.IAddressType;
import com.hcl.cf.webstore.domain.interfaces.IAddress;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.opensymphony.xwork2.ActionContext;

public class RegisterUserAction {

	private String address;

	private String dob;

	private String email;

	private ICart cart;

	private String city;

	private String confirmPassword;

	private String country;

	private String firstNam;

	private String lastName;

	private String password;

	private long phoneNumber;

	private String state;

	private IUserAccount userAccount;

	private String userName;

	private IWebStoreFacade webStore = new WebStorePOJO();

	private long zip;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the cart
	 */
	public ICart getCart() {
		return cart;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the userAccount
	 */
	public IUserAccount getUserAccount() {
		return userAccount;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the webStore
	 */
	public IWebStoreFacade getWebStore() {
		return webStore;
	}

	/**
	 * @return the zip
	 */
	public long getZip() {
		return zip;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param cart
	 *            the cart to set
	 */
	public void setCart(ICart cart) {
		this.cart = cart;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param confirmPassword
	 *            the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstNam(String firstNam) {
		this.firstNam = firstNam;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param userAccount
	 *            the userAccount to set
	 */
	public void setUserAccount(IUserAccount userAccount) {
		this.userAccount = userAccount;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param webStore
	 *            the webStore to set
	 */
	public void setWebStore(IWebStoreFacade webStore) {
		this.webStore = webStore;
	}

	/**
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(long zip) {
		this.zip = zip;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private boolean getCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		cart = (ICart) session.get("cart");
		return (cart == null) ? false : true;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstNam() {
		return firstNam;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	public String execute() {

		if (!validate())
			return "reenter";

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return "error";
		}

		session.put("userAccount", userAccount);

		IAddress mailingAddress = webStore.createAddress();
		mailingAddress.setAddress(address);
		mailingAddress.setCity(city);
		mailingAddress.setCountry(country);
		mailingAddress.setState(state);
		mailingAddress.setType(IAddressType.BILLING);
		mailingAddress.setZip(zip);
		mailingAddress.setPhoneNumber(phoneNumber);

		userAccount.setIAddress(mailingAddress);
		userAccount.setFirstName(firstNam);
		userAccount.setLastName(lastName);
		userAccount.setPassword(password);
		userAccount.setUserName(userName);

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date birthDate = null;
		try {
			birthDate = df.parse(dob);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		userAccount.setBirthDate(birthDate);

		webStore.addUserAccount(userAccount);

		if (getCartFromSession()) {
			return (!getOrderFromSession()) ? "success" : "showBillingDetails";
		} else if (createCart()) {
			return "success";
		} else
			return "error";
	}

	private boolean createCart() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}
		cart = webStore.createCart();
		session.put("cart", cart);
		return true;
	}
	private boolean getOrderFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		IOrder order = (IOrder) session.get("order");
		return (order == null) ? false : true;
	}

	private boolean validate() {

		if (!this.password.equals(confirmPassword))
			return false;

		if (this.address == null || this.city == null || this.country == null
				|| this.firstNam == null || this.lastName == null
				|| this.password == null || Long.toString(this.phoneNumber) == null
				|| this.state == null || this.userName == null
				|| Long.toString(this.zip) == null || this.dob == null)
			return false;

		if (this.address.isEmpty() || this.city.isEmpty()
				|| this.country.isEmpty() || this.firstNam.isEmpty()
				|| this.lastName.isEmpty() || this.password.isEmpty()
				|| Long.toString(this.phoneNumber).isEmpty() || this.state.isEmpty()
				|| this.userName.isEmpty() || Long.toString(this.zip).isEmpty()
				|| this.dob.isEmpty())
			return false;
		return true;
	}
}
