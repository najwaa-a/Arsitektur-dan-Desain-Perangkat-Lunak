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
        DiscountCalculator calculator = new DiscountCalculator(); 
 
        double price = 100000; 
 
        Discount memberDiscount = new MemberDiscount(); 
        double memberResult = calculator.calculateDiscount(memberDiscount, price); 
        System.out.println("Harga setelah diskon Member: " + (price - memberResult)); 
 
        Discount vipDiscount = new VIPDiscount(); 
        double vipResult = calculator.calculateDiscount(vipDiscount, price); 
        System.out.println("Harga setelah diskon VIP: " + (price - vipResult)); 
    }
}
