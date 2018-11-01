package com.cts.product.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@RestController
@CrossOrigin
@ComponentScans(value = { @ComponentScan("com.cts.product.dao"), @ComponentScan("com.cts.product.service") })
@RequestMapping(value = "/products")
public class ProductRestController {

	@Autowired
	private ProductService ps;
	List<Product> products = null;
	Optional<Product> product=null;

	@GetMapping(value = "/")
	public ResponseEntity<?> listAll() {
		products = ps.findAll();
		if (products.size() == 0) {
			return new ResponseEntity<String>("No Records available in DB", HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@GetMapping("/{prodId}")
	public ResponseEntity<?> findById(@PathVariable("prodId") String prodId) {
		
		
		product=ps.findById(prodId);
		
		System.out.println("Product Data: "+product);
		if(product==null) {
			System.out.println("---- null");
			return new ResponseEntity<String>("Product id "+prodId+"  not found",HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Optional<Product>> (product, HttpStatus.OK);
	}

	@PostMapping(value = "/product/")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		product=ps.save(product);
		
		if(product==null) {
			return new ResponseEntity<String>("Product not saved", HttpStatus.OK);

		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@PutMapping(value = "/product/")
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {
		product=ps.save(product);
		
		if(product==null) {
			return new ResponseEntity<String>("Product not saved", HttpStatus.OK);

		}
		
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@DeleteMapping(value = "/{prodId}")
	public ResponseEntity<?> deleteProduct(@PathVariable("prodId") String prodId) {
		ps.deleteById(prodId);
		
		return  new ResponseEntity<String>("Product Id with "+prodId+" Deleteted", HttpStatus.OK);
	}

}
