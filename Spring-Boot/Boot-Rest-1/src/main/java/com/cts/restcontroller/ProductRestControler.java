package com.cts.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Product;
import com.cts.service.ProductService;

@RestController
@RequestMapping(value="products")
public class ProductRestControler {

	@Autowired
	private ProductService ps;

	@GetMapping(value="/")
	public String f() {
		return "Hey I am Default";
	}

	

	@GetMapping(value="/f2")
	public String f1() {
		return "Hey I am f2";
	}
	
	
	@PostMapping(value="/f2")
	public String f33() {
		
		return "Hey I am with post request";
	}

	@PostMapping(value="/f2/{empName}")
	public String f3(@PathVariable("empName") String name) {
		System.out.println("---- Received Name: "+name);
		return "Hey I am f3 with post with name "+name;
	}
	
	@PutMapping(value="/f2")
	public String f4() {
		return "Hey I am f4 with put";
	}
	
	@DeleteMapping(value="/f2")
	public String f5() {
		return "Hey I am f5 with delete";
	}
	@RequestMapping(value = "/s1")
	public String greet() {
		return "Good Afternoon";
	}

	@RequestMapping(value = "/s2")
	public Product loadProduct() {
		return ps.getProduct();
	}

}
