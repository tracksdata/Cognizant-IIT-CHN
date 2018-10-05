package com.hcl.cf.webstore.dao.interfaces;

import com.hcl.cf.webstore.domain.interfaces.IUserAccount;

public interface IUserAccountDAO {

	boolean addUserAccount (IUserAccount account);

	IUserAccount getUserAccount(long id);

	IUserAccount getUserAccount(String userName);

	IUserAccount getUserAccount(String userName, String pwd);	

	boolean removeUserAccount(IUserAccount account);

	boolean updateUserAccount(IUserAccount account);
}
