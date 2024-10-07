package com.hanuman.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanuman.model.products;
import com.hanuman.service.service;



@RestController
public class controller {
	
	@Autowired
	service service ;
	@GetMapping("/products")
	public List<products> productList(){
		List<products>products= service.getallproducts();
		return products;
	}

}
