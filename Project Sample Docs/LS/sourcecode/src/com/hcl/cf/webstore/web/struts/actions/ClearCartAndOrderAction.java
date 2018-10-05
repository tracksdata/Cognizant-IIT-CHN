package com.hcl.cf.webstore.web.struts.actions;

import java.util.Map;

import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.opensymphony.xwork2.ActionContext;

public class ClearCartAndOrderAction {

	public String execute() {

		if (getCartFromSession() != null)
			removeCartFromSession();

		if (getOrderFromSession() != null)
			removeOrderFromSession();

		return "success";
	}

	/**
	 * @return the cart
	 */
	public ICart getCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return null;
		}

		return (ICart) session.get("cart");
	}

	private IOrder getOrderFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return null;
		}

		return (IOrder) session.get("order");
	}

	/**
	 * @return the cart
	 */
	public boolean removeCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		session.put("cart", null);
		return true;
	}

	/**
	 * @return the cart
	 */
	public boolean removeOrderFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		session.put("order", null);
		return true;
	}
}
