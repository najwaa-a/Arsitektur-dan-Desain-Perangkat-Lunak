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
        
        ReportGenerator report = new ReportGenerator();
        FileSaver saver = new FileSaver();
        EmailSender sender = new EmailSender();
        
        
        report.generateReport();
        saver.saveToFile("laporan_penjualan.pdf");
        sender.sendEmail("user@example.com");
    }
}
