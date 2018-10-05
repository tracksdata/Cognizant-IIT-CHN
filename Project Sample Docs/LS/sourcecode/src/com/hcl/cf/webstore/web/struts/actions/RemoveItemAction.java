package com.hcl.cf.webstore.web.struts.actions;

import java.util.Map;

import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.opensymphony.xwork2.ActionContext;

public class RemoveItemAction {

	private Long id;

	private IWebStoreFacade webStore = new WebStorePOJO();

	private ICart cart;

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
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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

	public String execute() {

		if (!init())
			return "error";

		IItem item = webStore.getItem(id);

		if (item == null)
			return "error";

		return cart.removeItem(item) ? "success" : "error";
	}

	public boolean init() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		cart = (ICart) session.get("cart");

		return (cart == null) ? false : true;
	}
}
