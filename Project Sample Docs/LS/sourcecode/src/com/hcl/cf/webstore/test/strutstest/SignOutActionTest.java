package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.SignOutAction;

public class SignOutActionTest extends BaseStrutsTestCase { 

	public SignOutActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		SignOutAction action = (SignOutAction) createAction(SignOutAction.class, 
				"/webstore", "signOut"); 
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		SignOutAction action = (SignOutAction) createAction(SignOutAction.class, 
				"/webstore", "signOut"); 
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}