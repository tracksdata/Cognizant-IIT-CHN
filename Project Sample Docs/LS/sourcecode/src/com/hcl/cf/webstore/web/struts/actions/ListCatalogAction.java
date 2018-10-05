package com.hcl.cf.webstore.web.struts.actions;

import java.util.List;

import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;

public class ListCatalogAction {

	private IWebStoreFacade webStore = new WebStorePOJO();

	private List<ICatalog> catalogs;

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
	 * @return the catalogs
	 */
	public List<ICatalog> getCatalogs() {
		return catalogs;
	}

	/**
	 * @param catalogs the catalogs to set
	 */
	public void setCatalogs(List<ICatalog> catalogs) {
		this.catalogs = catalogs;
	}

	public String execute() {

		catalogs = webStore.getCatalogs();

		if (catalogs == null)
			return "error";

		return "success";
	}
}
