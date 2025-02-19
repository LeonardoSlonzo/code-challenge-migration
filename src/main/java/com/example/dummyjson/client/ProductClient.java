package com.example.dummyjson.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dummyjson.config.FooConfiguration;
import com.example.dummyjson.dto.Product;

@FeignClient(name = "Dummy", url = "https://dummyjson.com/", configuration = FooConfiguration.class)
public interface ProductClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "products")
	String getAllProduct();
	
	@RequestMapping(method = RequestMethod.GET, value = "products/{id}")
	Product getProductById(@PathVariable Long id);
	
}
