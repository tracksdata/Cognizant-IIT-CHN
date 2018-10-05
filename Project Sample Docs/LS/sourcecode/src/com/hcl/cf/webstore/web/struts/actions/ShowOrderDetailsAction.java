package com.hcl.cf.webstore.web.struts.actions;

import java.util.Map;

import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.opensymphony.xwork2.ActionContext;

public class ShowOrderDetailsAction {

	private IWebStoreFacade webStore = new WebStorePOJO();

	private ICart cart;

	private IUserAccount userAccount;

	private IOrder order;

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

		if (!createAndLoadOrder())
			return "error";

		if (!getUserFromSession())
			return "login";

		return "success";
	}

	public boolean getCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		cart = (ICart) session.get("cart");

		return (cart == null) ? false : true;
	}

	private boolean createAndLoadOrder() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		order = (IOrder) session.get("order");

		if (order == null) {
			order = webStore.createOrder();
			session.put("order", order);
		}

		return (order == null) ? false : true;
	}

	public boolean getUserFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		userAccount = (IUserAccount) session.get("userAccount");

		return (userAccount == null) ? false : true;
	}
}
