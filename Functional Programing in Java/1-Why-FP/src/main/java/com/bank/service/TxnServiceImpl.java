package com.bank.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bank.model.Txn;
import com.bank.model.TxnType;
import com.bank.repository.TxnRepository;
import com.bank.service.lib.Condition;
import com.bank.service.lib.TxnUtilLib;

public class TxnServiceImpl implements TxnService {

	private TxnRepository txnRepository;

	public TxnServiceImpl(TxnRepository txnRepository) {
		this.txnRepository = txnRepository;
	}

	public List<Txn> getTxns(int top) {

		List<Txn> txns = txnRepository.findAll(); // input

		// way-1 : // what + how ==> imperative style

		List<Txn> outList = new ArrayList<Txn>();
		int count = 0;
		for (Txn txn : txns) {
			if (count < top)
				outList.add(txn);
		}
		return outList; // outut

	}

	public List<Txn> getTxns(double amount) {

		List<Txn> txns = txnRepository.findAll(); // input

		// ----------------------------------------------------------
		// way-1: what + how ==> imperative style

		// List<Txn> outList = new ArrayList<Txn>();
		// int count = 0;
		// for (Txn txn : txns) {
		// if (count < 3)
		// if (txn.getAmount() == amount)
		// outList.add(txn);
		// }
		// return outList; // outut
		// ----------------------------------------------------------

		// way-2 : what ( separate class )
		// return TxnUtilLib.filter(txns, new ByAmountAbove300());

		// ----------------------------------------------------------

		// way-3 : what (Anonymous inner-class )
		// return TxnUtilLib.filter(txns, new Condition() {
		// @Override
		// public boolean test(Txn txn) {
		// return txn.getAmount() > amount;
		// }
		// });

		// ----------------------------------------------------------

		// way-4 : what ( by function )
		return TxnUtilLib.filter(txns, txn -> txn.getAmount() > amount);

		// ----------------------------------------------------------

	}

	@Override
	public List<Txn> getTxns(double amount, TxnType type) {

		List<Txn> txns = txnRepository.findAll(); // input
		
		return txns
		.stream()
		.filter(txn->txn.getType()==type)
		.filter(txn->txn.getAmount()>amount)
		.limit(1)
		.collect(Collectors.toList());

	}

	public List<Txn> getTxns(int top, LocalDate date) {
		return null;
	}

	public List<Txn> getTxns(int top, LocalDate fromDate, LocalDate endDate) {
		return null;
	}

}
//
//class ByAmountAbove300 implements Condition {
//	@Override
//	public boolean test(Txn txn) {
//		return txn.getAmount() > 300;
//	}
//}
