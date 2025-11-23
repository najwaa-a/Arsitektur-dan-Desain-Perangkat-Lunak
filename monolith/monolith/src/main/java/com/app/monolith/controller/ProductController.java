/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.monolith.controller;

import com.app.monolith.model.Product;
import com.app.monolith.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */

@RestController
@RequestMapping("/products")

public class ProductController {
    @Autowired 
    private ProductService productService; 


    @GetMapping 
    public List<Product> getAllProducts() { 
    return productService.getAllProducts(); 
    } 


    @PostMapping 
    public Product createProduct(@RequestBody Product product) { 
    return productService.createProduct(product); 
    } 
     
}
