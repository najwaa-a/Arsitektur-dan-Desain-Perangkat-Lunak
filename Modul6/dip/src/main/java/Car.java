/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Car {
    private IFuelinjector fuelInjector; 
 
        // Dependency Injec on melalui konstruktor 
         public Car(IFuelinjector fuelInjector) { 
                  this.fuelInjector = fuelInjector; 
         } 
 
          public void start() { 
                  fuelInjector.injectFuel(); 
                  System.out.println("Mobil dinyalakan."); 
          } 
}
