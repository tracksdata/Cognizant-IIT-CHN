package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@RequestMapping(value = "/")
	public String welcome() {

		return "index";
	}

	@RequestMapping(value = "/s1")
	public String f1() {
		System.out.println("--- f1 method in ProductController class");

		return "test";
	}

	@RequestMapping(value = "/s2")
	public ModelAndView f2() {
		System.out.println("--- f2 method in ProductController class");

		String empName = "Praveen Reddy S";
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		mav.addObject("name", empName);
		mav.addObject("age", "20");
		return mav;
	}

	@RequestMapping(value = "/s3")
	public String f3(Model model) {
		System.out.println("--- f3 method in ProductController class");

		String empName = "Ozvitha Fernz";

		int age = 65;

		model.addAttribute("name", empName);
		model.addAttribute("age", age);

		return "test";
	}

	@RequestMapping(value = "/s4")
	public String f4() {

		System.out.println("--- f4 is called");
		
		return "redirect:/s5";
	}

	@RequestMapping(value = "/s5")
	public void f5() {
		System.out.println("--- f5 is called");
	}

}
