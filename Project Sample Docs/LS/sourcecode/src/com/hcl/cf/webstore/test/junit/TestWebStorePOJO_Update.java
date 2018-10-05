package com.hcl.cf.webstore.test.junit;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.entities.CartProduct;
import com.hcl.cf.webstore.domain.entities.Product;
import com.hcl.cf.webstore.domain.interfaces.IAddress;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;
import junit.framework.TestCase;

public class TestWebStorePOJO_Update extends TestCase {

	private IWebStoreFacade store;

	public TestWebStorePOJO_Update(String arg0) {
		super(arg0);
	}

	protected void setUp() throws Exception {
		store = new WebStorePOJO();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testUpdateUserAccount() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gfgfgf");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		assertTrue(store.updateUserAccount(ua1));

	}

	public final void testUpdateUserAccountWithPhoneNumberequalsToMinimumBoundaryValue() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gfgfgf");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1);

		ua1.setIAddress(add1);
		assertTrue(store.updateUserAccount(ua1));

	}

	public final void testUpdateUserAccountWithPhoneNumberequalsToMaximumBoundaryValue() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gfgfgf");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(9223372036854775807l);

		ua1.setIAddress(add1);
		assertTrue(store.updateUserAccount(ua1));
	}

	public final void testUpdateUserAccountWithPhoneNumberequalsToZero() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gfgfgf");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(0);

		ua1.setIAddress(add1);
		assertTrue(store.updateUserAccount(ua1));
	}

	public final void testUpdateUserAccountWithZipEqualsToMinimumBoundaryValue() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gfgfgf");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("agdgdd1");
		add1.setCity("cigdg1");
		add1.setCountry("cogdgdun1");
		add1.setState("stgdgd1");
		add1.setType("tygdgdg1");
		add1.setZip(1);
		add1.setPhoneNumber(1234555567890l);

		ua1.setIAddress(add1);
		assertTrue(store.updateUserAccount(ua1));
	}

	public final void testUpdateUserAccountWithZipEqualsToMaximumBoundaryValue() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gfgfgf");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(9223372036854775807l);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		assertTrue(store.updateUserAccount(ua1));
	}

	public final void testUpdateUserAccountWithZipEqualsToZero() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gfgfgf");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(0);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		assertTrue(store.updateUserAccount(ua1));
	}

	public final void testUpdateCatalog() {

		ICatalog ctlg1 = store.getCatalog(1);
		ctlg1.setName("name1");
		ctlg1.setDescription("description1");
		assertTrue(store.updateCatalog(ctlg1));
	}

	public final void testUpdateCategory() {

		ICategory ctgry1 = store.getCategory(1);
		ctgry1.setName("name1");
		ctgry1.setDescription("description1");

		ICategory ctgry2 = store.getCategory(2);
		ctgry2.setName("name2");
		ctgry2.setDescription("description2");

		assertTrue(store.updateCategory(ctgry1));
		assertTrue(store.updateCategory(ctgry2));
	}

	public final void testUpdateProduct() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1000.00);
		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateProductWithUnitsEqualsToZero() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);
		prd1.setUnits(new Long(0));
		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateProductWithUnitsEqualsToMaximumBoundaryValue() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);
		prd1.setUnits(new Long(9223372036854775807l));
		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateProductWithUnitsEqualsToMinimumBoundaryValue() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);
		prd1.setUnits(new Long(1));
		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateProductWithCostEqualsToZero() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(0.00);
		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateProductWithCostEqualsToMaximumBoundaryValue() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1.79769313486231570e+308d);
		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateroductWithCostEqualsToMinimumBoundaryValue() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1.00);
		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateProductWithCostEqualsToNull() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("ghd");
		prd1.setUnits(new Long(5));
		prd1.setCost(null);

		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateProductWithUnitsEqualsToNull() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("ghsdk");
		prd1.setUnits(null);
		prd1.setCost(1000.00);

		assertTrue(store.updateProduct(prd1));
	}

	public final void testUpdateItem() {

		IItem i1 = store.getItem(2);
		assertNotNull(i1);
		i1.setName("name1");
		i1.setDescription("description1");
		i1.setPrice(111.00);
		assertTrue(store.updateItem(i1));
	}

	public final void testUpdateItemtWithPriceEqualsMaximumBoundaryValue() {

		IItem item1 = store.getItem(2);
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(1.79769313486231570e+308d);
		assertTrue(store.updateItem(item1));
	}

	public final void testUpdateItemtWithPriceEqualsToMinimumBoundaryValue() {

		IItem item1 = store.getItem(2);
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(1.00);
		assertTrue(store.updateItem(item1));
	}

	public final void testUpdateItemtWithPriceEqualsToZero() {

		IItem item1 = store.getItem(2);
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(0.00);
		assertTrue(store.updateItem(item1));
	}

	public final void testGetProductIDs() {

		List<CartProduct> cpp = new  ArrayList<CartProduct>();
		CartProduct c = new CartProduct((Product)store.getProduct(1) , 1);
		cpp.add(c);
		ICart cart = new Cart();
		assertNotNull(cart.getProductIDs());
	}

	public final void testSetProductQuantity() {

		List<CartProduct> cpp = new  ArrayList<CartProduct>();
		CartProduct c = new CartProduct((Product)store.getProduct(1) , 1);
		cpp.add(c);
		ICart cart = new Cart();
		cart.addProduct(store.getProduct(1), 1);
		assertTrue(cart.setProductQuantity(new Long(1), 5));
	}

	public final void testUpdateCatalogWithNameSameAsCurrentName() {

		ICatalog ct1 = store.getCatalog(1);
		ICatalog ct2 = store.getCatalog(2);

		ct1.setName(ct1.getName());
		ct2.setName(ct2.getName());

		assertTrue(store.updateCatalog(ct1));
		assertTrue(store.updateCatalog(ct2));
	}

	public final void testUpdateCatalogWithDescriptionSameAsCurrentDescription() {

		ICatalog ct1 = store.getCatalog(1);
		ICatalog ct2 = store.getCatalog(2);

		ct1.setDescription(ct1.getDescription());
		ct2.setDescription(ct2.getDescription());

		assertTrue(store.updateCatalog(ct1));
		assertTrue(store.updateCatalog(ct2));
	}

	public final void testUpdateCategoryWithNameSameAsCurrentName() {

		ICategory ctg1 = store.getCategory(1);
		ICategory ctg9 = store.getCategory(9);

		ctg1.setName(ctg1.getName());
		ctg9.setName(ctg9.getName());

		assertTrue(store.updateCategory(ctg1));
		assertTrue(store.updateCategory(ctg9));
	}

	public final void testUpdateCategoryWithDescriptionSameAsCurrentDescription() {

		ICategory ctg1 = store.getCategory(1);
		ICategory ctg9 = store.getCategory(9);

		ctg1.setDescription(ctg1.getDescription());
		ctg9.setDescription(ctg9.getDescription());

		assertTrue(store.updateCategory(ctg1));
		assertTrue(store.updateCategory(ctg9));
	}

	public final void testUpdateItemWithDescriptionSameAsCurrentDescription() {

		IItem i1 = store.getItem(1);
		IItem i2 = store.getItem(2);

		i1.setDescription(i1.getDescription());
		i2.setDescription(i2.getDescription());

		assertTrue(store.updateItem(i1));
		assertTrue(store.updateItem(i2));
	}

	public final void testUpdateItemWithNameSameAsCurrentName() {

		IItem i1 = store.getItem(1);
		IItem i2 = store.getItem(2);

		i1.setName(i1.getName());
		i2.setName(i2.getName());

		assertTrue(store.updateItem(i1));
		assertTrue(store.updateItem(i2));
	}

	public final void testUpdateItemWithPriceSameAsCurrentPrice() {

		IItem i1 = store.getItem(1);
		IItem i2 = store.getItem(2);

		i1.setPrice(i1.getPrice());
		i2.setPrice(i2.getPrice());

		assertTrue(store.updateItem(i1));
		assertTrue(store.updateItem(i2));
	}

	public final void testUpdateProductWithNameSameAsCurrentName() {

		IProduct i1 = store.getProduct(1);
		IProduct i2 = store.getProduct(2);

		i1.setName(i1.getName());
		i2.setName(i2.getName());

		assertTrue(store.updateProduct(i1));
		assertTrue(store.updateProduct(i2));
	}

	public final void testUpdateProductWithDescriptionSameAsCurrentDescription() {

		IProduct i1 = store.getProduct(1);
		IProduct i2 = store.getProduct(2);

		i1.setDescription(i1.getDescription());
		i2.setDescription(i2.getDescription());

		assertTrue(store.updateProduct(i1));
		assertTrue(store.updateProduct(i2));
	}

	public final void testUpdateProductWithCostSameAsCurrentCost() {

		IProduct i1 = store.getProduct(1);
		IProduct i2 = store.getProduct(2);

		i1.setCost(i1.getCost());
		i2.setCost(i2.getCost());

		assertTrue(store.updateProduct(i1));
		assertTrue(store.updateProduct(i2));
	}

	public final void testUpdateProductWithUnitsSameAsCurrentUnits() {

		IProduct i1 = store.getProduct(1);
		IProduct i2 = store.getProduct(2);

		i1.setUnits(i1.getUnits());
		i2.setUnits(i2.getUnits());

		assertTrue(store.updateProduct(i1));
		assertTrue(store.updateProduct(i2));
	}

	public final void testUpdateUserAccountWithFirstNameSameAsCurrentFirstName() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.setFirstName(i1.getFirstName());

		store.updateUserAccount(i1);
		assertTrue(store.getUserAccount(1).getFirstName().equals(i1.getFirstName()));
	}

	public final void testUpdateUserAccountWithLastNameSameAsCurrentLastName() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.setLastName(i1.getLastName());

		store.updateUserAccount(i1);
		assertTrue(store.getUserAccount(1).getLastName().equals(i1.getLastName()));
	}

	public final void testUpdateUserAccountWithUserNameSameAsCurrentUserName() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.setUserName(i1.getUserName());

		store.updateUserAccount(i1);
		assertTrue(store.getUserAccount(1).getUserName().equals(i1.getUserName()));
	}

	public final void testUpdateUserAccountWithPasswordSameAsCurrentPassword() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.setPassword(i1.getPassword());

		store.updateUserAccount(i1);
		assertTrue(store.getUserAccount(1).getPassword().equals(i1.getPassword()));
	}

	public final void testUpdateUserAccountWithEmailIDSameAsCurrentEmailID() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.setEmailID(i1.getEmailID());

		store.updateUserAccount(i1);
		assertTrue(store.getUserAccount(1).getEmailID().equals(i1.getEmailID()));
	}

	public final void testUpdateUserAccountWithBirthDateSameAsCurrentBirthDate() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.setBirthDate(i1.getBirthDate());

		store.updateUserAccount(i1);
		assertEquals(0, store.getUserAccount(1).getBirthDate().compareTo(i1.getBirthDate()));
	}

	public final void testUpdateUserAccountWithAddressSameAsCurrentAddress() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.getIAddress().setAddress(i1.getIAddress().getAddress());

		assertTrue(store.updateUserAccount(i1));
	}

	public final void testUpdateUserAccountWithPhoneNoSameAsCurrentPhoneNo() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.getIAddress().setPhoneNumber(i1.getIAddress().getPhoneNumber());

		assertTrue(store.updateUserAccount(i1));
	}

	public final void testUpdateUserAccountWithCitySameAsCurrentCity() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.getIAddress().setCity(i1.getIAddress().getCity());

		assertTrue(store.updateUserAccount(i1));
	}

	public final void testUpdateUserAccountWithStateSameAsCurrentState() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.getIAddress().setState(i1.getIAddress().getState());

		assertTrue(store.updateUserAccount(i1));
	}

	public final void testUpdateUserAccountWithCountrySameAsCurrentCountry() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.getIAddress().setCountry(i1.getIAddress().getCountry());

		assertTrue(store.updateUserAccount(i1));
	}

	public final void testUpdateUserAccountWithZipSameAsCurrentZip() {

		IUserAccount i1 = store.getUserAccount(1);
		i1.getIAddress().setZip(i1.getIAddress().getZip());

		assertTrue(store.updateUserAccount(i1));
	}

	public final void testUpdateCatalogWithCatalogObjectEqualsToNull() {

		ICatalog catalog = null;
		try{
			catalog.setDescription("gshgckj");
			catalog.setName("gshgckj");
			store.updateCatalog(catalog);
		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCatalogWithNameEqualsToNull() {

		ICatalog ctlg1 = store.createCatalog();
		ctlg1.setName(null);
		ctlg1.setDescription("description");

		try{
			store.updateCatalog(ctlg1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCatalogWithDescriptionEqualsToNull() {

		ICatalog ctlg1 = store.createCatalog();
		ctlg1.setName("name");
		ctlg1.setDescription(null);
		try{
			store.updateCatalog(ctlg1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCategoryWithCategoryObjectEqualsToNull() {

		ICategory catr1 = null;
		try{
			catr1.setName("gsgh");
			catr1.setDescription("gcshj");
			store.updateCategory(catr1);
		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCategoryWithNameEqualsToNull() {

		ICategory catr1 = store.getCategory(1);
		catr1.setName(null);
		catr1.setDescription("description");

		try{
			store.updateCategory(catr1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCategoryWithDescriptionEqualsToNull() {

		ICategory catr1 = store.getCategory(1);
		catr1.setName("name");
		catr1.setDescription(null);
		try{
			store.updateCategory(catr1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateProductWithNameEqualsToNull() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName(null);
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1000.00);

		try{
			store.updateProduct(prd1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateProductWithDescriptionEqualsToNull() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription(null);
		prd1.setUnits(new Long(5));
		prd1.setCost(1000.00);

		try{
			store.updateProduct(prd1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateProductWithNegativeNumberOfUnits() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);
		prd1.setUnits(new Long(-10));

		try{
			store.updateProduct(prd1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateProductWithCostEqualsToNegativeValue() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(-10.00);

		try{
			store.updateProduct(prd1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateProductWithProductObjectEqualsToNull() {

		IProduct prd1 = null;
		prd1.setName("hgfhg");
		try{
			store.updateProduct(prd1);
		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testUpdateItemWithNameEqualsToNull() {

		IItem item1 = store.getItem(1);
		item1.setName(null);
		item1.setDescription("description1");
		item1.setPrice(1200.00);

		try{
			store.updateItem(item1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateItemtWithDescriptionEqualsToNull() {

		IItem item1 = store.getItem(1);
		item1.setName("name1");
		item1.setDescription(null);
		item1.setPrice(1200.00);
		try{
			store.updateItem(item1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateItemtWithPriceEqualsToNull() {

		IItem item1 = store.getItem(1);
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(null);
		try{
			store.updateItem(item1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateItemWithItemObjectEqualsToNull() {

		IItem item1 = null;
		item1.setName("name1");
		item1.setDescription("description1");
		try{
			assertFalse(store.updateItem(item1));
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateItemtWithPriceEqualsToNegativeValue() {

		IItem item1 = store.getItem(1);
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(-10000.00);

		try{
			store.updateItem(item1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCatalogWithNameEqualsToMorethan255Characters() {

		ICatalog ctlg1 = store.getCatalog(1);
		ctlg1.setDescription("description");
		ctlg1.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.updateCatalog(ctlg1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCatalogWithDescriptionEqualsToMorethan255Characters() {

		ICatalog ctlg1 = store.getCatalog(1);
		ctlg1.setName("name");
		ctlg1.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.updateCatalog(ctlg1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCategoryWithDescriptionEqualsToMorethan255Characters() {

		ICategory ctgr1 = store.getCategory(1);
		ctgr1.setName("name");
		ctgr1.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.updateCategory(ctgr1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateCategoryWithNameEqualsToMorethan255Characters() {

		ICategory ctgr1 = store.getCategory(1);
		ctgr1.setDescription("description");
		ctgr1.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.updateCategory(ctgr1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateProductWithDescriptionEqualsToMorethan255Characters() {

		IProduct prd = store.getProduct(1);
		prd.setName("name");
		prd.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.updateProduct(prd);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateProductWithNameEqualsToMorethan255Characters() {

		IProduct prd = store.getProduct(1);
		prd.setDescription("description");
		prd.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.updateProduct(prd);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateItemWithDescriptionEqualsToMorethan255Characters() {

		IItem item = store.getItem(1);
		item.setName("name");
		item.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.updateItem(item);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateItemWithNameEqualsToMorethan255Characters() {

		IItem item = store.getItem(1);
		item.setDescription("description");
		item.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.updateItem(item);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithUserNameEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setLastName("l11");
		ua1.setPassword("p11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);
		ua1.setIAddress(add1);

		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithUserNameEqualsToMorethan20Characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11dddddddddddddddddddd");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithPasswordEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setUserName("u11");
		ua1.setPassword(null);

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithPasswordEqualsToMorethan20characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("u11dddddddddddddddddddd");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithDateOfBirthEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");
		ua1.setBirthDate(null);

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithEmailIDEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");
		ua1.setEmailID(null);

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithEmailIDEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111ererty");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithFirstNameEqualsToMorethan20Characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11wwwwwwwwwwwwwwwwwsssss");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithLastNameEqualsToMorethan20Characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11eeeeeeefghbnvcdxsdssssssds");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithAddressObjectEqualsToNull() {

		try{
			IUserAccount ua1 = store.getUserAccount(1);
			assertNotNull(ua1);
			ua1.setBirthDate(new Date());
			ua1.setEmailID("e111");
			ua1.setFirstName("f11");
			ua1.setLastName("l11");
			ua1.setPassword("p11");
			ua1.setUserName("u11");

			IAddress add1 = null;

			add1.setAddress("ad1");
			add1.setCity("ci1");
			add1.setCountry("coun1");
			add1.setState("st1");
			add1.setType("ty1");
			add1.setZip(12);
			add1.setPhoneNumber(1234567890);

			ua1.setIAddress(add1);
			store.updateUserAccount(ua1);

		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithUserAccountObjectEqualsToNull() {


		try{
			IUserAccount ua1 = null;
			assertNotNull(ua1);
			ua1.setBirthDate(new Date());
			ua1.setEmailID("e111");
			ua1.setFirstName("f11");
			ua1.setLastName("l11");
			ua1.setPassword("p11");
			ua1.setUserName("u11");

			IAddress add1 = store.getUserAccount(1).getIAddress();
			assertNotNull(add1);
			add1.setAddress("ad1");
			add1.setCity("ci1");
			add1.setCountry("coun1");
			add1.setState("st1");
			add1.setType("ty1");
			add1.setZip(12);
			add1.setPhoneNumber(1234567890);
			store.updateUserAccount(ua1);
			ua1.setIAddress(add1);
		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithAddressEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithAddressEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1ggggggg");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithCityEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithCityEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1ggggggg");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithStateEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithStateEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("ad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1ggggggg");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithCountryEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithCountryEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("ad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1gggggggad1ggggggg");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithZipEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithZipEqualsToNegativeValue() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(-4343434);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithPhoneNumberEqualsToNull() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testUpdateUserAccountWithPhoneNumberequalsToNegativeValue() {

		IUserAccount ua1 = store.getUserAccount(1);
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.getUserAccount(1).getIAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(-1234567890);

		ua1.setIAddress(add1);
		try{
			store.updateUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}
}