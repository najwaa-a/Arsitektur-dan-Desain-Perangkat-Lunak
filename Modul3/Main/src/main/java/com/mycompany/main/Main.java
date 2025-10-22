/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import controller.MahasiswaController; 
import model.MahasiswaModel; 
import view.MahasiswaView; 

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) { 
    MahasiswaModel model = new MahasiswaModel(); 
    MahasiswaView view = new MahasiswaView(); 
    new MahasiswaController(model, view); 
}
}
