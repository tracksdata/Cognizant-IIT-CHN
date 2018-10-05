package com.hcl.cf.webstore.facade;

import java.util.List;
import java.util.Set;

import com.hcl.cf.webstore.dao.implementation.*;
import com.hcl.cf.webstore.dao.interfaces.*;
import com.hcl.cf.webstore.domain.entities.Address;
import com.hcl.cf.webstore.domain.entities.Cart;
import com.hcl.cf.webstore.domain.entities.Catalog;
import com.hcl.cf.webstore.domain.entities.Category;
import com.hcl.cf.webstore.domain.entities.CreditCard;
import com.hcl.cf.webstore.domain.entities.Image;
import com.hcl.cf.webstore.domain.entities.Item;
import com.hcl.cf.webstore.domain.entities.Order;
import com.hcl.cf.webstore.domain.entities.Product;
import com.hcl.cf.webstore.domain.entities.UserAccount;
import com.hcl.cf.webstore.domain.interfaces.*;

public class WebStorePOJO implements IWebStoreFacade {

	private IUserAccountDAO accountDAO;

	private ICatalogDAO catalogDAO;

	private ICategoryDAO categoryDAO;

	private IItemDAO itemDAO;

	private IOrderDAO orderDAO;

	private IProductDAO productDAO;

	public WebStorePOJO() {
		init();
	}

	/*
	 * @param catalog @return
	 */
	public boolean addCatalog(ICatalog catalog) {

		return catalogDAO.addCatalog(catalog);
	}

	/*
	 * @param catalog @return
	 */
	public boolean addCategory(ICatalog catalog, ICategory category) {

		return catalogDAO.addCategory(catalog, category);
	}

	/*
	 * @param product @param item @return
	 */
	public boolean addItem(IProduct product, IItem item) {

		return productDAO.addItem(product, item);
	}

	/*
	 * @param order @return
	 */
	public boolean addOrder(IOrder order) {

		return orderDAO.addOrder(order);
	}

	/*
	 * @param category @param product @return
	 */
	public boolean addProduct(ICategory category, IProduct product) {

		return categoryDAO.addProduct(category, product);
	}

	/*
	 * @param category @param subCategory @return
	 */
	public boolean addSubCategory(ICategory category, ICategory subCategory) {

		return categoryDAO.addSubCategory(category, subCategory);
	}

	/*
	 * @param account @return
	 */
	public boolean addUserAccount(IUserAccount account) {

		return accountDAO.addUserAccount(account);
	}

	/*
	 * @return
	 */
	public IAddress createAddress() {

		return new Address();
	}

	/*
	 * @return
	 */
	public ICart createCart() {

		return new Cart();
	}

	/*
	 * @return
	 */
	public ICatalog createCatalog() {

		return new Catalog();
	}

	/*
	 * @return
	 */
	public ICategory createCategory() {

		return new Category();
	}

	/*
	 * @return
	 */
	public ICreditCard createCreditCard() {

		return new CreditCard();
	}

	/*
	 * @return
	 */
	public IImage createImage() {

		return new Image();
	}

	/*
	 * @return
	 */
	public IItem createItem() {

		return new Item();
	}

	/*
	 * @return
	 */
	public IOrder createOrder() {

		return new Order();
	}

	/*
	 * @return
	 */
	public IProduct createProduct() {

		return new Product();
	}

	/*
	 * @return
	 */
	public IUserAccount createUserAccount() {

		return new UserAccount();
	}

	/**
	 * @return the accountDAO
	 */
	public IUserAccountDAO getAccountDAO() {
		return accountDAO;
	}

	/*
	 * @param id @return
	 */
	public ICatalog getCatalog(long id) {

		return catalogDAO.getCatalog(id);
	}

	/**
	 * @return the catalogDAO
	 */
	public ICatalogDAO getCatalogDAO() {
		return catalogDAO;
	}

	/*
	 * @return
	 */
	public List<ICatalog> getCatalogs() {

		return catalogDAO.getCatalogs();
	}

	/*
	 * @param catalog @return
	 */
	public Set<ICategory> getCategories(ICatalog catalog) {

		return catalogDAO.getCategories(catalog);
	}

	/*
	 * @param id @return
	 */
	public ICategory getCategory(long id) {

		return categoryDAO.getCategory(id);
	}

	/**
	 * @return the categoryDAO
	 */
	public ICategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	/*
	 * @param id @return
	 */
	public IItem getItem(long id) {

		return itemDAO.getItem(id);
	}

	/**
	 * @return the itemDAO
	 */
	public IItemDAO getItemDAO() {
		return itemDAO;
	}

	/*
	 * @param product @return
	 */
	public Set<IItem> getItems(IProduct product) {

		return productDAO.getItems(product);
	}

