package com.hcl.cf.webstore.domain.entities;

import com.hcl.cf.webstore.domain.interfaces.IImages;
import com.hcl.cf.webstore.domain.interfaces.IItem;

public class Item implements IItem {

	private long id;

	private String name;

	private String description;

	private Double price;

	private Images images = new Images();

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the images
	 */
	public IImages getIImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(Images images) {
		this.images = images;
	}

	/**
	 * @return the images
	 */
	public Images getImages() {
		return images;
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
	//		Item objP = (Item) obj;
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
