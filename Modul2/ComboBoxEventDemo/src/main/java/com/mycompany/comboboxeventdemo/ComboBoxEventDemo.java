/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comboboxeventdemo;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ComboBoxEventDemo {

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> { 
    JFrame frame = new JFrame("ComboBox"); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setSize(300, 100); 
    frame.setLayout(new FlowLayout()); 
    JLabel label = new JLabel("Fakultas : "); 
    String[] fakultas = {"FIF", "FKB", "FIT", "FEB", "FTE", "FRI", "FIK"}; 
    JComboBox<String> comboBox = new JComboBox<>(fakultas); 
    JButton btnTampilkan = new JButton("Tampilkan"); 
    btnTampilkan.addActionListener(e -> { 
    JOptionPane.showMessageDialog(frame, "Fakultas yang dipilih: " + 
    comboBox.getSelectedItem()); 
    }); 
    frame.add(label); 
    frame.add(comboBox); 
    frame.add(btnTampilkan); 
    frame.setVisible(true); 
    });
    }
}
