package com.hcl.cf.webstore.domain.interfaces;

import java.util.List;
import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.ICatalog;
import com.hcl.cf.webstore.domain.interfaces.ICategory;
import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IOrder;
import com.hcl.cf.webstore.domain.interfaces.IProduct;
import com.hcl.cf.webstore.domain.interfaces.IUserAccount;

public interface IWebStoreFacade {

	// ! Add...
	boolean addCatalog(ICatalog catalog);

	boolean addCategory(ICatalog catalog, ICategory category);

	boolean addSubCategory(ICategory category, ICategory subCategory);

	boolean addItem(IProduct product, IItem item);

	boolean addOrder(IOrder order);

	boolean addProduct(ICategory category, IProduct product);

	boolean addUserAccount(IUserAccount account);

	// ! Factories...
	ICatalog createCatalog();

	ICategory createCategory();

	IProduct createProduct();

	IItem createItem();

	IUserAccount createUserAccount();

	ICreditCard createCreditCard();

	IAddress createAddress();

	ICart createCart();

	IImage createImage();

	IOrder createOrder();

	// ! Get...
	ICatalog getCatalog(long id);

	List<ICatalog> getCatalogs();

	ICategory getCategory(long id);

	Set<ICategory> getCategories(ICatalog catalog);

	IItem getItem(long id);

	Set<IItem> getItems(IProduct product);

	Integer getItemsCount(IProduct product);

	IOrder getOrder(long id);

	Set<IOrder> getOrders(String userName);

	IProduct getProduct(long id);

	Set<IProduct> getProducts(ICategory category);

	Set<ICategory> getSubCategories(ICategory category);

	IUserAccount getUserAccount(long id);

	IUserAccount getUserAccount(String userName);

	IUserAccount getUserAccount(String userName, String pwd);

	// ! questions...
	boolean hasDisplayableItem(IProduct product);

	boolean hasProducts(ICategory category);

	boolean hasSubCategories(ICategory category);

	// ! Remove...
	boolean removeCatalog(ICatalog catalog);

	boolean removeCategory(ICatalog catalog, ICategory category);

	boolean removeItem(IProduct product, IItem item);

	boolean removeProduct(ICategory category, IProduct product);

	boolean removeUserAccount(IUserAccount account);
	
	boolean removeOrder(IOrder order);

	// ! Update...
	boolean updateCatalog(ICatalog catalog);

	boolean updateCategory(ICategory category);

	boolean updateItem(IItem item);

	boolean updateProduct(IProduct product);

	boolean updateUserAccount(IUserAccount account);

	

}
