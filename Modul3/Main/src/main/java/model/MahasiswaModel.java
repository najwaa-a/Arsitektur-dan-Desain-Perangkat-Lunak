/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class MahasiswaModel {
    private final List<Mahasiswa> mahasiswaList;
    private final DefaultTableModel tableModel; 
 
    public MahasiswaModel() { 
        mahasiswaList = new ArrayList<>(); 
        tableModel = new DefaultTableModel(new String[]{"Nama", "Jenis Kelamin"}, 0); 
    } 
 
    public void addMahasiswa(String nama, String jenisKelamin) { 
        Mahasiswa mahasiswa = new Mahasiswa(nama, jenisKelamin); 
        mahasiswaList.add(mahasiswa); 
        tableModel.addRow(new Object[]{nama, jenisKelamin}); 
    } 
 
    public void removeMahasiswa(int index) { 
        if (index >= 0 && index < mahasiswaList.size()) { 
            mahasiswaList.remove(index); 
            tableModel.removeRow(index); 
        } 
    } 
 
    public void clearMahasiswa() { 
        mahasiswaList.clear(); 
        tableModel.setRowCount(0); 
    } 
 
    public DefaultTableModel getTableModel() { 
        return tableModel; 
    } 

}
