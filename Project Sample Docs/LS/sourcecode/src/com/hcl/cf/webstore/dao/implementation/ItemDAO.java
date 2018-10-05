package com.hcl.cf.webstore.dao.implementation;

import org.hibernate.Session;

import com.hcl.cf.webstore.dao.interfaces.IItemDAO;
import com.hcl.cf.webstore.domain.entities.Item;
import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class ItemDAO implements IItemDAO {

	/*
	 * @param id @return
	 */
	public IItem getItem(long id) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		IItem item = null;

		try {
			session.beginTransaction();
			item = (IItem) session.load(Item.class, new Long(id));
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return item;
	}

	/*
	 * @param item @return
	 */
	public boolean updateItem(IItem item) {

		if (item == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.update(item);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}
}