	public Integer getItemsCount(IProduct product) {

		return productDAO.getItemsCount(product);
	}

	/*
	 * @param id @return
	 */
	public IOrder getOrder(long id) {

		return orderDAO.getOrder(id);
	}

	/**
	 * @return the orderDAO
	 */
	public IOrderDAO getOrderDAO() {
		return orderDAO;
	}

	/*
	 * @param userName @return
	 */
	public Set<IOrder> getOrders(String userName) {

		return orderDAO.getOrders(userName);
	}

	/*
	 * @param id @return
	 */
	public IProduct getProduct(long id) {

		return productDAO.getProduct(id);
	}

	/**
	 * @return the productDAO
	 */
	public IProductDAO getProductDAO() {
		return productDAO;
	}

	/*
	 * @param category @return
	 */
	public Set<IProduct> getProducts(ICategory category) {

		return categoryDAO.getProducts(category);
	}

	/*
	 * @param category @return
	 */
	public Set<ICategory> getSubCategories(ICategory category) {

		return categoryDAO.getSubCategories(category);
	}

	/*
	 * @param id @return
	 */
	public IUserAccount getUserAccount(long id) {

		return accountDAO.getUserAccount(id);
	}

	/*
	 * @param userName @return
	 */
	public IUserAccount getUserAccount(String userName) {

		return accountDAO.getUserAccount(userName);
	}

	/*
	 * @param userName @param pwd @return
	 */
	public IUserAccount getUserAccount(String userName, String pwd) {

		return accountDAO.getUserAccount(userName, pwd);
	}

	/*
	 * @param product @return
	 */
	public boolean hasDisplayableItem(IProduct product) {

		return productDAO.hasDisplayableItem(product);
	}

	/*
	 * @param category @return
	 */
	public boolean hasProducts(ICategory category) {

		return categoryDAO.hasProducts(category);
	}

	/*
	 * @param category @return
	 */
	public boolean hasSubCategories(ICategory category) {

		return categoryDAO.hasSubCategories(category);
	}

	private void init() {

		accountDAO = new UserAccountDAO();
		catalogDAO = new CatalogDAO();
		categoryDAO = new CategoryDAO();
		itemDAO = new ItemDAO();
		orderDAO = new OrderDAO();
		productDAO = new ProductDAO();
	}

	/*
	 * @param catalog @return
	 */
	public boolean removeCatalog(ICatalog catalog) {

		return catalogDAO.removeCatalog(catalog);
	}

	/*
	 * @param catalog @return
	 */
	public boolean removeCategory(ICatalog catalog, ICategory category) {

		return catalogDAO.removeCategory(catalog, category);
	}

	/*
	 * @param product @return
	 */
	public boolean removeItem(IProduct product, IItem item) {

		return productDAO.removeItem(product, item);
	}

	/*
	 * @param category @return
	 */
	public boolean removeProduct(ICategory category, IProduct product) {

		return categoryDAO.removeProduct(category, product);
	}

	/*
	 * @param account @return
	 */
	public boolean removeUserAccount(IUserAccount account) {

		return accountDAO.removeUserAccount(account);
	}

	/*
	 * @param account @return
	 */
	public boolean removeOrder(IOrder order) {
		
		return orderDAO.removeOrder(order);
	}
	/**
	 * @param accountDAO
	 *            the accountDAO to set
	 */
	public void setAccountDAO(IUserAccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	/**
	 * @param catalogDAO
	 *            the catalogDAO to set
	 */
	public void setCatalogDAO(ICatalogDAO catalogDAO) {
		this.catalogDAO = catalogDAO;
	}

	/**
	 * @param categoryDAO
	 *            the categoryDAO to set
	 */
	public void setCategoryDAO(ICategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	/**
	 * @param itemDAO
	 *            the itemDAO to set
	 */
	public void setItemDAO(IItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

	/**
	 * @param orderDAO
	 *            the orderDAO to set
	 */
	public void setOrderDAO(IOrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	/**
	 * @param productDAO
	 *            the productDAO to set
	 */
	public void setProductDAO(IProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	/*
	 * @param catalog @return
	 */
	public boolean updateCatalog(ICatalog catalog) {

		return catalogDAO.updateCatalog(catalog);
	}

	/*
	 * @param category @return
	 */
	public boolean updateCategory(ICategory category) {

		return categoryDAO.updateCategory(category);
	}

	/*
	 * @param product @return
	 */
	public boolean updateItem(IItem item) {

		return itemDAO.updateItem(item);
	}

	/*
	 * @param product @return
	 */
	public boolean updateProduct(IProduct product) {

		return productDAO.updateProduct(product);
	}

	/*
	 * @param account @return
	 */
	public boolean updateUserAccount(IUserAccount account) {

		return accountDAO.updateUserAccount(account);
	}

}
