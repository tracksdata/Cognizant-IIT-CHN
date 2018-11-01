package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.product.entities.Product;
public interface ProductDao extends JpaRepository<Product, String> {

}
