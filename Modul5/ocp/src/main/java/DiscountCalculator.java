/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double price) {
        return discount.applyDiscount(price);
    }
}
