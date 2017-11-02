package com.springhateoas.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.springhateoas.domain.Product;
import com.springhateoas.domain.Maker;

/**
 * Hard coded simulation of a Service + Data Access Layer.
 */
@Service
public class ProductService {

	private Map<String, Product> products;
	private Map<String, Maker> makers;

	/**
	 * Constructor populates the 'database' (i.e. Maps) of Makers and Products.
	 */
	public ProductService() {

		products = new HashMap<String, Product>();
		makers = new HashMap<String, Maker>();
		
		Maker maker1 = new Maker("Lenovo", "Lenovo");
		Maker maker2 = new Maker("Apple", "Apple");
		makers.put(maker1.getId(), maker1);
		makers.put(maker2.getId(), maker2);
		
		Product product1 = new Product("1", "Laptop", maker1, 2);
		Product product2 = new Product("2", "Keyboard", maker1, 3);
		Product product3 = new Product("3", "Mouse", maker1, 0);
		Product product4 = new Product("3", "MacBook Pro", maker2, 1);
		products.put(product1.getId(), product1);
		products.put(product2.getId(), product2);
		products.put(product3.getId(), product3);
		products.put(product4.getId(), product4);
		
	}

	public Collection<Product> getAllProducts() {
		return products.values();
	}

	public Product getProduct(final String id) {
		return products.get(id);
	}

	public Maker getMaker(final String id) {
		return makers.get(id);
	}
}