package com.hcl.cf.webstore.dao.interfaces;

import com.hcl.cf.webstore.domain.interfaces.IItem;

public interface IItemDAO {

	IItem getItem(long id);

	boolean updateItem(IItem item);
}
