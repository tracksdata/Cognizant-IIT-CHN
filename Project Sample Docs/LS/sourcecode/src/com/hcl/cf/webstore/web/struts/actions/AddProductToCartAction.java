package com.hcl.cf.webstore.web.struts.actions;

import java.util.Map;

import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductToCartAction extends ActionSupport {

	private long id;

	private long quantity;

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
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
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

	/**
	 * @return the quantity
	 */
	public long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String execute() {

		if (!init())
			return "error";

		IProduct product = webStore.getProduct(id);

		if (product == null)
			return "error";

		return (cart.addProduct(product, quantity)) ? "success" : "adderror";
	}

	public boolean init() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}
		cart = (ICart) session.get("cart");

		if (cart == null) {
			cart = webStore.createCart();
			session.put("cart", cart);
		}
		return true;
	}
}
