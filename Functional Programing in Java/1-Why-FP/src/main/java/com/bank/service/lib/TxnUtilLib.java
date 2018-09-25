package com.bank.service.lib;

import java.util.ArrayList;
import java.util.List;

import com.bank.model.Txn;

// How
public class TxnUtilLib {

	public static List<Txn> filter(List<Txn> list, Condition condition) {
		// ..
		List<Txn> tempList = new ArrayList<>();

		for (Txn txn : list) {
			if (condition.test(txn)) {
				tempList.add(txn);
			}
		}

		return tempList;
	}

}
