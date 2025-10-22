/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.PenjualanController;
import view.PenjualanView;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
        PenjualanView view = new PenjualanView(); 
        new PenjualanController(view);
    }
    
}
