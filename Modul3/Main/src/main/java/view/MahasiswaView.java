/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class MahasiswaView extends JFrame {
    private final JTextField textNama; 
    private final JTextField textGender; 
    private final JButton btnSimpan; 
    private final JButton btnHapus; 
    private final JButton btnClear; 
    private final JTable table; 
    private final JScrollPane scrollPane; 
 
    public MahasiswaView() { 
        setTitle("Form Mahasiswa"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(400, 250); 
        setLayout(new FlowLayout()); 
 
        // Label dan Input Field 
        JLabel labelNama = new JLabel("Nama : "); 
        textNama = new JTextField(15); 
 
        JLabel labelGender = new JLabel("Jenis Kelamin : "); 
        textGender = new JTextField(15); 
 
        // Tombol 
        btnSimpan = new JButton("Simpan"); 
        btnHapus = new JButton("Hapus"); 
        btnClear = new JButton("Clear"); 
 
        // Tabel 
        table = new JTable(); 
        scrollPane = new JScrollPane(table); 
 
        // Menambahkan Komponen ke Frame 
        add(labelNama); 
        add(textNama); 
        add(labelGender); 
        add(textGender); 
        add(btnSimpan); 
        add(btnHapus); 
        add(btnClear); 
        add(scrollPane); 
 
        setVisible(true); 
    } 
 
    // Ge er 
    public JTextField getTextNama() { 
        return textNama; 
    } 
 
    public JTextField getTextGender() { 
        return textGender; 
    } 
 
    public JButton getBtnSimpan() { 
        return btnSimpan; 
    } 
 
    public JButton getBtnHapus() { 
        return btnHapus; 
    } 
 
    public JButton getBtnClear() { 
        return btnClear; 
    } 
 
    public JTable getTable() { 
        return table; 
    }
}
