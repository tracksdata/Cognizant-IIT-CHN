package com.hcl.cf.webstore.dao.implementation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hcl.cf.webstore.dao.interfaces.IOrderDAO;
import com.hcl.cf.webstore.domain.entities.CreditCard;
import com.hcl.cf.webstore.domain.entities.Order;
import com.hcl.cf.webstore.domain.interfaces.ICreditCard;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class OrderDAO implements IOrderDAO {

	/*
	 * @param order @return
	 */
	public boolean addOrder(IOrder order) {

		if (order == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.save(order);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return true;
	}

	/*
	 * @param id @return
	 */
	public IOrder getOrder(long id) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		IOrder order = null;

		try {
			session.beginTransaction();
			order = (IOrder) session.load(Order.class, new Long(id));
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return order;
	}

	/*
	 * @param order @return
	 */
	public boolean removeOrder(IOrder order) {
		if (order == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.delete(order);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return true;
	}	

/*
 * @param userName @return
 */
public Set<IOrder> getOrders(String userName) {

	if (userName == null || userName.isEmpty())
		return null;

	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	List list = null;

	try {
		session.beginTransaction();

		Query query = session
		.createQuery("from Order order where order.userAccount.userName = ?");
		query.setString(0, userName);
		list = query.list();
		session.getTransaction().commit();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {

	}
	return new HashSet<IOrder>(list);
}

}
