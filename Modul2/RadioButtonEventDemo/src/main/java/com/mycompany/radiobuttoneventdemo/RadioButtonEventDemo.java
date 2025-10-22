/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiobuttoneventdemo;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class RadioButtonEventDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
        JFrame frame = new JFrame("Radio Bu on"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(400, 100); 
        frame.setLayout(new FlowLayout()); 
        JLabel label = new JLabel("Jenis Kelamin : "); 
        JRadioButton rbLaki = new JRadioButton("Laki-Laki"); 
        JRadioButton rbPerempuan = new JRadioButton("Perempuan"); 
        ButtonGroup group = new ButtonGroup(); 
        group.add(rbLaki); 
        group.add(rbPerempuan); 
        JButton btnTampilkan = new JButton("Tampilkan"); 
        btnTampilkan.addActionListener(e -> { 
        String pilihan = rbLaki.isSelected() ? "Laki-Laki" : 
        rbPerempuan.isSelected() ? "Perempuan" : "Tidak ada yang dipilih"; 
        JOptionPane.showMessageDialog(frame, "Anda memilih: " + pilihan); 
        }); 
        frame.add(label); 
        frame.add(rbLaki); 
        frame.add(rbPerempuan); 
        frame.add(btnTampilkan); 
        frame.setVisible(true); 
        }); 
    }
}
