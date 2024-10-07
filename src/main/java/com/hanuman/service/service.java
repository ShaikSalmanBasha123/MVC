package com.hanuman.service;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

import com.hanuman.model.products;

@org.springframework.stereotype.Service

public class service {
	
	List<products> Product=Arrays.asList(new products(101,"SAMSUNG",10000), new products(102,"REALME",11000), new products(103,"MI",12000));
	
	public List<products> getallproducts() {
	return Product;

}}
