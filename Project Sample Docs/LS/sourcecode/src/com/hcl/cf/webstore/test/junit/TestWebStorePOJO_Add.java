package com.hcl.cf.webstore.test.junit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.entities.CreditCard;
import com.hcl.cf.webstore.domain.interfaces.IAddress;
import com.hcl.cf.webstore.domain.interfaces.ICart;
import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.ICreditCard;
import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;
import com.hcl.cf.webstore.domain.interfaces.IWebStoreFacade;
import com.hcl.cf.webstore.facade.WebStorePOJO;

import junit.framework.TestCase;


public class TestWebStorePOJO_Add extends TestCase {

	private IWebStoreFacade store;
	private ICart cart;
	private ICatalog catalog;
	private ICategory category;
	private ICategory subCategory;
	private IItem item;
	private IProduct product;
	private IUserAccount userAccount;
	private ICreditCard creditCard;
	private IAddress address;
	private IOrder order;

	public TestWebStorePOJO_Add(String arg0) {
		super(arg0);
	}

	protected void setUp() throws Exception {
		store = new WebStorePOJO();
		cart = new Cart();
	}

	protected void tearDown() throws Exception {
		store = null;
		cart = null;
	}

	public final void testWebStorePOJO() {
		IWebStoreFacade store1 = new WebStorePOJO();
		assertNotNull("could not create WebStorePOJO", store1);
	}

