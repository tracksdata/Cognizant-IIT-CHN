package com.hcl.cf.webstore.test.strutstest;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import com.hcl.cf.webstore.web.struts.actions.ShowUserAccountAction;

public class ShowUserAccountActionTest extends BaseStrutsTestCase { 

	public ShowUserAccountActionTest(String name) {
		super(name);
	}

	private IWebStoreFacade  webStore = new WebStorePOJO();

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		ShowUserAccountAction action = (ShowUserAccountAction) createAction(ShowUserAccountAction.class, 
				"/webstore", "showUserAccount"); 

		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("userAccount", webStore.getUserAccount(4));

		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		ShowUserAccountAction action = (ShowUserAccountAction) createAction(ShowUserAccountAction.class, 
				"/webstore", "showUserAccount"); 

		Map session = (Map) ServletActionContext.getContext().get("session");
		session.put("userAccount", webStore.getUserAccount(4));

		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}