package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

		return "index";
	}

	@RequestMapping("s1")
	public void f1() {
		ps.test();
		System.out.println("-- Its Working ...");
	}

	@RequestMapping(value = "/s2")
	public String f2() {

		return "test";
	}

	@RequestMapping(value = "/s3")
	public ModelAndView f3() {

		String url = "display";
		ModelAndView mav = new ModelAndView();
		String cities[] = { "Chennai", "Delhi", "Chennai", "Hyderabd", "Pune" };

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setPrice(44);

		mav.addObject("name", "James");
		mav.addObject("product", prod);
		mav.addObject("myCities", cities);

		mav.setViewName(url);

		return mav;
	}

	@RequestMapping(value = "/s4")
	public String f4(Model model) {

		String url = "display";

		String cities[] = { "GOA", "Delhi", "Chennai", "Hyderabd", "Pune" };

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Book");
		prod.setPrice(424);

		model.addAttribute("name", "James");
		model.addAttribute("product", prod);
		model.addAttribute("myCities", cities);

		return "display";
	}

	@RequestMapping(value="/s5")
	public String f5(Model model) {
		
		
		//model.addAttribute("empName", name);
		//System.out.println("-- model "+model.asMap().get("data"));
		model.addAttribute("empName","Ozvitha");
	//	System.out.println("--- s5 method -- "+name);
		return "form";
	}

	@RequestMapping(value="/s6")
	public String f6(Model model) {
		System.out.println("--- s6 method");
		model.addAttribute("data", "Praveen reddy S");
		return "redirect:/s5";
	}

}
