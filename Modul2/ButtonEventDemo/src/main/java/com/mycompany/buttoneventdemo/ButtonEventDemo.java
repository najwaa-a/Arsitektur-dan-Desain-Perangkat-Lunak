/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buttoneventdemo;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ButtonEventDemo {

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> { 
    JFrame frame = new JFrame("Button"); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setSize(300, 150); 
    frame.setLayout(new FlowLayout(FlowLayout.CENTER)); 
    JLabel label = new JLabel("Warna Yang Dipilih : "); 
    JLabel labelWarna = new JLabel(""); 
    JButton btnMerah = new JButton("Merah"); 
    JButton btnBiru = new JButton("Biru"); 
    btnMerah.addActionListener(e -> labelWarna.setText("Merah")); 
    btnBiru.addActionListener(e -> labelWarna.setText("Biru")); 
    frame.add(btnMerah); 
    frame.add(btnBiru); 
    frame.add(label); 
    frame.add(labelWarna); 
    frame.setVisible(true); 
    });
    }
}
