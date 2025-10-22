/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flowlayoutdemo;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
        
        JFrame frame = new JFrame("FlowLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(350, 200); 
        
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 20);
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Long-Named Button 4");
        JButton btn5 = new JButton("Button 5");
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        
        frame.add(panel);
        frame.setVisible(true);
        });
    }
}
