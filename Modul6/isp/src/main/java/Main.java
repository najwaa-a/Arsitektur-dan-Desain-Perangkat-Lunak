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
        // Pakai BasicPrinter (hanya bisa print) 
        IPrinter basicPrinter = new BasicPrinter(); 
        basicPrinter.print("Laporan Keuangan.pdf"); 
 
        System.out.println("----------------------"); 
 
        // Pakai Mul Func onPrinter (bisa print, scan, fax) 
        MultiFunctionPrinter mfp = new MultiFunctionPrinter(); 
        mfp.print("Kontrak Kerja.docx"); 
        mfp.scan("Iden tas Karyawan.png"); 
        mfp.fax("Surat Perjanjian.pdf"); 
    }
}
