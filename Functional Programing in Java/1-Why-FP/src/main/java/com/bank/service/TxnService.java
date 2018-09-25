package com.bank.service;

import java.util.List;

import com.bank.model.Txn;
import com.bank.model.TxnType;

public interface TxnService {

	List<Txn> getTxns(int top);
	public List<Txn> getTxns(double amount);
	public List<Txn> getTxns(double amount,TxnType type);
	
}
