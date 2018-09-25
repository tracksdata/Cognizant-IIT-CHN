package com.bank.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bank.model.Txn;
import com.bank.model.TxnType;

public class JdbcTxnRepository implements TxnRepository {

	public List<Txn> findAll() {
		List<Txn> list = new ArrayList<Txn>();
		list.add(new Txn(34234, 100.00, LocalDate.of(2017, 10, 01), TxnType.CREDIT));
		list.add(new Txn(34239, 300.00, LocalDate.of(2017, 10, 14), TxnType.CREDIT));
		list.add(new Txn(34233, 500.00, LocalDate.of(2018, 10, 03), TxnType.DEBIT));
		list.add(new Txn(34232, 400.00, LocalDate.of(2018, 5, 14), TxnType.CREDIT));
		list.add(new Txn(34231, 200.00, LocalDate.of(2018, 4, 14), TxnType.CREDIT));
		list.add(new Txn(34236, 700.00, LocalDate.of(2018, 7, 4), TxnType.CREDIT));
		list.add(new Txn(34236, 600.00, LocalDate.of(2018, 2, 4), TxnType.DEBIT));
		return list;
	}

}
