package com.bank;

import java.util.List;

import com.bank.model.Txn;
import com.bank.model.TxnType;
import com.bank.repository.JdbcTxnRepository;
import com.bank.repository.TxnRepository;
import com.bank.service.TxnService;
import com.bank.service.TxnServiceImpl;

public class App {

	public static void main(String[] args) {

		// init
		// AccountRepository jdbcAccountRepository=new JdbcAccountRepository();
		// TxrService txrService = new TxrServiceIml(jdbcAccountRepository);

		TxnRepository txnRepository = new JdbcTxnRepository();
		TxnService txnService = new TxnServiceImpl(txnRepository);

		// use

//		txrService.txr("1", "2", 100.00);
//		txrService.txr("3", "4", 200.00);

		List<Txn> list = txnService.getTxns(200.00,TxnType.DEBIT);
		for (Txn txn : list) {
			System.out.println(txn);
		}

		// destroy
		// ...

	}
}
