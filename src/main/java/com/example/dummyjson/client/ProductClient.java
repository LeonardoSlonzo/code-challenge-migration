package com.example.dummyjson.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.dummyjson.config.FooConfiguration;
import com.example.dummyjson.dto.Product;
import com.example.dummyjson.dto.ProductList;

@FeignClient(name = "Dummy", url = "https://dummyjson.com/", configuration = FooConfiguration.class)
public interface ProductClient {
	
	@GetMapping("products")
	ProductList getAllProduct();
	
	@GetMapping("products/{id}")
	Product getProductById(@PathVariable Long id);
}