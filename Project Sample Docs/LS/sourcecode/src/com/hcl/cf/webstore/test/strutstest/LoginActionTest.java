package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.LoginAction;

public class LoginActionTest extends BaseStrutsTestCase { 

	public LoginActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		LoginAction action = (LoginAction) createAction(LoginAction.class, 
				"/webstore", "login"); 
		action.setUserName("sushanth"); 
		action.setPassword("sush");
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		LoginAction action = (LoginAction) createAction(LoginAction.class, 
				"/webstore", "login"); 
		action.setUserName("sushanth"); 
		action.setPassword("sush"); 
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}