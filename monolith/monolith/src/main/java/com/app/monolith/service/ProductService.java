/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.monolith.service;

import com.app.monolith.model.Product;
import com.app.monolith.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */

@Service
public class ProductService {
    @Autowired 
    private ProductRepository productRepository; 


    public List<Product> getAllProducts() { 
    return productRepository.findAll(); 
    } 


    public Optional<Product> getProductById(Long id) { 
    return productRepository.findById(id); 
    } 


    public Product createProduct(Product product) { 
    return productRepository.save(product); 
    } 


    public void deleteProduct(Long id) { 
    productRepository.deleteById(id); 
    }
}
