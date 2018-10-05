package com.hcl.cf.webstore.web.struts.actions;

import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;

public class DisplayItemAction {

	private long id;

	private IItem item;

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
	 * @return the item
	 */
	public IItem getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(IItem item) {
		this.item = item;
	}

	public String execute() {

		item = webStore.getItem(id);
		return (item == null) ? "error" : "success";
	}
}
