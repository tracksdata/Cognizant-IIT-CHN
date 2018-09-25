package com.bank.repository;

import java.util.List;

import com.bank.model.Txn;

public interface TxnRepository {
	
	List<Txn> findAll();

}
