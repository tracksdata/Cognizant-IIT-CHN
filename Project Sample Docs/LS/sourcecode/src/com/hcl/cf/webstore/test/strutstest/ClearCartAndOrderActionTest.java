package com.hcl.cf.webstore.test.strutstest;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.entities.Order;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.hcl.cf.webstore.web.struts.actions.ClearCartAndOrderAction;

public class ClearCartAndOrderActionTest extends BaseStrutsTestCase { 

	public ClearCartAndOrderActionTest(String name) {
		super(name);
	}

	private ICart cart = new Cart();
	private IOrder order = new Order();
	private IWebStoreFacade  webStore = new WebStorePOJO();

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		ClearCartAndOrderAction action = (ClearCartAndOrderAction) createAction(ClearCartAndOrderAction.class, 
				"/webstore", "clearCartAndOrder"); 

		cart.addItem(webStore.getItem(1));
		cart.addProduct(webStore.getProduct(1), 11);

		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("cart", cart);
		session.put("order", order);

		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		ClearCartAndOrderAction action = (ClearCartAndOrderAction) createAction(ClearCartAndOrderAction.class, 
				"/webstore", "clearCartAndOrder"); 
		cart.addItem(webStore.getItem(1));
		cart.addProduct(webStore.getProduct(1), 11);

		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("cart", cart);
		session.put("order", order);

		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}