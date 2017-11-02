package com.springhateoas.domain;

public class Product {
	
	private final String id;
	private final String title;
	private final Maker maker;
	private int stockLevel;

	public Product(final String id, final String title, final Maker maker, int stockLevel) {
		this.id = id;
		this.title = title;
		this.maker = maker;
		this.stockLevel = stockLevel;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Maker getMaker() {
		return maker;
	}

	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
}