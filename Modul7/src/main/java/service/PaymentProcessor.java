/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Payment;
import model.Transaction;

/**
 *
 * @author HP
 */
public class PaymentProcessor {
    private TransactionHistory transactionHistory; 
    public PaymentProcessor(TransactionHistory transactionHistory) { 
    this.transactionHistory = transactionHistory; 
    } 
    
    public void processTransaction(String id, double amount, Payment paymentMethod){ 
    Transaction transaction = new Transaction(id, amount, paymentMethod); 
    transaction.processPayment(); 
    transactionHistory.addTransaction(transaction); 
    } 
}
