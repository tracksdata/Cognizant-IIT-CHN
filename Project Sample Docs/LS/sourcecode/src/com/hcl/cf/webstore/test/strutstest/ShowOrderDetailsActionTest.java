package com.hcl.cf.webstore.test.strutstest;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.entities.Order;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.web.struts.actions.ShowOrderDetailsAction;

public class ShowOrderDetailsActionTest extends BaseStrutsTestCase { 

	public ShowOrderDetailsActionTest(String name) {
		super(name);
	}

	private ICart cart = new Cart();
	private IOrder order = new Order();

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		ShowOrderDetailsAction action = (ShowOrderDetailsAction) createAction(ShowOrderDetailsAction.class, 
				"/webstore", "showOrderDetails"); 

		cart.addItem(action.getWebStore().getItem(1));
		cart.addProduct(action.getWebStore().getProduct(1), 11);

		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("cart", cart);

		String result = proxy.execute(); 
		assertEquals(result, "login"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		ShowOrderDetailsAction action = (ShowOrderDetailsAction) createAction(ShowOrderDetailsAction.class, 
				"/webstore", "showOrderDetails"); 
		cart.addItem(action.getWebStore().getItem(1));
		cart.addProduct(action.getWebStore().getProduct(1), 11);

		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("cart", cart);

		String result = action.execute(); 
		assertEquals(result, "login"); 
	} 
}