package com.comps;

import com.container.RequestMapping;
import com.container.RequestMethod;

public class UserComponent {

	@RequestMapping(method = RequestMethod.POST, url = "/users/login")
	public void doLogin(String userName, String password) {
		System.out.println("user login..with " + userName + "-" + password);
	}

	@RequestMapping(method = RequestMethod.POST, url = "/users/register")
	public void doRegister() {
		System.out.println("user register..");
	}

}
