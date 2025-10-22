/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MultiFunctionPrinter implements IPrinter, IScanner, IFax{
        public void print(String document) { 
                 System.out.println("Mencetak dokumen: " + document); 
        }
        
        public void scan(String document) { 
                 System.out.println("Memindai dokumen: " + document); 
          } 
 
         public void fax(String document) { 
         System.out.println("Mengirim fax: " + document); 
          } 
}
        
