package com.bank.service.lib;

import com.bank.model.Txn;

public interface Condition {
	
	boolean test(Txn txn);

}
