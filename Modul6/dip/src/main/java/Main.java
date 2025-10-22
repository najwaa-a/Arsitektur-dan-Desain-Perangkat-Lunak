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
         // Menggunakan FuelInjector sebagai dependency 
        IFuelinjector fuelInjector = new Fuelinjector(); 
        Car myCar = new Car(fuelInjector); 
        myCar.start(); 
 
       // Menggunakan ElectricFuelInjector sebagai dependency 
       IFuelinjector electricFuelInjector = new ElectriclFuelinjector(); 
       Car electricCar = new Car(electricFuelInjector); 
       electricCar.start(); 
    }
}
