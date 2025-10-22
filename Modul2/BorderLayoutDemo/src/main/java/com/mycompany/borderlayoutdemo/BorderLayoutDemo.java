/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.borderlayoutdemo;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BorderLayoutDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
        JFrame frame = new JFrame("Contoh Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout(5,5));
        
        JButton btnNorth = new JButton("Posisi NORTH");
        JButton btnSouth = new JButton("Posisi SOUTH");
        JButton btnEast = new JButton("Posisi EAST");
        JButton btnWest = new JButton("Posisi WEST");
        JButton btnCenter = new JButton("Posisi CENTER");
        
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnCenter, BorderLayout.CENTER);
        frame.setVisible(true);
       });
    }
}
