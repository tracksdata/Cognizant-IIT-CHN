package com.hcl.cf.webstore.domain.interfaces;

public interface IItem {

	/**
	 * @return the description
	 */
	String getDescription();

	/**
	 * @param description
	 *            the description to set
	 */
	void setDescription(String description);

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @return the name
	 */
	String getName();

	/**
	 * @param name
	 *            the name to set
	 */
	void setName(String name);

	/**
	 * @return the price
	 */
	Double getPrice();

	/**
	 * @param price
	 *            the price to set
	 */
	void setPrice(Double price);

	/**
	 * @return the images
	 */
	IImages getIImages();
}
