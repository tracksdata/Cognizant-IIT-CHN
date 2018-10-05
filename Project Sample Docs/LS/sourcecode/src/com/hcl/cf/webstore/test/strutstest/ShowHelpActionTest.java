package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.ShowHelpAction;

public class ShowHelpActionTest extends BaseStrutsTestCase { 

	public ShowHelpActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		ShowHelpAction action = (ShowHelpAction) createAction(ShowHelpAction.class, 
				"/webstore", "showHelp"); 
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		ShowHelpAction action = (ShowHelpAction) createAction(ShowHelpAction.class, 
				"/webstore", "showHelp"); 
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}