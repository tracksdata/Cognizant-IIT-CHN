package com.hcl.cf.webstore.test.junit;

import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;

import junit.framework.TestCase;

public class TestWebStorePOJO_Select extends TestCase {

	private IWebStoreFacade store;
	private ICatalog catalog;
	private ICategory category;
	private IProduct product;
	private String s;

	public TestWebStorePOJO_Select(String arg0) {
		super(arg0);
	}

	protected void setUp() throws Exception {
		store = new WebStorePOJO();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testGetCatalogs() {

		assertNotNull(store.getCatalogs());
	}

	public final void testGetCategories() {

		assertNotNull(store.getCategories(store.getCatalog(1)));
		assertNotNull(store.getCategories(store.getCatalog(2)));
	}

	public final void testGetItems() {

		assertNotNull(store.getItems(store.getProduct(2)));
	}

	public final void testGetOrders() {

		assertNotNull(store.getOrders("sushanth"));
	}

	public final void testGetProducts() {

		assertNotNull(store.getProducts(store.getCategory(8)));
	}

	public final void testGetSubCategories() {

		assertNotNull(store.getSubCategories(store.getCategory(5)));
	}

	public final void testGetUserAccountByUserName() {

		assertNotNull(store.getUserAccount("sushanth"));
	}

	public final void testGetUserAccountByUserNameAndPassword() {

		assertNotNull(store.getUserAccount("sushanth", "sush"));
	}

	public final void testHasDisplayableItem() {

		assertTrue(store.hasDisplayableItem(store.getProduct(2)));
	}

	public final void testHasProducts() {

		assertTrue(store.hasProducts(store.getCategory(4)));
	}

	public final void testHasSubCategories() {

		assertTrue(store.hasSubCategories(store.getCategory(5)));
	}

	public final void testGetItemsCount(){
		assertEquals(new Integer(2), store.getItemsCount(store.getProduct(2)));
	}

	public final void testGetItemsCountWithUnExpectedProductObject(){
		assertEquals(new Integer(0), store.getItemsCount(store.getProduct(0)));
	}

	public final void testGetItemsCountWithProductObjectEqualsToNull(){
		assertEquals(new Integer(0), store.getItemsCount(product));
	}

	public final void testHasDisplayableItemProductIsNull() {

		assertFalse(store.hasDisplayableItem(product));
	}

	public final void testHasDisplayableItemUnExpectedProduct() {

		assertFalse(store.hasDisplayableItem(store.getProduct(15)));
	}

	public final void testHasProductsWithCategoryObjectEqualsToNull() {

		assertFalse(store.hasProducts(category));
	}

	public final void testHasProductsWithUnExpectedCategoryObject() {

		assertFalse(store.hasProducts(store.getCategory(0)));
	}

	public final void testHasSubCategoriesWithCategoryObjectEqualsToNull() {

		assertFalse(store.hasSubCategories(category));
	}

	public final void testHasSubCategoriesWithUnExpectedCategoryObject() {

		assertFalse(store.hasSubCategories(store.getCategory(0)));
	}

	public final void testGetSubCategoriesWithCategoryObjectEqualsToNull() {

		assertNull(store.getSubCategories(category));
	}

	public final void testGetSubCategoriesWithUnExpectedCategoryObject() {

		assertNull(store.getSubCategories(store.getCategory(0)));
	}

	public final void testGetProductsWithCategoryObjectEqualsToNull() {

		assertNull(store.getProducts(category));
	}

	public final void testGetProductsWithUnExpectedCategoryObject() {

		assertNull(store.getSubCategories(store.getCategory(0)));
	}

	public final void testGetOrdersWithUserNameEqualsToNull() {

		assertNull(store.getOrders(s));
	}

	public final void testGetOrdersWithIncorrectUserName() {

		assertNull(store.getOrders("fsfs"));
	}

	public final void testGetItemsWithProductObjectEqualsToNull() {

		assertNull(product);
	}

	public final void testGetItemsWithUnExpectedProductObject() {

		assertNull(store.getItems(store.getProduct(0)));
	}

	public final void testGetCategoriesWithCatalogObjectEqualsToNull() {

		assertNull(store.getCategories(catalog));
	}

	public final void testGetCategoriesWithUnExpectedCatalogObject() {

		assertNull(store.getCategories(store.getCatalog(0)));
	}

	public final void testGetUserAccountByIDWithIDEqualsToMaximumBoundaryValueWithInCorrectValue() {

		assertNull(store.getUserAccount(9223372036854775807l));
	}

	public final void testGetUserAccountByIDWithIDEqualsToMinimumBoundaryValueWithCorrectValue() {

		assertNotNull(store.getUserAccount(1));
	}

	public final void testGetUserAccountByIDWithIDEqualsToNegativeValue() {

		assertNull(store.getUserAccount(-1));
	}

	public final void testGetUserAccountByIDWithIDEqualsToZero() {

		assertNull(store.getUserAccount(0));
	}

	public final void testGetUserAccountByIDWithCorrectID() {

		assertNotNull(store.getUserAccount(3));
	}

	public final void testGetUserAccountByIDWithInCorrectID() {

		assertNull(store.getUserAccount(13));
	}

	public final void testGetUserAccountByUserNameUserNameIsNull() {

		assertNull(store.getUserAccount(s));
	}

	public final void testGetUserAccountByUserNameUserNameIsIncorrect() {

		assertNull(store.getUserAccount(""));
	}

	public final void testGetUserAccountByUserNameAndPasswordPasswordIsNull() {

		assertNull(store.getUserAccount("sushanth", s));
	}

	public final void testGetUserAccountByUserNameAndPasswordPasswordIsInCorrect() {

		assertNull(store.getUserAccount("sushanth", "sus"));
	}

	public final void testGetUserAccountByUserNameAndPasswordUserNameIsNull() {

		assertNull(store.getUserAccount(s, "sush"));
	}

	public final void testGetUserAccountByUserNameAndPasswordUserNameIsInCorrect() {

		assertNull(store.getUserAccount("sushant", "sush"));
	}

	public final void testGetCatalogWithIDEqualsToMaximumBoundaryValueWithInCorrectValue() {

		assertNull(store.getCatalog(9223372036854775807l));
	}

	public final void testGetCatalogWithIDEqualsToMinimumBoundaryValueWithCorrectValue() {

		assertNotNull(store.getCatalog(1));
	}

	public final void testGetCatalogWithIDEqualsToNegativeValue() {

		assertNull(store.getCatalog(-1));
	}

	public final void testGetCatalogIDEqualsToZero() {

		assertNull(store.getCatalog(0));
	}

	public final void testGetCatalogWithCorrectID() {

		assertNotNull(store.getCatalog(2));
	}

	public final void testGetCatalogWithInCorrectID() {

		assertNull(store.getCatalog(12));
	}

	public final void testGetCategoryWithIDEqualsToMaximumBoundaryValueWithInCorrectValue() {

		assertNull(store.getCategory(9223372036854775807l));
	}

	public final void testGetCategoryWithIDEqualsToMinimumBoundaryValueWithCorrectValue() {

		assertNotNull(store.getCategory(1));
	}

	public final void testGetCategoryWithIDEqualsToNegativeValue() {

		assertNull(store.getCategory(-4));
	}

	public final void testGetCategoryWithIDEqualsToZero() {

		assertNull(store.getCategory(0));
	}

	public final void testGetCategoryWithCorrectID() {

		assertNotNull(store.getCategory(7));
	}

	public final void testGetCategoryWithInCorrectID() {

		assertNull(store.getCategory(57));
	}

	public final void testGetProductWithIDEqualsToMaximumBoundaryValueWithInCorrectValue() {

		assertNull(store.getProduct(9223372036854775807l));
	}

	public final void testGetProductWithIDEqualsToMinimumBoundaryValueWithCorrectValue() {

		assertNotNull(store.getProduct(1));
	}

	public final void testGetProductWithIDEqualsToNegativeValue() {

		assertNull(store.getProduct(-5));
	}

	public final void testGetProductWithIDEqualsToZero() {

		assertNull(store.getProduct(0));
	}

	public final void testGetProductWithCorrectID() {

		assertNotNull(store.getProduct(8));
	}

	public final void testGetProductWithIncorrectID() {

		assertNull(store.getProduct(80));
	}

	public final void testGetItemWithIDEqualsToMaximumBoundaryValueWithInCorrectValue() {

		assertNull(store.getItem(9223372036854775807l));
	}

	public final void testGetItemWithIDEqualsToMinimumBoundaryValueWithCorrectValue() {

		assertNotNull(store.getItem(1));
	}

	public final void testGetItemWithIDEqualsToNegativeValue() {

		assertNull(store.getItem(-2));
	}

	public final void testGetItemWithIDEqualsToZero() {

		assertNull(store.getItem(0));
	}

	public final void testGetItemWithCorrectID() {

		assertNotNull(store.getItem(1));
	}

	public final void testGetItemWithInCorrectID() {

		assertNull(store.getItem(10));
	}

	public final void testGetOrderWithIDEqualsToMaximumBoundaryValueWithInCorrectValue() {

		assertNull(store.getOrder(9223372036854775807l));
	}

	public final void testGetOrderWithIDEqualsToMinimumBoundaryValueWithCorrectValue() {

		assertNotNull(store.getOrder(1));
	}

	public final void testGetOrderWithIDEqualsToNegativeValue() {

		assertNull(store.getOrder(-5));
	}

	public final void testGetOrderIDEqualsToZero() {

		assertNull(store.getOrder(0));
	}

	public final void testGetOrderWithCorrectID() {

		assertNotNull(store.getOrder(3));
	}

	public final void testGetOrderWithInCorrectID() {

		assertNull(store.getOrder(5));
	}
}