package com.hcl.cf.webstore.dao.interfaces;

import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.ICreditCard;
import com.hcl.cf.webstore.domain.interfaces.IOrder;

public interface IOrderDAO {

	IOrder getOrder(long id);

	Set<IOrder> getOrders(String userName);

	boolean addOrder(IOrder order);

	boolean removeOrder(IOrder order);
}
