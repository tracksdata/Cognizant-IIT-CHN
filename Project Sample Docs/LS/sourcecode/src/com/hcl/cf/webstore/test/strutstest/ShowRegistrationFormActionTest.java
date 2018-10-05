package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.ShowRegistrationFormAction;

public class ShowRegistrationFormActionTest extends BaseStrutsTestCase { 

	public ShowRegistrationFormActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		ShowRegistrationFormAction action = (ShowRegistrationFormAction) createAction(ShowRegistrationFormAction.class, 
				"/webstore", "showRegistrationForm"); 
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		ShowRegistrationFormAction action = (ShowRegistrationFormAction) createAction(ShowRegistrationFormAction.class, 
				"/webstore", "showRegistrationForm"); 
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}