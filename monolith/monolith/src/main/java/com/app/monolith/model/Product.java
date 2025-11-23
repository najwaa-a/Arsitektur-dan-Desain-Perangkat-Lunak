/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.monolith.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author HP
 */
@Entity
public class Product {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 

    @Column(nullable = false) 
    private String name; 

    @Column(nullable = false) 
    private double price; 

    public Product() {} 


    public Product(String name, double price) { 
    this.name = name; 
    this.price = price; 
    } 
    public Long getId() { 
    return id; 
    } 
    public void setId(Long id) { 
    this.id = id; 
    } 
    public String getName() { 
    return name; 
    }
    public void setName(String name) { 
    this.name = name; 
    } 
    public double getPrice() { 
    return price; 
    } 
    public void setPrice(double price) { 
    this.price = price; 
    } 
}
