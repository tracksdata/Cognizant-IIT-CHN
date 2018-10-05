package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.AddItemToCartAction;

public class AddItemToCartActionTest extends BaseStrutsTestCase { 

	public AddItemToCartActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		AddItemToCartAction action = (AddItemToCartAction) createAction(AddItemToCartAction.class, 
				"/webstore", "addItemToCart"); 
		action.setId(1); 
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		AddItemToCartAction action = (AddItemToCartAction) createAction(AddItemToCartAction.class, 
				"/webstore", "addItemToCart"); 
		action.setId(1); 
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}