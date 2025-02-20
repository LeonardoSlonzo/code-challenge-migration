package com.example.dummyjson.service;

import com.example.dummyjson.client.ProductClient;
import com.example.dummyjson.dto.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductClient productClient;

    public List<Product> getAllProducts() throws JsonMappingException, JsonProcessingException {
        return productClient.getAllProduct().getProducts();
    }

    public Product getProductById(Long id) {
        return productClient.getProductById(id);
    }
}
