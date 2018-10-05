package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.ListItemsAction;

public class ListItemsActionTest extends BaseStrutsTestCase { 

	public ListItemsActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		ListItemsAction action = (ListItemsAction) createAction(ListItemsAction.class, 
				"/webstore", "getItems"); 
		action.setId(2);
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		ListItemsAction action = (ListItemsAction) createAction(ListItemsAction.class, 
				"/webstore", "getItems"); 
		action.setId(2);
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}