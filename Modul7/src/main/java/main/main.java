/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import model.BankTransferPayment;
import model.CreditCardPayment;
import model.EWalletPayment;
import model.Payment;
import service.PaymentProcessor;
import service.TransactionHistory;


public class main {
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);   
    TransactionHistory history = new TransactionHistory(); 
    PaymentProcessor processor = new PaymentProcessor(history); 
    Payment creditCard = new CreditCardPayment(); 
    Payment eWallet = new EWalletPayment(); 
    Payment bankTransfer = new BankTransferPayment(); 
    
    processor.processTransaction("TXN001", 100.0, creditCard); 
    processor.processTransaction("TXN002", 200.0, eWallet); 
    processor.processTransaction("TXN003", 300.0, bankTransfer); 
   
    history.showTransactions(); 

    System.out.println("\nIngin melihat riwayat transaksi lagi? (y/n)"); 
    String input = scanner.nextLine(); 
    if (input.equalsIgnoreCase("y")) { 
    history.showTransactions(); 
    } 
    System.out.println("Terima kasih telah menggunakan sistem pembayaran!"); 
    scanner.close(); 
    }
}
