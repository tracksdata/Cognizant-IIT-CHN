package com.cts.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping(value="s1")
	public String f1(Map<String, Object> model) {
		System.out.println("--- f1 method of ProductCOntroller");
		model.put("name", "Praveen");
		return "test";
	}

}
