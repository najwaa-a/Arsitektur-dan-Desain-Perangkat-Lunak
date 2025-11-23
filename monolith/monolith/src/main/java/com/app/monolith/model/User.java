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
public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 

    @Column(nullable = false) 
    private String name; 

    @Column(nullable = false, unique = true) 
    private String email; 

    public User() {} 

    public User(String name, String email) { 
    this.name = name; 
    this.email = email; 
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
    public String getEmail() { 
    return email; 
    } 
    public void setEmail(String email) { 
    this.email = email; 
    } 

}
