package com.hcl.cf.webstore.domain.validators;

import com.hcl.cf.webstore.domain.interfaces.IItem;
import com.hcl.cf.webstore.domain.interfaces.IProduct;

public class ProductItemCostValidator {

	public static boolean validate(IProduct product, IItem item) {

		return ((item.getPrice() > 0) && (product.getCost() > 0)) ? false
				: true;
	}
}
