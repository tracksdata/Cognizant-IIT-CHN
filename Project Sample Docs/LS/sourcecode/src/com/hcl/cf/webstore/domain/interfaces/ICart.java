package com.hcl.cf.webstore.domain.interfaces;

import java.util.List;

public interface ICart {

	boolean addProduct(IProduct product, long quantity);

	boolean setProductQuantity(IProduct product, long quantity);

	boolean removeProduct(IProduct product);

	boolean addItem(IItem item);

	boolean removeItem(IItem item);

	/**
	 * @return the itemCount
	 */
	Integer getItemCount();

	/**
	 * @return the itemTotal
	 */
	Double getItemTotal();

	/**
	 * @return the ProductIDs
	 */
	List<Long> getProductIDs();

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	boolean setProductQuantity(Long productID, long quantity);
}
