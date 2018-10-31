package com.cts.product.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@RequestMapping(value = "s4")
	public String s3(Model model) {
		String[] branches = { "b1", "b2", "b3", "b4", "b5" };
		Product prod = new Product();
		prod.setProdId("P002");
		prod.setProdName("Book");
		prod.setPrice(384384);

		ArrayList<String> cars = new ArrayList<String>();
		ArrayList<String> animals = new ArrayList<String>();

		cars.add("BMW");
		cars.add("Benz");
		cars.add("Hyundai");
		cars.add("Tata");

		animals.add("Monkey");
		animals.add("Donkey");
		animals.add("Dog");

		Map<String, ArrayList<String>> dataList = new HashMap<String, ArrayList<String>>();
		dataList.put("cars", cars);
		dataList.put("animals", animals);
		List<String> states = new ArrayList<String>();
		states.add("-- Select One Country---");

		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");

		model.addAttribute("product", prod);
		model.addAttribute("branches", branches);
		model.addAttribute("dataList", dataList);
		model.addAttribute("countries", countries);
		model.addAttribute("states", states);
		return "product";
	}

	@RequestMapping(value="s5")
	public String loadStates(@ModelAttribute Product prod, Model model) {

		String[] branches = { "b1", "b2", "b3", "b4", "b5" };
		//Product prod1 = new Product();
		
		

		ArrayList<String> cars = new ArrayList<String>();
		ArrayList<String> animals = new ArrayList<String>();

		cars.add("BMW");
		cars.add("Benz");
		cars.add("Hyundai");
		cars.add("Tata");

		animals.add("Monkey");
		animals.add("Donkey");
		animals.add("Dog");

		Map<String, ArrayList<String>> dataList = new HashMap<String, ArrayList<String>>();
		dataList.put("cars", cars);
		dataList.put("animals", animals);
		List<String> states = new ArrayList<String>();
		states.add("-- Select One Country---");

		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		
		//model.addAttribute("product", prod);
		model.addAttribute("branches", branches);
		model.addAttribute("dataList", dataList);
		model.addAttribute("countries", countries);
	//	model.addAttribute("states", states);
		
	//	List<String> states = new ArrayList<String>();
		if (prod.getCountryName().equals("India")) {
			states.add("TN");
			states.add("TS");
			states.add("AP");
		}
		
		if (prod.getCountryName().equals("USA")) {
			states.add("CA");
			states.add("PL");
			states.add("NYK");
		}
		
		if (prod.getCountryName().equals("UK")) {
			states.add("LD");
			states.add("CL");
			states.add("CB");
		}
		model.addAttribute("states", states);

		return "product";
	}

}
