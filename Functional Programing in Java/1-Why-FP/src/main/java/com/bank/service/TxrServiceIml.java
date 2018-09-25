package com.bank.service;

import org.apache.log4j.Logger;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;
import com.bank.repository.JdbcAccountRepository;

/*
 * 
 *  performance & design issues
 *  -----------------------------
 *  
 *  ==> duplicate dependency instance created on every txr
 *  	 cause : memory use high,slow
 *  ==> tight-coupling b/w dependent & dependency
 *  	 cause : can't extend with new feayures
 *  ==> unit-testing not possible
 *       cause : dev & bog fix slow
 *  
 *  
 *  
 *  why these issues ?
 *  
 *  => dependent itself creating its own dependency
 *  
 *  soln:
 *  
 *  	=> don't create, do lookup
 *  
 *   limitation on lookup :
 *   
 *   	=> location tight-coupling
 *   
 *   best soln :  dont create,lookup , get/inject by 'some-one'  ( IOC )
 *   
 *   how to implement this IOC ?
 *   
 *   => dependency injection ( DI )
 *   
 *   
 *   
 *    S => Single responsibility principle
 *    O => Open closed principle
 *    L => Liskov substitution principle
 *    I => Interface segregation principle
 *    D => Dependency Inversion principle
 *   
 *   
 * 
 */

public class TxrServiceIml implements TxrService {

	private static Logger logger = Logger.getLogger("bank");

	private AccountRepository accountRepository;

	public TxrServiceIml(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("TxrService instance crated..");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.TxrService#txr(java.lang.String, java.lang.String,
	 * double)
	 */
	public void txr(String fromAccNum, String toAccNum, double amount) {
		logger.info("Txr initiated...");
		// load accounts
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);
		// debit &credit

		// update
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);
		logger.info("Txr success");
	}

}
