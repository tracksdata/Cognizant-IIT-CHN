package com.hcl.cf.webstore.test.junit;

import junit.framework.TestCase;

import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;



public class TestWebStorePOJO_Remove extends TestCase {

	private IWebStoreFacade store;
	private ICatalog catalog;
	private ICategory category;
	private IProduct product;
	private IItem item;
	private IUserAccount userAccount;
	private IOrder order;

	public TestWebStorePOJO_Remove(String arg0) {
		super(arg0);
	}

	protected void setUp() throws Exception {
		store = new WebStorePOJO();
	}

	protected void tearDown() throws Exception {
		store = null;
	}

	public final void testRemoveCatalog() {
		assertEquals(true, store.removeCatalog(store.getCatalog(6)));
	}

	public final void testRemoveProduct() {
		assertEquals(true, store.removeProduct(store.getCategory(1), store.getProduct(22)));
	}

	public final void testRemoveCategory() {
		assertEquals(true, store.removeCategory(store.getCatalog(4), store.getCategory(22)));
	}

	public final void testRemoveItem() {
		assertEquals(true, store.removeItem(store.getProduct(2), store.getItem(1)));
	}

	public final void testRemoveOrder() {

		assertTrue(store.removeOrder(store.getOrder(3)));
	}

	public final void testRemoveUserAccount() {

		assertTrue(store.removeUserAccount(store.getUserAccount(6)));
	}

	public final void testRemoveProductFromCart() {

		ICart cart = new Cart();
		IProduct prod = store.getProduct(1);
		cart.addProduct(prod, 1);
		assertTrue(cart.removeProduct(prod));
	}

	public final void testRemoveItemFromCart() {

		ICart cart = new Cart();
		IItem item = store.getItem(2);
		cart.addItem(item);
		assertTrue(cart.removeItem(item));
	}

	public final void testRemoveItemItemIsNull() {
		assertEquals(false, store.removeItem(store.getProduct(4), item));
	}

	public final void testRemoveItemProductIsNull() {
		assertEquals(false, store.removeItem(product, store.getItem(2)));
	}

	public final void testRemoveItemUnExpectedProduct() {
		assertEquals(false, store.removeItem(store.getProduct(0), store.getItem(2)));
	}

	public final void testRemoveItemUnExpectedItem() {
		assertEquals(false, store.removeItem(store.getProduct(4), store.getItem(-1)));
	}

	public final void testRemoveProductProductIsNull() {
		assertEquals(false, store.removeProduct(store.getCategory(4), product));
	}

	public final void testRemoveProductCategoryIsNull() {
		assertEquals(false, store.removeProduct(category, store.getProduct(3)));
	}

	public final void testRemoveProductUnExpectedCategory() {
		assertEquals(false, store.removeProduct(store.getCategory(-1), store.getProduct(3)));
	}

	public final void testRemoveProductUnExpectedProduct() {
		assertEquals(false, store.removeProduct(store.getCategory(4), store.getProduct(0-2)));
	}	

	public final void testRemoveCategoryCategoryIsNull() {
		assertEquals(false, store.removeCategory(store.getCatalog(2), category));
	}

	public final void testRemoveCategoryCatalogIsNull() {
		assertEquals(false, store.removeCategory(catalog, store.getCategory(2)));
	}

	public final void testRemoveCategoryUnExpectedCatalog() {
		assertEquals(false, store.removeCategory(store.getCatalog(0), store.getCategory(4)));
	}

	public final void testRemoveCategoryUnExpectedCategory() {
		assertEquals(false, store.removeCategory(store.getCatalog(2), store.getCategory(0)));
	}

	public final void testRemoveCatalogCatalogIsNull() {
		assertEquals(false, store.removeCatalog(catalog));
	}

	public final void testRemoveCatalogUnExpectedCatalog() {
		assertEquals(false, store.removeCatalog(store.getCatalog(0)));
	}

	public final void testRemoveOrderOrderIsNull() {
		assertEquals(false, store.removeOrder(order));
	}

	public final void testRemoveOrderUnExpectedOrder() {
		assertEquals(false, store.removeOrder(store.getOrder(0)));
	}

	public final void testRemoveUserAccountUserAccountIsNull() {
		assertEquals(false, store.removeUserAccount(userAccount));
	}

	public final void testRemoveUserAccountUnExpectedUserAccount() {
		assertEquals(false, store.removeUserAccount(store.getUserAccount(0)));
	}

	public final void testRemoveItemFromCartItemObjectIsNull() {

		ICart cart = new Cart();
		assertFalse(cart.addItem(item));
		assertFalse(cart.removeItem(item));
	}

	public final void testRemoveProductFromCartProductObjectIsNull() {

		ICart cart = new Cart();
		assertFalse(cart.addProduct(product, 1));
		assertFalse(cart.removeProduct(product));
	}
}