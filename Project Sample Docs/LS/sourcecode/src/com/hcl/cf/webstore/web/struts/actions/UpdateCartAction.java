package com.hcl.cf.webstore.web.struts.actions;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.opensymphony.xwork2.ActionContext;

public class UpdateCartAction {

	public String execute() {

		ICart cart = (ICart) getCartFromSession();

		if (cart == null)
			return "error";

		List<Long> ids = cart.getProductIDs();
		HttpServletRequest request = getRequest();

		if ((ids.size() < 1) || (request == null))
			return "error";

		for (Long id : ids) {
			Long quantity = new Long(request.getParameter("quantity"));

			if (quantity == null)
				return "quantityerror";

			if (quantity > 0) {
				cart.setProductQuantity(id, quantity);
			}
		}

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

	private HttpServletRequest getRequest() {

		HttpServletRequest request = ServletActionContext.getRequest();
		return request;
	}
}
