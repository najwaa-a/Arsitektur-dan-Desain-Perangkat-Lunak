/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
        public static void main(String[] args) { 
        // Buat Rectangle 
        Rectangle rect = new Rectangle(5, 10); 
        System.out.println("Luas Rectangle (5x10): " + rect.getArea()); 
 
        rect.setWidth(7); 
        rect.setHeight(3); 
        System.out.println("Luas Rectangle setelah diubah (7x3): " + rect.getArea()); 
 
        // Buat Square 
        Square sq = new Square(6); 
        System.out.println("Luas Square (6x6): " + sq.getArea()); 
 
        sq.setSide(4); 
        System.out.println("Luas Square setelah diubah (4x4): " + sq.getArea()); 
    } 
}
