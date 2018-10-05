package com.hcl.cf.webstore.dao.interfaces;

import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IProduct;

public interface IProductDAO {

	boolean addItem(IProduct product, IItem item);

	Set<IItem> getItems(IProduct product);

	IProduct getProduct(long id);

	Integer getItemsCount(IProduct product);

	boolean hasDisplayableItem(IProduct product);

	boolean removeItem(IProduct product, IItem item);

	boolean updateProduct(IProduct product);
}
