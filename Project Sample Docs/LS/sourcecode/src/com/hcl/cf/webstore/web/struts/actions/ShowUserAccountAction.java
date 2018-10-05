package com.hcl.cf.webstore.web.struts.actions;

import java.util.Map;

import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.opensymphony.xwork2.ActionContext;

public class ShowUserAccountAction {

	private IUserAccount userAccount;

	/**
	 * @return the userAccount
	 */
	public IUserAccount getUserAccount() {
		return userAccount;
	}

	/**
	 * @param userAccount
	 *            the userAccount to set
	 */
	public void setUserAccount(IUserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public String execute() {

		if (getUserFromSession())
			return "success";
		return "login";
	}

	public boolean getUserFromSession() {

		Map session = (Map) ActionContext.getContext().get("session");

		if (session == null) {
			return false;
		}

		userAccount = (IUserAccount) session.get("userAccount");
		return (userAccount == null) ? false : true;
	}
}
