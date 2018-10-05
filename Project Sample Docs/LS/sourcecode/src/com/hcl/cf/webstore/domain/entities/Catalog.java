package com.hcl.cf.webstore.domain.entities;

import java.util.HashSet;
import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.IImages;

public class Catalog implements ICatalog {

	private long id;

	private String name;

	private String description;

	private Set<Category> categories = new HashSet<Category>();

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
	 * @return the categories
	 */
	public Set<Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories
	 *            the categories to set
	 */
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
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

	public void addCategory(Category category) {
		this.categories.add(category);
	}

	public void removeCategory(Category category) {
		this.categories.remove(category);
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

	// @Override
	// public boolean equals(Object obj) {
	//
	// if (this == obj)
	// return true;
	//
	// if (this.getClass() != obj.getClass())
	// return false;
	//
	// Catalog objP = (Catalog) obj;
	//
	// return (objP.id == this.id) ? true : false;
	// }
	//
	// @Override
	// public int hashCode() {
	//
	// int hash = 7;
	// hash = hash * 31 + new Integer(Long.toString(id));
	// return hash;
	// }

}
