package com.hcl.cf.webstore.test.nonJUnit;

import java.util.Date;

import org.hibernate.Session;

import com.hcl.cf.webstore.domain.entities.CreditCard;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class TestCreditCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestCreditCard.saveCreditCard(createCreditCard("VISA", "123456", new Date()));
		TestCreditCard.saveCreditCard(createCreditCard("master", "23124", new Date()));
		TestCreditCard.saveCreditCard(createCreditCard("VISA", "568944", new Date()));
		TestCreditCard.saveCreditCard(createCreditCard("mASTER", "1767456", new Date()));
		TestCreditCard.saveCreditCard(createCreditCard("VISA", "666666", new Date()));
	}

	public static void saveCreditCard(CreditCard card) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(card);
		session.getTransaction().commit();
	}

	public static CreditCard createCreditCard(String type, String number,
			Date expdate) {

		CreditCard card = new CreditCard();
		card.setCardType(type);
		card.setCreditCardNumber(12447474);
		card.setExpiryDate(expdate);
		return card;
	}
}
