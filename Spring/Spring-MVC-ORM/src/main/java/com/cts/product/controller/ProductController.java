package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;

	@RequestMapping("/")
	public String welcome() {
		return "product";
	}
	
	@RequestMapping(value="saveProduct",method=RequestMethod.POST)
	public String saveProduct(@ModelAttribute Product product,Model model) {
		ps.saveProduct(product);
		model.addAttribute("msg", "Product "+product.getProdName()+" Saved to DB");
		
		return "product";
	}
	
	

	

}
