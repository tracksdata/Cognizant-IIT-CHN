package com.hcl.cf.webstore.web.struts.actions;

import java.util.Map;

import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {

	private ICart cart;

	private String password;

	private IUserAccount userAccount;

	private String userName;

	private IWebStoreFacade webStore = new WebStorePOJO();

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

	public String execute() {

		userAccount = webStore.getUserAccount(userName, password);

		if (userAccount == null)
			return "usererror";

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return "sessionerror";
		}
		
		session.put("userAcount", userAccount);

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

	private boolean getCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		cart = (ICart) session.get("cart");
		return (cart == null) ? false : true;
	}

	private boolean getOrderFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		IOrder order = (IOrder) session.get("order");
		return (order == null) ? false : true;
	}

	/**
	 * @param cart
	 *            the cart to set
	 */
	public void setCart(ICart cart) {
		this.cart = cart;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
}
