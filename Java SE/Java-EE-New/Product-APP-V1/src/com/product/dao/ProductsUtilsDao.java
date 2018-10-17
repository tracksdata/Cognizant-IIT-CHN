package com.product.dao;

import java.util.ArrayList;
import java.util.List;

import com.product.model.Product;

public class ProductsUtilsDao {
	
	private static List<Product> products=new ArrayList<>();
	
	
	public static List<Product> getProducts(){
		return products;
	}
	

}
