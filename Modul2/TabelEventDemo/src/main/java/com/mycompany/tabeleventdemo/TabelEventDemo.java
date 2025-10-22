/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabeleventdemo;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TabelEventDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
        JFrame frame = new JFrame("Tabel"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(400, 250); 
        frame.setLayout(new FlowLayout()); 
        JLabel labelNama = new JLabel("Nama : "); 
        JTextField textNama = new JTextField(15); 
        JLabel labelGender = new JLabel("Jenis Kelamin : "); 
        JTextField textGender = new JTextField(15); 
        DefaultTableModel model = new DefaultTableModel(new String[]{"Nama", 
        "Jenis Kelamin"}, 0); 
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table); 
        JButton btnSimpan = new JButton("Simpan"); 
        JButton btnHapus = new JButton("Hapus"); 
        JButton btnClear = new JButton("Clear"); 
        btnSimpan.addActionListener(e -> model.addRow(new 
        Object[]{textNama.getText(), textGender.getText()})); 
        btnHapus.addActionListener(e -> 
        model.removeRow(table.getSelectedRow())); 
        btnClear.addActionListener(e -> model.setRowCount(0)); 
        frame.add(labelNama); 
        frame.add(textNama); 
        frame.add(labelGender); 
        frame.add(textGender); 
        frame.add(btnSimpan); 
        frame.add(btnHapus); 
        frame.add(btnClear); 
        frame.add(scrollPane); 
        frame.setVisible(true); 
    }); 
    }
}
