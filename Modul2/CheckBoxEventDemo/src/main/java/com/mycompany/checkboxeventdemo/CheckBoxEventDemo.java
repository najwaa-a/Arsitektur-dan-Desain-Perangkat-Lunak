/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkboxeventdemo;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class CheckBoxEventDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
        JFrame frame = new JFrame("Checkbox"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(400, 150); 
        frame.setLayout(new FlowLayout()); 
        JLabel label = new JLabel("Media Sosial Yang Dimiliki"); 
        JCheckBox cbFacebook = new JCheckBox("Facebook"); 
        JCheckBox cbTwitter = new JCheckBox("Twitter"); 
        JCheckBox cbInstagram = new JCheckBox("Instagram"); 
        JCheckBox cbLine = new JCheckBox("Line"); 
        JButton btnTampilkan = new JButton("Tampilkan"); 
        btnTampilkan.addActionListener(e -> { 
        StringBuilder hasil = new StringBuilder("Anda memiliki: "); 
        if (cbFacebook.isSelected()) hasil.append("Facebook "); 
        if (cbTwitter.isSelected()) hasil.append("Twitter "); 
        if (cbInstagram.isSelected()) hasil.append("Instagram "); 
        if (cbLine.isSelected()) hasil.append("Line "); 
        JOptionPane.showMessageDialog(frame, hasil.toString()); 
        }); 
        frame.add(label); 
        frame.add(cbFacebook); 
        frame.add(cbTwitter); 
        frame.add(cbInstagram); 
        frame.add(cbLine); 
        frame.add(btnTampilkan); 
        frame.setVisible(true); 
        });
    }
}
