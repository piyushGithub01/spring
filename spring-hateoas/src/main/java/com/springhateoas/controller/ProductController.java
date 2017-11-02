package com.springhateoas.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springhateoas.domain.Product;
import com.springhateoas.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Collection<Resource<Product>> getAllProducts() {
		
		Collection<Product> products = productService.getAllProducts();
		List<Resource<Product>> resources = new ArrayList<Resource<Product>>();
		for (Product product : products) {
			resources.add(getProductResource(product));
		}
		return resources;
		
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Resource<Product> getProduct(@PathVariable(value = "id") String id) {

		Product product = productService.getProduct(id);
		return getProductResource(product);

	}

	private Resource<Product> getProductResource(Product product) {

		Resource<Product> resource = new Resource<Product>(product);

		// Link to Product
		resource.add(linkTo(methodOn(ProductController.class).getProduct(product.getId())).withSelfRel());
		// Link to Maker
		resource.add(linkTo(methodOn(MakerController.class).getMaker(product.getMaker().getId())).withRel("product"));
		// Option to purchase Product
		if (product.getStockLevel() > 0) {
			resource.add(linkTo(methodOn(ProductController.class).purchaseAlbum(product.getId())).withRel("product.purchase"));
		}

		return resource;

	}

	@RequestMapping(value = "/product/purchase/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Resource<Product> purchaseAlbum(@PathVariable(value = "id") String id) {
		
		Product a = productService.getProduct(id);
		a.setStockLevel(a.getStockLevel() - 1);
		Resource<Product> resource = new Resource<Product>(a);
		resource.add(linkTo(methodOn(ProductController.class).getProduct(id)).withSelfRel());
		return resource;
		
	}
}
