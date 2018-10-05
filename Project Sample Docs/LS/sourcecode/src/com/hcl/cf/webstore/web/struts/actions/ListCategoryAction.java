package com.hcl.cf.webstore.web.struts.actions;

import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;

public class ListCategoryAction {

	private IWebStoreFacade webStore = new WebStorePOJO();

	private Set<ICategory> categories;

	private long id;

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
	 * @return the categories
	 */
	public Set<ICategory> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Set<ICategory> categories) {
		this.categories = categories;
	}

	public String execute() {

		ICatalog catalog = webStore.getCatalog(id);
		if (catalog == null)
			return "error";

		categories = webStore.getCategories(catalog);
		if(categories==null)
			return "categoryerror";
		return "success";
	}
}
