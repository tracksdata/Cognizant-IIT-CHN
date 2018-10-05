package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.RegisterUserAction;

public class RegisterUserActionTest extends BaseStrutsTestCase { 

	public RegisterUserActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		RegisterUserAction action = (RegisterUserAction) createAction(RegisterUserAction.class, 
				"/webstore", "registerUser"); 
		action.setUserName("harini"); 
		action.setPassword("harry");
	
		action.setLastName("r");
		action.setEmail("hari@123");
		action.setDob("23-03-1989");
		action.setPhoneNumber(1234567890);
		action.setAddress("plot");
		action.setCity("hyd");
		action.setState("ap");
		action.setCountry("India");
		action.setZip(12345);
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		RegisterUserAction action = (RegisterUserAction) createAction(RegisterUserAction.class, 
				"/webstore", "registerUser"); 
		action.setUserName("manoj"); 
		action.setPassword("manu");

		action.setLastName("n");
		action.setEmail("manu@123");
		action.setDob("23-03-1989");
		action.setPhoneNumber(1234567890);
		action.setAddress("plot1");
		action.setCity("hyd");
		action.setState("ap");
		action.setCountry("India");
		action.setZip(12345);
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}