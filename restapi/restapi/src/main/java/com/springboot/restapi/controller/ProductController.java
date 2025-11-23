/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboot.restapi.controller;

import com.springboot.restapi.model.Product;
import com.springboot.restapi.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    private ProductService service; 
 
    @GetMapping 
    public List<Product> getAll() { 
        return service.getAllProducts(); 
    } 
 
    @GetMapping("/{id}") 
    public ResponseEntity<Product> getById(@PathVariable Long id) { 
        Optional<Product> product = service.getProductById(id); 
        return product.map(ResponseEntity::ok) 
                      .orElseGet(() -> ResponseEntity.notFound().build()); 
    } 
 
    @PostMapping 
    public Product create(@RequestBody Product product) { 
        return service.saveProduct(product); 
    } 
 
    @PutMapping("/{id}") 
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody 
        Product productDetails) { 
        Product updated = service.updateProduct(id, productDetails); 
        return updated != null ? ResponseEntity.ok(updated) : 
        ResponseEntity.notFound().build(); 
    } 
 
    @DeleteMapping("/{id}") 
    public ResponseEntity<Void> delete(@PathVariable Long id) { 
        service.deleteProduct(id); 
        return ResponseEntity.noContent().build(); 
    }
}
