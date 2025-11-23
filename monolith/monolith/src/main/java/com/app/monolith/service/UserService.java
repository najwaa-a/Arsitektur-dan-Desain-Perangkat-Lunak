/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.monolith.service;

import com.app.monolith.model.User;
import com.app.monolith.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */

@Service
public class UserService {
    @Autowired 
    private UserRepository userRepository; 


    public List<User> getAllUsers() { 
    return userRepository.findAll(); 
    } 


    public Optional<User> getUserById(Long id) { 
    return userRepository.findById(id); 
    } 


    public User createUser(User user) { 
    return userRepository.save(user); 
    } 


    public void deleteUser(Long id) { 
    userRepository.deleteById(id); 
    }
}
