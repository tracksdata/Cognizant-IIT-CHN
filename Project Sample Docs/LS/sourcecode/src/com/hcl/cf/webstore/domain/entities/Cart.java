package com.hcl.cf.webstore.domain.entities;

import java.util.ArrayList;
import java.util.List;

import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IProduct;

public class Cart implements ICart {

	private List<CartProduct> products = new ArrayList<CartProduct>();

	private List<Item> items = new ArrayList<Item>();

	private Double itemTotal = 0d;

	/**
	 * @return the products
	 */
	public List<CartProduct> getProducts() {
		return products;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public void setProducts(List<CartProduct> products) {
		this.products = products;
	}

	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public boolean addProduct(IProduct product, long quantity) {

		if (quantity < 1)
			return false;

		if (product==null)
			return false;

		CartProduct cartProduct = getCartProduct(product);

		if (cartProduct != null) {
			cartProduct.setQuantity(quantity + cartProduct.getQuantity());
			return true;
		}

		this.products.add(new CartProduct((Product) product, quantity));
		return true;
	}

	public boolean setProductQuantity(IProduct product, long quantity) {

		CartProduct cartProduct = getCartProduct(product);

		if (cartProduct == null)
			return false;

		if (quantity < 1)
			return false;

		cartProduct.setQuantity(quantity);
		return true;
	}

	public boolean removeProduct(IProduct product) {

		CartProduct cartProduct = getCartProduct(product);

		if (cartProduct == null)
			return false;

		this.products.remove(cartProduct);
		return false;
	}

	private CartProduct getCartProduct(IProduct product) {

		for (CartProduct cartProduct : products) {
			if (cartProduct.getProduct().getId() == product.getId())
				return cartProduct;
		}

		return null;
	}

	public boolean addItem(IItem item) {


		if (item==null)
			return false;

		if (getCartItem(item) != null)
			return true;

		this.items.add((Item) item);
		return true;
	}

	public boolean removeItem(IItem item) {

		IItem item1 = getCartItem(item);

		if (item1 == null)
			return false;

		this.items.remove(item1);
		return false;
	}

	private IItem getCartItem(IItem item) {

		for (IItem theItem : items) {
			if (theItem.getId() == item.getId())
				return theItem;
		}
		return null;
	}

	/**
	 * @return the itemCount
	 */
	public Integer getItemCount() {
		return items.size() + products.size();
	}

	/**
	 * @return the itemTotal
	 */
	public Double getItemTotal() {

		for (IItem item : items) {
			itemTotal += item.getPrice();
		}

		for (CartProduct cartProduct : products)
		{
			itemTotal = cartProduct.getQuantity()* cartProduct.getProduct().getCost();
		}

		return itemTotal;
	}

	public List<Long> getProductIDs() {

		List<Long> list = new ArrayList<Long>();

		for (CartProduct cartProduct : products) {
			list.add(cartProduct.getProduct().getId());
		}
		return list;
	}

	public boolean setProductQuantity(Long productID, long quantity) {

		for (CartProduct cartProduct : products) {
			if (cartProduct.getProduct().getId() == productID)
			{
				cartProduct.setQuantity(quantity);
				return true;
			}
		}
		return false;
	}
}