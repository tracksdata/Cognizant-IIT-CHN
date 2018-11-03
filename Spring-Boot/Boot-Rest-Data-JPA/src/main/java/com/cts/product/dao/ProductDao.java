package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.product.entities.Product;
public interface ProductDao extends JpaRepository<Product, String> {
	
	@Query("select prod.prodId,prod.prodName,prod.price"
			+ " from Product prod where prod.prodName like %:name%")
	List<Product>findByName(@Param("name") String name);

}
