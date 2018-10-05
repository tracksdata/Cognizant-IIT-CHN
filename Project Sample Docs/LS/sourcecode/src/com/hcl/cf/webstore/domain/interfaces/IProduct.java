package com.hcl.cf.webstore.domain.interfaces;

public interface IProduct {

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
	 * @return the images
	 */
	IImages getIImages();

	/**
	 * @return the cost
	 */
	Double getCost();

	/**
	 * @param cost
	 *            the cost to set
	 */
	void setCost(Double cost);

	/**
	 * @return the units
	 */
	Long getUnits();

	/**
	 * @param units
	 *            the units to set
	 */
	void setUnits(Long units);
}
