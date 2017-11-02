package com.springhateoas.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springhateoas.domain.Maker;
import com.springhateoas.service.ProductService;

@Controller
public class MakerController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/maker/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Resource<Maker> getMaker(@PathVariable(value = "id") String id) {
		Maker a = productService.getMaker(id);
		Resource<Maker> resource = new Resource<Maker>(a);
		resource.add(linkTo(methodOn(MakerController.class).getMaker(id)).withSelfRel());
		return resource;
	}
}