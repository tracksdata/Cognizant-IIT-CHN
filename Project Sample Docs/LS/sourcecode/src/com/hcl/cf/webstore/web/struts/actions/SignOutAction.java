package com.hcl.cf.webstore.web.struts.actions;

import java.util.Map;

import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.opensymphony.xwork2.ActionContext;

public class SignOutAction {

	public String execute() {

		if (getUserFromSession() != null)
			removeUserFromSession();

		if (getCartFromSession() != null)
			removeCartFromSession();

		if (getOrderFromSession() != null)
			removeOrderFromSession();

		return "success";
	}

	/**
	 * @return the cart
	 */
	private ICart getCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return null;
		}

		return (ICart) session.get("cart");
	}

	private boolean removeCartFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		session.put("cart", null);
		return true;
	}

	private IUserAccount getUserFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return null;
		}

		return (IUserAccount) session.get("userAccount");
	}

	private boolean removeUserFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		session.put("userAccount", null);
		return true;
	}

	private IOrder getOrderFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return null;
		}

		return (IOrder) session.get("order");
	}

	private boolean removeOrderFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		session.put("order",null);
		return true;
	}
}
