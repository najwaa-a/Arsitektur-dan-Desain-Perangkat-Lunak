/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gridlayoutdemo;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.SwingUtilities;

public class GridLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3, 5, 5));
        
        JButton btn1 = new JButton("Button 1"); 
        JButton btn2 = new JButton("Button 2"); 
        JButton btn3 = new JButton("Button 3"); 
        JButton btn4 = new JButton("Button 4"); 
        JButton btn5 = new JButton("Button 5"); 
        JButton btn6 = new JButton("Button 6"); 
        panel.add(btn1); 
        panel.add(btn2); 
        panel.add(btn3); 
        panel.add(btn4); 
        panel.add(btn5); 
        panel.add(btn6); 
        frame.add(panel);
        frame.setVisible(true); 
        });
    }
}
