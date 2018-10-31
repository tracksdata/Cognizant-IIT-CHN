package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductServiceImpl;

@Controller
@SessionAttributes("data")
public class ProductController {

	@Autowired
	private ProductServiceImpl ps;

	@RequestMapping("/")
	public String welcome() {

		return "form";
	}

	@RequestMapping(value = "/s2")
	public String saveProduct(Model model, @RequestParam("prodId") String prodId,
			@RequestParam("prodName") String prodName, @RequestParam("price") double price) {
		System.out.println("-- saveProduct " + prodId + " " + prodName + " price");
		Product prod = new Product();
		prod.setProdId(prodId);
		prod.setProdName(prodName);
		prod.setPrice(price);

		model.addAttribute("product", prod);
		return "display";
	}

	@RequestMapping(value = "/s3", method = RequestMethod.POST)
	public String saveProduct_v1(@ModelAttribute("cn") Product prod, Model model) {

		System.out.println(
				"Id: " + prod.getProdId() + " and Name: " + prod.getProdName() + " and Price: " + prod.getPrice());

		model.addAttribute("product", prod);

		return "display";
	}

	@RequestMapping(value="s4")
	public String s3(Model model) {
		String[] branches= {"b1","b2","b3","b4","b5"};
		Product prod=new Product();
		prod.setProdId("P002");
		prod.setProdName("Book");
		prod.setPrice(384384);
		
		model.addAttribute("product", prod);
		model.addAttribute("branches", branches);
		
		
		return "product";
	}

}
