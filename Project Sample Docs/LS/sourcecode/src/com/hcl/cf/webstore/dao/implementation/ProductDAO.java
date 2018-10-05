package com.hcl.cf.webstore.dao.implementation;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import com.hcl.cf.webstore.dao.interfaces.IProductDAO;
import com.hcl.cf.webstore.domain.entities.Item;
import com.hcl.cf.webstore.domain.entities.Product;
import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class ProductDAO implements IProductDAO {

	/*
	 * @param product @param item @return
	 */
	public boolean addItem(IProduct product, IItem item) {

		if (product == null || item == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.update(product);
			((Product) product).addItem((Item) item);
			session.save(item);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}

	/*
	 * @param product @return
	 */
	public Set<IItem> getItems(IProduct product) {

		if (product == null)
			return null;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Set<Item> set = null;

		try {
			session.beginTransaction();
			session.refresh(product);
			Hibernate.initialize(((Product) product).getItems());
			set = ((Product) product).getItems();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return new HashSet<IItem>(set);
	}

	/*
	 * @param id @return
	 */
	public IProduct getProduct(long id) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		IProduct product = null;

		try {
			session.beginTransaction();
			product = (IProduct) session.load(Product.class, new Long(id));
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return product;
	}

	/*
	 * @param product @return
	 */
	public boolean hasDisplayableItem(IProduct product) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		BigInteger count = null;

		try {
			session.beginTransaction();
			Query query = session.createSQLQuery("select count(*) from ITEM "
					+ "item where PRODUCT_ID = ?");
			query.setString(0, new Long(product.getId()).toString());

			count = (BigInteger) query.uniqueResult();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

		if (count == null)
			return false;
		return count.intValue() > 0 ? true : false;
	}

	/*
	 * @param product @return
	 */
	public Integer getItemsCount(IProduct product) {

		if (product == null)
			return 0;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		BigInteger count = null;

		try {
			session.beginTransaction();
			Query query = session.createSQLQuery("select count(*) from ITEM "
					+ "item where PRODUCT_ID = ?");
			query.setString(0, new Long(product.getId()).toString());

			count = (BigInteger) query.uniqueResult();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return count.intValue();
	}

	/*
	 * @param product @param item @return
	 */
	public boolean removeItem(IProduct product, IItem item) {

		if (product == null || item == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.update(product);
			((Product) product).removeItem((Item) item);
			session.delete(item);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}

	/*
	 * @param category @return
	 */
	public boolean updateProduct(IProduct product) {

		if (product == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.update(product);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}
}
