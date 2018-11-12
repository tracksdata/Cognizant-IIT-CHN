package com.cts.product.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
@CrossOrigin(origins="*")
@ComponentScans(value = { @ComponentScan("com.cts.product.dao"), @ComponentScan("com.cts.product.service") })
@RequestMapping(value = "/products")
public class ProductRestController {

	@Autowired
	private ProductService ps;
	List<Product> products = null;
	Optional<Product> product=null;
	
	@GetMapping(value = "/filter/{prodName}")
	
	public ResponseEntity<?> findByName(@PathVariable("prodName") String prodName) {
		products = ps.findByName(prodName);
		if (products.isEmpty()) {
			return new ResponseEntity<Object>("No Records available with given name"+prodName, HttpStatus.OK);
		}

		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@GetMapping(value = "")
	public ResponseEntity<?> listAll() {
		products = ps.findAll();
		if (products.isEmpty()) {
			return new ResponseEntity<String>("No Records available in DB", HttpStatus.OK);
		}

		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@GetMapping("/{prodId}")
	public ResponseEntity<?> findById(@PathVariable("prodId") String prodId) throws Exception {
		
		if(prodId.equals("P001"))
		throw new Exception();
		
		product=ps.findById(prodId);
		
		if(!product.isPresent()) {
			//System.out.println("---- null");
			return new ResponseEntity<String>("Product id "+prodId+"  not found",HttpStatus.OK);
		}
		
		return new ResponseEntity<Optional<Product>> (product, HttpStatus.OK);
	}

	@PostMapping(value = "/product")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		product=ps.save(product);
		
		if(product==null) {
			return new ResponseEntity<String>("Product not saved", HttpStatus.OK);

		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@PutMapping(value = "/product")
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
		
		return  new ResponseEntity<>(HttpStatus.OK);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleExceptin(Exception e) {
		return new ResponseEntity<String>("Provided URL not valid. make sure its should be /products/ "+e,HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/error")
	public ResponseEntity<String> handleExceptin1() {
		return new ResponseEntity<String>("Provided URL not valid. make sure its should be /products/ ",HttpStatus.NOT_FOUND);
	}

}
