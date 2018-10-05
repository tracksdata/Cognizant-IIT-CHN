package com.hcl.cf.webstore.domain.entities;

import com.hcl.cf.webstore.domain.interfaces.IImage;

public class Image implements IImage{

	private long id;

	private String name;

	private String path;

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
	private void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	//	@Override
	//	public boolean equals(Object obj) {
	//
	//		if (this == obj)
	//			return true;
	//
	//		if (this.getClass() != obj.getClass())
	//			return false;
	//
	//		Image objP = (Image) obj;
	//
	//		return (objP.id == this.id) ? true : false;
	//	}
	//
	//	@Override
	//	public int hashCode() {
	//
	//		int hash = 7;
	//		hash = hash * 31 + new Integer(Long.toString(id));
	//		return hash;
	//	}
}
