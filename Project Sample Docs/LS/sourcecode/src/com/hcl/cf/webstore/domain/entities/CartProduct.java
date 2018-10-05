package com.hcl.cf.webstore.domain.entities;

public class CartProduct {

	private Product product;

	private long quantity;

	CartProduct() {
	}

	public CartProduct(Product product, long quantity) {

		this.product = (Product) product;
		this.quantity = quantity;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = (Product) product;
	}

	/**
	 * @return the quantity
	 */
	public long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
}
