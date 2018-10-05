package com.hcl.cf.webstore.dao.implementation;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import com.hcl.cf.webstore.dao.interfaces.ICategoryDAO;
import com.hcl.cf.webstore.domain.entities.Category;
import com.hcl.cf.webstore.domain.entities.Product;
import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class CategoryDAO implements ICategoryDAO {

	/*
	 * @param category @param product @return
	 */
	public boolean addProduct(ICategory category, IProduct product) {

		if (product == null || category == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.update(category);
			((Category) category).addProduct((Product) product);
			session.save(product);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}

	/*
	 * @param category @param subCategory @return
	 */
	public boolean addSubCategory(ICategory category, ICategory subCategory) {

		if (subCategory == null || category == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.update(category);
			((Category) subCategory).setSubCategory((Category) category);
			session.save(subCategory);
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
	public ICategory getCategory(long id) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		ICategory category = null;
		try {
			session.beginTransaction();
			category = (ICategory) session.get(Category.class, new Long(id));
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return category;
	}

	/*
	 * @param category @return
	 */
	public Set<IProduct> getProducts(ICategory category) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Set<Product> products = null;

		try {
			session.beginTransaction();
			session.refresh(category);
			products = ((Category) category).getProducts();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

		if (products == null)
			return null;
		return new HashSet<IProduct>(products);
	}

	/*
	 * @param category @return
	 */
	public Set<ICategory> getSubCategories(ICategory category) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		List list = null;
		try {
			session.beginTransaction();
			Query query = session.createQuery("from Category as category where"
					+ " subCategory.id = ?");
			query.setString(0, new Long(category.getId()).toString());
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

		if (list == null)
			return null;
		return new HashSet<ICategory>(list);
	}

	public boolean hasProducts(ICategory category) {

		if (category == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Set<Product> set = null;

		try {
			session.beginTransaction();
			session.refresh(category);
			Hibernate.initialize(((Category) category).getProducts());
			set = ((Category) category).getProducts();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

		if (set == null)
			return false;

		return set.size() > 0 ? true : false;
	}

	/*
	 * @param category @return
	 */
	public boolean hasSubCategories(ICategory category) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		BigInteger count = null;

		try {
			session.beginTransaction();
			Query query = session
			.createSQLQuery("select count(*) from Category "
					+ "where SUB_ID = ?");
			query.setString(0, new Long(category.getId()).toString());

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
	 * @param category @return
	 */
	public boolean removeProduct(ICategory category, IProduct product) {

		if (product == null || category == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.update(category);
			((Category) category).removeProduct((Product) product);
			session.delete(product);
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
	public boolean updateCategory(ICategory category) {

		if (category == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.update(category);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}
}
