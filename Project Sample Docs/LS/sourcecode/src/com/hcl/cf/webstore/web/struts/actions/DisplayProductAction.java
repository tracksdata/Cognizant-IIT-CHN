package com.hcl.cf.webstore.web.struts.actions;

import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;

public class DisplayProductAction {

	private long id;

	private IProduct product;

	private Integer itemCount;

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
	 * @return the product
	 */
	public IProduct getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(IProduct product) {
		this.product = product;
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
	 * @return the itemCount
	 */
	public Integer getItemCount() {
		return itemCount;
	}

	/**
	 * @param itemCount
	 *            the itemCount to set
	 */
	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public String execute() {

		product = webStore.getProduct(id);
		itemCount = webStore.getItemsCount(product);
		return (product == null) ? "error" : "success";
	}
}
