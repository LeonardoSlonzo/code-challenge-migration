package com.example.dummyjson.service;

import com.example.dummyjson.client.ProductClient;
import com.example.dummyjson.dto.Product;
import com.example.dummyjson.dto.ProductList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

//    private final String BASE_URL = "https://dummyjson.com/products";

    @Autowired
    private ProductClient productClient;
    
    ObjectMapper mapper = new ObjectMapper();

    public ProductList getAllProducts() throws JsonMappingException, JsonProcessingException {
//        Product[] products = productClient.getAllProduct();

        return mapper.readValue(productClient.getAllProduct(), ProductList.class);
    }

    public Product getProductById(Long id) {
        return productClient.getProductById(id);
    }
}
