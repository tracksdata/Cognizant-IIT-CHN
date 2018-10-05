package com.hcl.cf.webstore.test.nonJUnit;

import java.util.List;

import org.hibernate.Session;

import com.hcl.cf.webstore.domain.entities.Category;
import com.hcl.cf.webstore.domain.entities.Product;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class TestCategory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestCategory.createAndStoreCategories();
		//TestCategory.listCategories();
	}

	public static void createAndStoreCategories() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Category cat1 = TestCategory.createCategory("name1", "description1");
		Product prd1 = TestProduct.createProduct("name1", "desc1");
		//cat1.addProduct(prd1);

		Category cat2 = TestCategory.createCategory("name2", "description2");
		Product prd2 = TestProduct.createProduct("name2", "desc2");
		//cat2.addProduct(prd2);

		Category cat3 = TestCategory.createCategory("name3", "description3");
		Product prd3 = TestProduct.createProduct("name3", "desc3");
		//cat3.addProduct(prd3);

		Category cat4 = TestCategory.createCategory("name4", "description4");
		Product prd4 = TestProduct.createProduct("name4", "desc4");
		//cat4.addProduct(prd4);

		Product prd5 = TestProduct.createProduct("name4", "desc4");
		//cat1.addProduct(prd5);

		//		cat2.setSupCategory(cat1);
		//		cat3.setSupCategory(cat4);
		//		cat4.setSupCategory(cat1);

		session.save(cat1);
		session.save(cat2);
		session.save(cat3);
		session.save(cat4);

		session.save(prd1);
		session.save(prd2);
		session.save(prd3);
		session.save(prd4);
		session.save(prd5);

		session.getTransaction().commit();
	}

	public static Category createCategory( String name, String description) {

		Category cat = new Category ();
		cat.setDescription(description);
		cat.setName(name);
		return cat;
	}

	public static void printCategory(Category cat) {

		System.out.println("Category..."+cat.getId());
		System.out.println(cat.getDescription());
		System.out.println(cat.getName());

		//		if (cat.getSupCategory() != null)
		//			System.out.println(cat.getSupCategory());

		//		Set<Product> prdts = cat.getProducts();
		//		Iterator<Product> itr = prdts.iterator();
		//		
		//		while (itr.hasNext())
		//			TestProduct.printProduct(itr.next());
	}

	public static void listCategories() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List result = session.createQuery("from Category").list();

		for (int i = 0; i < result.size(); i++) {
			Category cat = (Category) result.get(i);
			TestCategory.printCategory(cat);
		}
	}
}
