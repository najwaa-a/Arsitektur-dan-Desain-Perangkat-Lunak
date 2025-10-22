/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardlayoutdemo;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CardLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("CardLayout Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            
            JPanel cardPanel = new JPanel();
            CardLayout cardLayout = new CardLayout();
            cardPanel.setLayout(cardLayout);
            
            JPanel panel1 = new JPanel();
            JButton btnNext = new JButton("Ke Panel 2"); 
            panel1.add(new JButton("Tombol 1")); 
            panel1.add(new JButton("Tombol 2")); 
            panel1.add(btnNext);
            
            JPanel panel2 = new JPanel(); 
            JTextField textField = new JTextField(15); 
            JButton btnBack = new JButton("Kembali"); 
            panel2.add(new JLabel("Masukkan Teks:")); 
            panel2.add(textField); 
            panel2.add(btnBack); 
            
            cardPanel.add(panel1, "Panel 1");
            cardPanel.add(panel2, "Panel 1");
            
            btnNext.addActionListener(e -> cardLayout.show(cardPanel, "Panel 2")); 
            btnBack.addActionListener(e -> cardLayout.show(cardPanel, "Panel 1")); 
            
            frame.add(cardPanel); 
            frame.setVisible(true); 
        });
    }
}
