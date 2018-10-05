package com.hcl.cf.webstore.web.struts.actions;

import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;

public class ListSubCategoryOrProductAction {

	private IWebStoreFacade webStore = new WebStorePOJO();

	private Set<ICategory> categories;

	private Set<IProduct> products;

	private long id;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the webStore
	 */
	public IWebStoreFacade getWebStore() {
		return webStore;
	}

	/**
	 * @param webStore
	 *            the webStore to set
	 */
	public void setWebStore(IWebStoreFacade webStore) {
		this.webStore = webStore;
	}

	/**
	 * @return the categories
	 */
	public Set<ICategory> getCategories() {
		return categories;
	}

	/**
	 * @param categories
	 *            the categories to set
	 */
	public void setCategories(Set<ICategory> categories) {
		this.categories = categories;
	}

	/**
	 * @return the products
	 */
	public Set<IProduct> getProducts() {
		return products;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public void setProducts(Set<IProduct> products) {
		this.products = products;
	}

	public String execute() {

		ICategory category = webStore.getCategory(id);
		if (category == null)
			return "categoryerror";

		if (webStore.hasSubCategories(category)) {
			categories = webStore.getSubCategories(category);
			return (categories == null) ? "subcategoryerror" : "category";
		} 
		else if (webStore.hasProducts(category)) {
			products = webStore.getProducts(category);
			return (products == null) ? "producterror" : "product";
		}
		else {
			return "error";
		}
	}
}
