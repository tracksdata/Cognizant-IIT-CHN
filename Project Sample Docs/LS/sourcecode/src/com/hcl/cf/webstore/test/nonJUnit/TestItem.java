package com.hcl.cf.webstore.test.nonJUnit;

import org.hibernate.Session;

import com.hcl.cf.webstore.domain.entities.Item;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class TestItem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Item itm1 = TestItem.createItem("name1", "desc1", 123.12f, 1000);
		Item itm2 = TestItem.createItem("name2", "desc2", 444.12f, 2222);
		Item itm3 = TestItem.createItem("name3", "desc3", 333.12f, 1111);
		Item itm4 = TestItem.createItem("name4", "desc4", 222.12f, 3333);
		Item itm5 = TestItem.createItem("name5", "desc5", 555.12f, 4444);

		TestItem.saveItem(itm1);
		TestItem.saveItem(itm2);
		TestItem.saveItem(itm3);
		TestItem.saveItem(itm4);
		TestItem.saveItem(itm5);
	}

	public static void saveItem(Item itm) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(itm);
		session.getTransaction().commit();
	}

	public static Item createItem(String name, String desc, double price,
			int units) {

		Item itm1 = new Item ();
		itm1.setDescription(desc);
		itm1.setName(name);
		itm1.setPrice(price);
		return itm1;
	}

	public static void printItem(Item itm) {

		System.out.println("Item..."+itm.getId());
		System.out.println(itm.getDescription());
		System.out.println(itm.getName());
		System.out.println(itm.getPrice());
	}
}
