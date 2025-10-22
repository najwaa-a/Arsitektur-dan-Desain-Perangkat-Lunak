/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boxlayoutdemo;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BoxLayoutDemo {

    public static void main(String[] args) {
    SwingUtilities.invokeLater(()->{
    JFrame frame = new JFrame("BoxLayout Demo"); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setSize(300, 200); 
    JPanel panel = new JPanel(); 
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Layout ver kal 
    JButton btn1 = new JButton("Button 1"); 
    JButton btn2 = new JButton("Button 2"); 
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Long Named Button 4");
    JButton btn5 = new JButton("Button 5");
    btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
    btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
    btn3.setAlignmentX(Component.CENTER_ALIGNMENT);
    btn4.setAlignmentX(Component.CENTER_ALIGNMENT);
    btn5.setAlignmentX(Component.CENTER_ALIGNMENT);
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
