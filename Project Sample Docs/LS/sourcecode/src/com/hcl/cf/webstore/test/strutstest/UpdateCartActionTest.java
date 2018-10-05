package com.hcl.cf.webstore.test.strutstest;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.hcl.cf.webstore.web.struts.actions.UpdateCartAction;

public class UpdateCartActionTest extends BaseStrutsTestCase { 

	public UpdateCartActionTest(String name) {
		super(name);
	}

	private ICart cart = new Cart();
	private IWebStoreFacade  webStore = new WebStorePOJO();

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		UpdateCartAction action = (UpdateCartAction) createAction(UpdateCartAction.class, 
				"/webstore", "updateCart"); 

		cart.addItem(webStore.getItem(1));
		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("cart", cart);

		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		UpdateCartAction action = (UpdateCartAction) createAction(UpdateCartAction.class, 
				"/webstore", "updateCart"); 

		cart.addItem(webStore.getItem(1));
		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("cart", cart);

		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}