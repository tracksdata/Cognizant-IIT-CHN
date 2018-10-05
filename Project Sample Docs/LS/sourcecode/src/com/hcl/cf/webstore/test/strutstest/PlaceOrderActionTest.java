package com.hcl.cf.webstore.test.strutstest;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.entities.Order;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.web.struts.actions.PlaceOrderAction;

public class PlaceOrderActionTest extends BaseStrutsTestCase { 

	public PlaceOrderActionTest(String name) {
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
		PlaceOrderAction action = (PlaceOrderAction) createAction(PlaceOrderAction.class, 
				"/webstore", "placeOrder"); 
		//action.setUserAccount(webStore.getUserAccount(5));
		cart.addItem(action.getWebStore().getItem(1));
		cart.addProduct(action.getWebStore().getProduct(1), 11);
		//action.setCart(cart);
		action.setPhoneNumber(1234567890);
		action.setAddress("plot");
		action.setCity("hyd");
		action.setState("ap");
		action.setCountry("India");
		action.setZip(12345);
		action.setCardNumber(1234567890123456l);
		action.setCardType("VISA");
		action.setExpiryDate(new Date());
		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("userAccount", action.getWebStore().getUserAccount(5));
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
		PlaceOrderAction action = (PlaceOrderAction) createAction(PlaceOrderAction.class, 
				"/webstore", "placeOrder"); 
		//action.setUserAccount(webStore.getUserAccount(5));
		cart.addItem(action.getWebStore().getItem(1));
		cart.addProduct(action.getWebStore().getProduct(1), 11);
		//action.setCart(cart);
		action.setPhoneNumber(1234567890);
		action.setAddress("plot");
		action.setCity("hyd");
		action.setState("ap");
		action.setCountry("India");
		action.setZip(12345);
		action.setCardNumber(1234567890123456l);
		action.setCardType("VISA");
		action.setExpiryDate(new Date());
		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("userAccount", action.getWebStore().getUserAccount(5));
		session.put("cart", cart);
		session.put("order", order);
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}