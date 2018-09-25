package com.bank.repository;

import com.bank.model.Account;

public interface AccountRepository {
	Account load(String num);

	void update(Account account);
}
