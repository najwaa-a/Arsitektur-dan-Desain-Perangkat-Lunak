/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ModelPenjualan; 
import view.PenjualanView; 
 
import javax.swing.*; 
import javax.swing.table.DefaultTableModel; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class PenjualanController {
     private final PenjualanView view; 
 
    public PenjualanController(PenjualanView view) { 
        this.view = view; 
        loadTable(); 
 
        // Listener tombol Simpan 
        view.addSimpanListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                String kode = view.getTextKode().getText(); 
                String nama = view.getTextNama().getText(); 
                int harga = Integer.parseInt(view.getTextHarga().getText()); 
 
                // Simpan ke database 
                new ModelPenjualan(kode, nama, harga).save(); 
                loadTable(); 
            } 
        }); 
 
        // Listener tombol Hapus 
        view.addHapusListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                int selectedRow = view.getTable().getSelectedRow(); 
                if (selectedRow != -1) { 
                    String kode = (String) 
view.getTableModel().getValueAt(selectedRow, 0); 
                    ModelPenjualan.delete(kode); 
                    loadTable(); 
                } else { 
                    JOptionPane.showMessageDialog(view, "Pilih data yang ingin dihapus!"); 
                } 
            } 
        }); 
    } 
 
    // Muat ulang tabel dari database 
    private void loadTable() { 
        DefaultTableModel tableModel = view.getTableModel(); 
        tableModel.setRowCount(0); 
        for (ModelPenjualan p : ModelPenjualan.getAllPenjualan()) { 
            tableModel.addRow(new Object[]{p.getKode(), p.getNama(), 
p.getHarga()}); 
        } 
    } 
}

