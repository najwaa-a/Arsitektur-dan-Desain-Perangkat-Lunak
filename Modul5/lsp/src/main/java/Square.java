/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Square {
    private int side; 
    public Square(int side) { 
    this.side = side; 
    }
    
    public void setSide(int side) {
        this.side = side;
    }
    
    public int getArea(){
        return side*side;
    }
}
