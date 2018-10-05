package com.hcl.cf.webstore.domain.entities;

import java.util.HashSet;
import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.IImages;

public class Category implements ICategory {

	private long id;

	private String name;

	private String description;

	private Set<Product> products = new HashSet<Product>();

	private Images images = new Images();

	private Category subCategory;

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
	 * @return the products
	 */
	public Set<Product> getProducts() {
		return products;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
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
	 * @return the subCategory
	 */
	public Category getSubCategory() {
		return subCategory;
	}

	/**
	 * @param subCategory
	 *            the subCategory to set
	 */
	public void setSubCategory(Category subCategory) {
		this.subCategory = subCategory;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public void removeProduct(Product product) {
		this.products.remove(product);
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
}
