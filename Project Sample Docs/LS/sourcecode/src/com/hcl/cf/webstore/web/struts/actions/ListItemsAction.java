package com.hcl.cf.webstore.web.struts.actions;

import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;

public class ListItemsAction {

	private long id;

	private Set<IItem> items;

	private IWebStoreFacade webStore = new WebStorePOJO();

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
	 * @return the items
	 */
	public Set<IItem> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(Set<IItem> items) {
		this.items = items;
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

	public String execute() {

		IProduct product = webStore.getProduct(id);

		if (product == null)
			return "producterror";

		items = webStore.getItems(product);
		return (items == null) ? "itemerror" : "success";
	}
}
