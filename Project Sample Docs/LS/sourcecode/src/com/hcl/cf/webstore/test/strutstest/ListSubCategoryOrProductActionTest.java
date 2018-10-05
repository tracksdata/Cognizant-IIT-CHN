package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.ListSubCategoryOrProductAction;

public class ListSubCategoryOrProductActionTest extends BaseStrutsTestCase { 

	public ListSubCategoryOrProductActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		ListSubCategoryOrProductAction action = (ListSubCategoryOrProductAction) createAction(ListSubCategoryOrProductAction.class, 
				"/webstore", "getSubCategoryOrProduct"); 
		action.setId(5); 
		String result = proxy.execute(); 
		assertEquals(result, "category"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		ListSubCategoryOrProductAction action = (ListSubCategoryOrProductAction) createAction(ListSubCategoryOrProductAction.class, 
				"/webstore", "getSubCategoryOrProduct"); 
		action.setId(5); 
		String result = action.execute(); 
		assertEquals(result, "category"); 
	} 
}