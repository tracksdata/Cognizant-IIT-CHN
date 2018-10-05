package com.hcl.cf.webstore.test.strutstest;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.web.struts.actions.RemoveProductAction;

public class RemoveProductActionTest extends BaseStrutsTestCase { 

	public RemoveProductActionTest(String name) {
		super(name);
	}

	private ICart cart = new Cart();

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		RemoveProductAction action = (RemoveProductAction) createAction(RemoveProductAction.class, 
				"/webstore", "removeProduct"); 
		cart.addProduct(action.getWebStore().getProduct(1), 10);
		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("cart", cart);
		action.setId(new Long(1)); 
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		RemoveProductAction action = (RemoveProductAction) createAction(RemoveProductAction.class, 
				"/webstore", "removeProduct"); 
		cart.addProduct(action.getWebStore().getProduct(1), 10);
		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("cart", cart);
		action.setId(new Long(1)); 
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}