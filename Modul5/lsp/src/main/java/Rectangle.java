/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Rectangle {
    private int width, height; 
    public Rectangle(int width, int height) { 
    this.width = width; 
    this.height = height; 
    } 
    public void setWidth(int width) { 
    this.width = width; 
    } 
    public void setHeight(int height) { 
    this.height = height; 
    } 
 
    public int getArea() { 
    return width * height; 
    } 
}
