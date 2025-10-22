/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdialogexample;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JDialogExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
        JFrame frame = new JFrame("Frame Utama");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JDialog dialog = new JDialog(frame, "Contoh Dialog", true);
        dialog.setSize(250, 150);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
        });
    }
}
