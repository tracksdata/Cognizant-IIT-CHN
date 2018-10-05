package com.hcl.cf.webstore.domain.interfaces;

public interface IImage {

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
	 * @return the path
	 */
	String getPath();

	/**
	 * @param path
	 *            the path to set
	 */
	void setPath(String path);
}
