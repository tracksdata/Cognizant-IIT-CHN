package com.hcl.cf.webstore.dao.implementation;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import com.hcl.cf.webstore.dao.interfaces.IUserAccountDAO;
import com.hcl.cf.webstore.domain.entities.UserAccount;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class UserAccountDAO implements IUserAccountDAO {

	/*
	 * @param account @return
	 */
	public boolean addUserAccount(IUserAccount account) {

		if (account == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.save(account);
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
	public IUserAccount getUserAccount(long id) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		IUserAccount account = null;

		try {
			session.beginTransaction();
			account = (IUserAccount) session.get(UserAccount.class, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return account;
	}

	/*
	 * @param userName @param pwd @return
	 */
	public IUserAccount getUserAccount(String userName, String pwd) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		IUserAccount account = null;

		try {
			session.beginTransaction();
			Query query = session.createQuery("from UserAccount as account "
					+ "where account.userName = ? and account.password = ?");
			query.setString(0, userName);
			query.setString(1, pwd);

			account = (IUserAccount) query.uniqueResult();
			Hibernate.initialize(account.getIAddress());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return account;
	}

	/*
	 * @param userName @return
	 */
	public IUserAccount getUserAccount(String userName) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		IUserAccount account = null;

		try {
			session.beginTransaction();

			Query query = session.createQuery("from UserAccount as account "
					+ "where account.userName = ?");
			query.setString(0, userName);

			account = (IUserAccount) query.uniqueResult();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return account;
	}

	/*
	 * @param account @return
	 */
	public boolean removeUserAccount(IUserAccount account) {

		if (account == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.delete(account);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}

	/*
	 * @param account @return
	 */
	public boolean updateUserAccount(IUserAccount account) {

		if (account == null)
			return false;

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			session.update(account);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return true;
	}
}
