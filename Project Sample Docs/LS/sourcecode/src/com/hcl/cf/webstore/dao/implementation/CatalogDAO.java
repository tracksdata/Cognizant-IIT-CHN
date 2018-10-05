package com.hcl.cf.webstore.dao.implementation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.hcl.cf.webstore.dao.interfaces.ICatalogDAO;
import com.hcl.cf.webstore.domain.entities.Catalog;
import com.hcl.cf.webstore.domain.entities.Category;
import com.hcl.cf.webstore.domain.entities.Product;
import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class CatalogDAO implements ICatalogDAO {

	/*
	 * @param catalog @return
	 */
	public boolean addCatalog(ICatalog catalog) {

		if (catalog == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.save(catalog);
session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}

	/*
	 * @param catalog @return
	 */
	public boolean addCategory(ICatalog catalog, ICategory category) {

		if (catalog == null || category == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.update(catalog);
			((Catalog) catalog).addCategory((Category) category);
			session.save(category);
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
	public ICatalog getCatalog(long id) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		ICatalog catalog = null;
		try {
			session.beginTransaction();
			catalog = (ICatalog) session.get(Catalog.class, new Long(id));
			if (catalog == null)
				return null;
                       session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return catalog;
	}

	/*
	 * @return
	 */
	public List<ICatalog> getCatalogs() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		List<ICatalog> list = null;
		try {
			list = session.createQuery("from Catalog").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return list;
	}

	/*
	 * @param catalog @return
	 */
	public Set<ICategory> getCategories(ICatalog catalog) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Set<Category> categories = null;

		try {
			session.beginTransaction();
			session.refresh(catalog);
			Hibernate.initialize(((Catalog) catalog).getCategories());
			categories = ((Catalog) catalog).getCategories();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

		if (categories == null)
			return null;
		return new HashSet<ICategory>(categories);
	}

	/*
	 * @param catalog @return
	 */
	public boolean removeCatalog(ICatalog catalog) {

		if (catalog == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.delete(catalog);
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
	public boolean removeCategory(ICatalog catalog, ICategory category) {

		if (category == null || catalog == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.update(catalog);
			((Catalog) catalog).removeCategory((Category) category);
			session.delete(category);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}

	/*
	 * @param catalog @return
	 */
	public boolean updateCatalog(ICatalog catalog) {

		if (catalog == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.update(catalog);
			session.getTransaction().commit();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}
}
