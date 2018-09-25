package com.app.model;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {

	private int id;
	private String name;
	private double price;
	private ProductType type;

	public Product(int id, String name, double price, ProductType type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	


	private static Random rand = new Random();
	public static List<Product> randomlyGenerate(int n) {
		return Stream.generate(() -> {
			int rn=rand.nextInt(100);
			String name = "ibm-employee-"+rn;
			return new Product(rn,name,rn*1000.00,ProductType.ELEC);
		}).limit(n).collect(Collectors.toList());
	}

}
