package com.example.dummyjson;

import com.example.dummyjson.controller.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class ProductControllerTest extends DummyJsonClientApplicationTest{

    private MockMvc mockMvc;

    @Autowired
    private ProductController productController;

    @Before
    public void setUp(){
        this.mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    @Test
    public void getAllProducts() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/products"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void getProductById() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/products/1"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
