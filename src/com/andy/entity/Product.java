package com.andy.entity;

public class Product {
	private String code;
	private String name;
	private int price;
	private String producer;

	public Product() {}

	public Product(String code, String name, int price, String producer) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.producer = producer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + "name=" + name + ", price=" + price + ", producer=" + producer + "]";
	}

}