	public final void testAddUserAccount() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		assertTrue(store.addUserAccount(ua1));
		assertTrue(store.removeUserAccount(ua1));
	}

	public final void testAddUserAccountWithPhoneNumberequalsToMinimumBoundaryValue() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11fgftrtr");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1);

		ua1.setIAddress(add1);
		assertTrue(store.addUserAccount(ua1));
		assertTrue(store.removeUserAccount(ua1));
	}

	public final void testAddUserAccountWithPhoneNumberequalsToMaximumBoundaryValue() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11trtrtrtrt");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(9223372036854775807l);

		ua1.setIAddress(add1);
		assertTrue(store.addUserAccount(ua1));
		assertTrue(store.removeUserAccount(ua1));
	}

	public final void testAddUserAccountWithPhoneNumberequalsToZero() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11rere4545");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(0);

		ua1.setIAddress(add1);
		assertTrue(store.addUserAccount(ua1));
		assertTrue(store.removeUserAccount(ua1));
	}

	public final void testAddUserAccountWithZipEqualsToMinimumBoundaryValue() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e1dgdg11");
		ua1.setFirstName("fgdgd11");
		ua1.setLastName("l1dgd1");
		ua1.setPassword("p11gdgdg");
		ua1.setUserName("u11fg");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("agdgdd1");
		add1.setCity("cigdg1");
		add1.setCountry("cogdgdun1");
		add1.setState("stgdgd1");
		add1.setType("tygdgdg1");
		add1.setZip(1);
		add1.setPhoneNumber(1234555567890l);

		ua1.setIAddress(add1);
		assertTrue(store.addUserAccount(ua1));
		assertTrue(store.removeUserAccount(ua1));
	}

	public final void testAddUserAccountWithZipEqualsToMaximumBoundaryValue() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u116656");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(9223372036854775807l);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		assertTrue(store.addUserAccount(ua1));
		assertTrue(store.removeUserAccount(ua1));
	}

	public final void testAddUserAccountWithZipEqualsToZero() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gfgfgf");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(0);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		assertTrue(store.addUserAccount(ua1));
		assertTrue(store.removeUserAccount(ua1));
	}

	public final void testAddCatalog() {

		ICatalog ctlg1 = store.createCatalog();
		ctlg1.setName("name1");
		ctlg1.setDescription("description1");
		assertTrue(store.addCatalog(ctlg1));
	}

	public final void testAddCategory() {

		ICategory ctgry1 = store.createCategory();
		ctgry1.setName("name1");
		ctgry1.setDescription("description1");

		ICategory ctgry2 = store.createCategory();
		ctgry2.setName("name2");
		ctgry2.setDescription("description2");

		assertTrue(store.addCategory(store.getCatalog(5), ctgry1));
		assertTrue(store.addCategory(store.getCatalog(5), ctgry2));
	}

	public final void testAddSubCategory() {

		Set<ICategory> set = store.getCategories(store.getCatalog(3));
		assertNotNull(set);

		Iterator<ICategory> itr2 = set.iterator();
		assertNotNull(itr2);

		while (itr2.hasNext()) {

			ICategory ctgry = itr2.next();
			assertNotNull(ctgry);

			ICategory ctgry1 = store.createCategory();
			ctgry1.setName("sub_name" + ctgry.getId());
			ctgry1.setDescription("description" + ctgry.getId());

			assertTrue(store.addSubCategory(ctgry, ctgry1));
		}
	}

	public final void testAddProduct() {

		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1000.00);
		assertTrue(store.addProduct(store.getCategory(11), prd1));
	}

	public final void testAddProductWithUnitsEqualsToNull() {

		ICategory catr1 = store.getCategory(6);
		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);

		assertTrue(store.addProduct(catr1, prd1));
	}

	public final void testAddProductWithCostEqualsToNull() {

		ICategory catr1 = store.getCategory(6);
		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));

		assertTrue(store.addProduct(catr1, prd1));
	}

	public final void testAddProductWithUnitsEqualsToZero() {

		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);
		prd1.setUnits(new Long(0));
		assertTrue(store.addProduct(store.getCategory(11),prd1));
	}

	public final void testAddProductWithUnitsEqualsToMaximumBoundaryValue() {

		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);
		prd1.setUnits(new Long(9223372036854775807l));
		assertTrue(store.addProduct(store.getCategory(11),prd1));
	}

	public final void testAddProductWithUnitsEqualsToMinimumBoundaryValue() {

		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);
		prd1.setUnits(new Long(1));
		assertTrue(store.addProduct(store.getCategory(11),prd1));
	}

	public final void testAddProductWithCostEqualsToZero() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(0.00);
		assertTrue(store.addProduct(store.getCategory(11) ,prd1));
	}

	public final void testAddProductWithCostEqualsToMaximumBoundaryValue() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1.79769313486231570e+308d);
		assertTrue(store.addProduct(store.getCategory(11) ,prd1));
	}

	public final void testAddProductWithCostEqualsToMinimumBoundaryValue() {

		IProduct prd1 = store.getProduct(1);
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1.00);
		assertTrue(store.addProduct(store.getCategory(11) ,prd1));
	}

	public final void testAddItem() {

		IProduct p1 = store.getProduct(1);
		assertNotNull(p1);

		IItem i1 = store.createItem();
		assertNotNull(i1);
		i1.setName("name1");
		i1.setDescription("description1");
		i1.setPrice(111.00);
		assertTrue(store.addItem(p1, i1));
	}

	public final void testAddItemtWithPriceEqualsMaximumBoundaryValue() {

		IProduct prd1 = store.getProduct(15);
		IItem item1 = store.createItem();
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(1.79769313486231570e+308d);
		assertTrue(store.addItem(prd1, item1));
	}

	public final void testAddItemtWithPriceEqualsToMinimumBoundaryValue() {

		IProduct prd1 = store.getProduct(13);
		IItem item1 = store.createItem();
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(1.00);
		assertTrue(store.addItem(prd1, item1));
	}

	public final void testAddItemtWithPriceEqualsToZero() {

		IProduct prd1 = store.getProduct(19);
		IItem item1 = store.createItem();
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(0.00);
		assertTrue(store.addItem(prd1, item1));
	}

	public final void testAddOrder() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(1223445556);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithProductObjectEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithItemObjectEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithZipEqualsToMinimumBoundaryValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(1);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithZipEqualsToMaximumBoundaryValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(9223372036854775807l);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithZipEqualsToZero() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(0);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithPhoneNumberEqualsToMinimumBoundaryValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(142323);
		address1.setPhoneNumber(1);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithPhoneNumberEqualsToMaximumBoundaryValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setPhoneNumber(9223372036854775807l);
		address1.setZip(343434);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithPhoneNumberEqualsToZero() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setPhoneNumber(0);
		address1.setZip(34343);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithCardNumberEqualsToMinimumBoundaryValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		ic1.setCreditCardNumber(9223372036854775807l);
		address1.setZip(6767676);
		address1.setPhoneNumber(1);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithCardNumberEqualsToMaximumBoundaryValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		ic1.setCreditCardNumber(9223372036854775807l);
		address1.setZip(6767676);
		address1.setPhoneNumber(12121212212l);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddOrderWithCardNumberEqualsToZero() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		ic1.setCreditCardNumber(0);
		address1.setZip(6767676);
		address1.setPhoneNumber(12121212212l);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		assertEquals(true, store.addOrder(order1));
	}

	public final void testAddProductToCart()
	{
		assertEquals(true, cart.addProduct(store.getProduct(17), 10));
	}

	public final void testAddProductToCartWithQuantityEqualsToZero()
	{
		assertEquals(false, cart.addProduct(store.getProduct(17), 0));
	}

	public final void testAddProductToCartWithQuantityEqualsToMaximumBoundaryValue()
	{
		assertEquals(true, cart.addProduct(store.getProduct(17), 9223372036854775807l));
	}

	public final void testAddProductToCartWithQuantityEqualsToMinimumBoundaryValue()
	{
		assertEquals(true, cart.addProduct(store.getProduct(17), 1));
	}

	public final void testAddItemToCart()
	{
		assertEquals(true, cart.addItem(store.getItem(1)));
	}

	public final void testCreateCart() {

		assertNotNull(store.createCart());
	}

	public final void testCreateAddress() {
		assertNotNull(store.createAddress());
	}

	public final void testCreateCatalog() {
		assertNotNull(store.createCatalog());
	}

	public final void testCreateCategory() {
		assertNotNull(store.createCategory());
	}

	public final void testCreateCreditCard() {
		assertNotNull(store.createCreditCard());
	}

	public final void testCreateImage() {
		assertNotNull(store.createImage());
	}

	public final void testCreateItem() {
		assertNotNull(store.createItem());
	}

	public final void testCreateOrder() {
		assertNotNull(store.createOrder());
	}

	public final void testCreateProduct() {
		assertNotNull(store.createProduct());
	}

	public final void testCreateUserAccount() {
		assertNotNull(store.createUserAccount());
	}

	public final void testAddCatalogWithCatalogObjectEqualsToNull() {

		assertFalse(store.addCatalog(catalog));
	}

	public final void testAddCatalogWithNameEqualsToNull() {

		ICatalog ctlg1 = store.createCatalog();
		ctlg1.setDescription("description");

		try{
			store.addCatalog(ctlg1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddCatalogWithDescriptionEqualsToNull() {

		ICatalog ctlg1 = store.createCatalog();
		ctlg1.setName("name");
		try{
			store.addCatalog(ctlg1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddCategoryWithCategoryObjectEqualsToNull() {

		assertFalse(store.addCategory(store.getCatalog(3), category));
	}

	public final void testAddCategoryWithNameEqualsToNull() {

		ICategory catr1 = store.createCategory();
		ICatalog ctlg1 = store.getCatalog(3);
		catr1.setDescription("description");

		try{
			store.addCategory(ctlg1, catr1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddCategoryWithDescriptionEqualsToNull() {

		ICategory catr1 = store.createCategory();
		ICatalog ctlg1 = store.getCatalog(3);
		catr1.setName("name");
		try{
			store.addCategory(ctlg1, catr1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddCategoryWithCatalogObjectEqualsToNull() {

		ICategory catr1 = store.createCategory();
		catr1.setName("name");
		catr1.setDescription("description");
		assertFalse(store.addCategory(catalog, catr1));
	}

	public final void testAddSubCategoryWithNameEqualsToNull() {

		ICategory catr1 = store.createCategory();
		ICategory catr2 = store.getCategory(16);
		catr1.setDescription("description");

		try{
			store.addSubCategory(catr2, catr1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddSubCategoryWithDescriptionEqualsToNull() {

		ICategory catr1 = store.createCategory();
		ICategory catr2 = store.getCategory(16);
		catr1.setName("name");

		try{
			store.addSubCategory(catr2, catr1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddSubCategoryWithCategoryObjectEqualsToNull() {

		ICategory catr1 = store.createCategory();
		catr1.setName("name");
		catr1.setDescription("description");
		assertFalse(store.addSubCategory(category, catr1));
	}

	public final void testAddSubCategoryWithSubCategoryObjectEqualsToNull() {

		assertFalse(store.addSubCategory(store.getCategory(16), subCategory));
	}

	public final void testAddProductWithNameEqualsToNull() {

		ICategory catr1 = store.getCategory(6);
		IProduct prd1 = store.createProduct();
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1000.00);

		try{
			store.addProduct(catr1, prd1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddProductWithDescriptionEqualsToNull() {

		ICategory catr1 = store.getCategory(6);
		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1000.00);

		try{
			store.addProduct(catr1, prd1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddProductWithNegativeNumberOfUnits() {

		ICategory catr1 = store.getCategory(6);
		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setCost(1000.00);
		prd1.setUnits(new Long(-10));

		try{
			store.addProduct(catr1,prd1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddProductWithCostEqualsToNegativeValue() {

		ICategory catr1 = store.getCategory(6);
		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(-10.00);

		try{
			store.addProduct(catr1,prd1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddProductWithCategoryObjectEqualsToNull() {

		IProduct prd1 = store.createProduct();
		prd1.setName("name1");
		prd1.setDescription("description1");
		prd1.setUnits(new Long(5));
		prd1.setCost(1000.00);
		assertFalse(store.addProduct(category, prd1));
	}

	public final void testAddProductWithProductObjectEqualsToNull() {

		assertFalse(store.addProduct(store.getCategory(6), product));
	}

	public final void testAddItemWithNameEqualsToNull() {

		IProduct prd1 = store.getProduct(20);
		IItem item1 = store.createItem();
		item1.setDescription("description1");
		item1.setPrice(1200.00);

		try{
			store.addItem(prd1, item1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddItemtWithDescriptionEqualsToNull() {

		IProduct prd1 = store.getProduct(20);
		IItem item1 = store.createItem();
		item1.setName("name1");
		item1.setPrice(1200.00);
		try{
			store.addItem(prd1, item1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddItemtWithPriceEqualsToNull() {

		IProduct prd1 = store.getProduct(20);
		IItem item1 = store.createItem();
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(null);
		try{
			store.addItem(prd1, item1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddItemWithProductObjectEqualsToNull() {

		IItem item1 = store.createItem();
		item1.setName("name1");
		item1.setDescription("description1");
		assertFalse(store.addItem(product, item1));
	}

	public final void testAddItemWithItemObjectEqualsToNull() {

		assertFalse(store.addItem(store.getProduct(6), item));
	}

	public final void testAddItemtWithPriceEqualsToNegativeValue() {

		IProduct prd1 = store.createProduct();
		IItem item1 = store.createItem();
		item1.setName("name1");
		item1.setDescription("description1");
		item1.setPrice(-10000.00);

		try{
			store.addItem(prd1, item1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddProductToCartWithProductObjectEqualsToNull()
	{
		assertEquals(false, cart.addProduct(product, 2));
	}

	public final void testAddProductToCartWithQuantityEqualsToNegativeValue()
	{
		try{
			cart.addProduct(store.getProduct(19), -2);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddItemToCartWithItemObjectEqualsToNull()
	{
		assertEquals(false, cart.addItem(item));
	}

	public final void testAddCatalogWithNameEqualsToMorethan255Characters() {

		ICatalog ctlg1 = store.createCatalog();
		ctlg1.setDescription("description");
		ctlg1.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addCatalog(ctlg1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddCatalogWithDescriptionEqualsToMorethan255Characters() {

		ICatalog ctlg1 = store.createCatalog();
		ctlg1.setName("name");
		ctlg1.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addCatalog(ctlg1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddCategoryWithDescriptionEqualsToMorethan255Characters() {

		ICatalog ctlg1 = store.getCatalog(3);
		ICategory ctgr1 = store.createCategory();
		ctgr1.setName("name");
		ctgr1.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addCategory(ctlg1,ctgr1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddCategoryWithNameEqualsToMorethan255Characters() {

		ICatalog ctlg1 = store.getCatalog(3);
		ICategory ctgr1 = store.createCategory();
		ctgr1.setDescription("description");
		ctgr1.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addCategory(ctlg1,ctgr1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddSubCategoryWithDescriptionEqualsToMorethan255Characters() {

		ICategory ctgr2 = store.getCategory(6);
		ICategory ctgr1 = store.createCategory();
		ctgr1.setName("name");
		ctgr1.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addSubCategory(ctgr2,ctgr1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddSubCategoryWithNameEqualsToMorethan255Characters() {

		ICategory ctgr2 = store.getCategory(6);
		ICategory ctgr1 = store.createCategory();
		ctgr1.setDescription("description");
		ctgr1.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addSubCategory(ctgr2,ctgr1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddProductWithDescriptionEqualsToMorethan255Characters() {

		ICategory ctgr2 = store.getCategory(14);
		IProduct prd = store.createProduct();
		prd.setName("name");
		prd.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addProduct(ctgr2,prd);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddProductWithNameEqualsToMorethan255Characters() {

		ICategory ctgr2 = store.getCategory(14);
		IProduct prd = store.createProduct();
		prd.setDescription("description");
		prd.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addProduct(ctgr2,prd);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddItemWithDescriptionEqualsToMorethan255Characters() {

		IProduct prd = store.getProduct(9);
		IItem item = store.createItem();
		item.setName("name");
		item.setDescription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addItem(prd,item);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddItemWithNameEqualsToMorethan255Characters() {

		IProduct prd = store.getProduct(9);
		IItem item = store.createItem();
		item.setDescription("description");
		item.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		try{
			store.addItem(prd,item);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithUserNameEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setLastName("l11");
		ua1.setPassword("p11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithUserNameEqualsToMorethan20Characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11dddddddddddddddddddd");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithPasswordEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithPasswordEqualsToMorethan255characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithDateOfBirthEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithEmailIDEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithEmailIDEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111erertye111ererty");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithFirstNameEqualsToMorethan20Characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11wwwwwwwwwwwwwwwwwsssss");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithLastNameEqualsToMorethan20Characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11eeeeeeefghbnvcdxsdssssssds");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithAddressObjectEqualsToNull() {

		try{
			IUserAccount ua1 = store.createUserAccount();
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
			store.addUserAccount(ua1);

		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithUserAccountObjectEqualsToNull() {


		try{
			IUserAccount ua1 = null;
			ua1.setBirthDate(new Date());
			ua1.setEmailID("e111");
			ua1.setFirstName("f11");
			ua1.setLastName("l11");
			ua1.setPassword("p11");
			ua1.setUserName("u11");

			IAddress add1 = store.createAddress();
			assertNotNull(add1);
			add1.setAddress("ad1");
			add1.setCity("ci1");
			add1.setCountry("coun1");
			add1.setState("st1");
			add1.setType("ty1");
			add1.setZip(12);
			add1.setPhoneNumber(1234567890);

			ua1.setIAddress(add1);
		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithAddressEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithAddressEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithCityEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithCityEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithStateEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithStateEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithCountryEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithCountryEqualsToMorethan255Characters() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithZipEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11gdgdgd");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setPhoneNumber(1234567890);

		ua1.setIAddress(add1);
		try{
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithZipEqualsToNegativeValue() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithPhoneNumberEqualsToNull() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
		assertNotNull(add1);
		add1.setAddress("ad1");
		add1.setCity("ci1");
		add1.setCountry("coun1");
		add1.setState("st1");
		add1.setType("ty1");
		add1.setZip(12);

		ua1.setIAddress(add1);
		try{
			store.addUserAccount(ua1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddUserAccountWithPhoneNumberequalsToNegativeValue() {

		IUserAccount ua1 = store.createUserAccount();
		assertNotNull(ua1);
		ua1.setBirthDate(new Date());
		ua1.setEmailID("e111");
		ua1.setFirstName("f11");
		ua1.setLastName("l11");
		ua1.setPassword("p11");
		ua1.setUserName("u11");

		IAddress add1 = store.createAddress();
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
			store.addUserAccount(ua1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithUserAccountObjectEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(userAccount);
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(1223445556);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCreditCardObjectEqualsToNull() {

		try{
			ICart cart1 = store.createCart();
			cart1.addItem(store.getItem(1));
			cart1.addItem(store.getItem(2));
			cart1.addProduct(store.getProduct(1), 1);
			cart1.addProduct(store.getProduct(2), 1);

			creditCard.setCardType("VISA");
			creditCard.setCreditCardNumber(1212121212121212l);
			creditCard.setExpiryDate(new Date());

			IOrder order1 = store.createOrder();
			order1.setIUserAccount(store.getUserAccount(3));
			order1.setICart(cart1);
			order1.setDate(new Date());
			order1.setOrderStatus("pending");

			IAddress address1 = store.createAddress();
			address1.setCity("hyd");
			address1.setState("ap");
			address1.setCountry("india");
			address1.setAddress("street line 1");
			address1.setZip(500074);
			address1.setPhoneNumber(1223445556);

			order1.setIShippingAddress(address1);
			order1.setICreditCard(creditCard);

			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
		catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCartObjectEqualsToNull() {

		try{
			cart.addItem(store.getItem(1));
			cart.addItem(store.getItem(2));
			cart.addProduct(store.getProduct(1), 1);
			cart.addProduct(store.getProduct(2), 1);

			ICreditCard ic1 = new CreditCard();
			ic1.setCardType("VISA");
			ic1.setCreditCardNumber(1212121212121212l);
			ic1.setExpiryDate(new Date());

			IOrder order1 = store.createOrder();
			order1.setIUserAccount(store.getUserAccount(3));
			order1.setICart(cart);
			order1.setDate(new Date());
			order1.setOrderStatus("pending");

			IAddress address1 = store.createAddress();
			address1.setCity("hyd");
			address1.setState("ap");
			address1.setCountry("india");
			address1.setAddress("street line 1");
			address1.setZip(500074);
			address1.setPhoneNumber(1223445556);

			order1.setIShippingAddress(address1);
			order1.setICreditCard(ic1);

			store.addOrder(order1);
		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithAddressObjectEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");
		order1.setIShippingAddress(address);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithOrderObjectEqualsToNull() {

		try{
			ICart cart1 = store.createCart();
			cart1.addItem(store.getItem(1));
			cart1.addItem(store.getItem(2));
			cart1.addProduct(store.getProduct(1), 1);
			cart1.addProduct(store.getProduct(2), 1);

			ICreditCard ic1 = new CreditCard();
			ic1.setCardType("VISA");
			ic1.setCreditCardNumber(1212121212121212l);
			ic1.setExpiryDate(new Date());

			order.setIUserAccount(store.getUserAccount(3));
			order.setICart(cart1);
			order.setDate(new Date());
			order.setOrderStatus("pending");

			IAddress address1 = store.createAddress();
			address1.setCity("hyd");
			address1.setState("ap");
			address1.setCountry("india");
			address1.setAddress("street line 1");
			address1.setZip(500074);
			address1.setPhoneNumber(1223445556);

			order.setIShippingAddress(address1);
			order.setICreditCard(ic1);
			store.addOrder(order);
		}catch(java.lang.NullPointerException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithOrderedStatusEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithOrderedStatusEqualsMorethan255Characters() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("dfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfghdfgscvdfgh");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithOrderedDateEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithIncorrectOrderedDateFormat() {

		ICart cart1 = store.createCart();
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date orderedDate = null;
		try {
			orderedDate = df.parse("20/10/1988");
		} catch (Exception e) {
			e.printStackTrace();
		}

		IOrder order1 = store.createOrder();
		order1.setDate(orderedDate);
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(false, store.addOrder(order1));
	}

	public final void testAddOrderWithAddressEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithAddressEqualsToMorethan255Characters() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setAddress("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);



		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCityEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setAddress("street line 1");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCityEqualsToMorethan255Characters() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
		address1.setAddress("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithStateEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setAddress("street line 1");
		address1.setCountry("india");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithStateEqualsToMorethan255Characters() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setState("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
		address1.setCity("hyd");
		address1.setAddress("ap");
		address1.setCountry("india");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCountryEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setAddress("street line 1");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCountryEqualsToMorethan255Characters() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCountry("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setAddress("india");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithZipEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setPhoneNumber(1234567890);
		address1.setAddress("street line 1");

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithZipEqualsToNegativeValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(-131313);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithPhoneNumberEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithPhoneNumberEqualsToNegativeValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(12121212212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setPhoneNumber(-131313);
		address1.setZip(6767676);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithExpiryDateOfCreditCardEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithIncorrectExpirydDateFormat() {

		ICart cart1 = store.createCart();
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setCreditCardNumber(1212121212121212l);

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date expiryDate = null;
		try {
			expiryDate = df.parse("20/10/1988");
		} catch (Exception e) {
			e.printStackTrace();
		}

		ic1.setExpiryDate(expiryDate);

		IOrder order1 = store.createOrder();
		order1.setDate(new Date());
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);
		assertEquals(false, store.addOrder(order1));
	}

	public final void testAddOrderWithCardNumberOfCreditCardEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCardNumberEqualsToNegativeValue() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(4));
		cart1.addProduct(store.getProduct(8), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCardType("VISA");
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		ic1.setCreditCardNumber(-131313);
		address1.setZip(6767676);
		address1.setPhoneNumber(12121212212l);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCardTypeOfCreditCardEqualsToNull() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setAddress("street line 1");
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);

		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.PropertyValueException e){
			assertTrue(true);
		}
	}

	public final void testAddOrderWithCardTypeOfCreditCardEqualsToMorethan255Characters() {

		ICart cart1 = store.createCart();
		cart1.addItem(store.getItem(1));
		cart1.addItem(store.getItem(2));
		cart1.addProduct(store.getProduct(1), 1);
		cart1.addProduct(store.getProduct(2), 1);

		ICreditCard ic1 = new CreditCard();
		ic1.setCreditCardNumber(1212121212121212l);
		ic1.setExpiryDate(new Date());

		IOrder order1 = store.createOrder();
		order1.setIUserAccount(store.getUserAccount(3));
		order1.setICart(cart1);
		order1.setDate(new Date());
		order1.setOrderStatus("pending");

		IAddress address1 = store.createAddress();
		ic1.setCardType("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
		address1.setAddress("dgdgdg");
		address1.setCity("hyd");
		address1.setState("ap");
		address1.setCountry("india");
		address1.setPhoneNumber(1234567890);
		address1.setZip(500074);
		address1.setPhoneNumber(121212121);


		order1.setIShippingAddress(address1);
		order1.setICreditCard(ic1);

		try{
			store.addOrder(order1);
		}catch(org.hibernate.exception.DataException e){
			assertTrue(true);
		}
	}
}