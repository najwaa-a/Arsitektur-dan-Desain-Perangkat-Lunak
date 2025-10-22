/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MahasiswaModel; 
import view.MahasiswaView; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class MahasiswaController {
    private final MahasiswaModel model; 
    private final MahasiswaView view; 
 
    public MahasiswaController(MahasiswaModel model, MahasiswaView view) { 
        this.model = model; 
        this.view = view; 
 
         
        view.getTable().setModel(model.getTableModel()); 
 
         
        view.getBtnSimpan().addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                String nama = view.getTextNama().getText(); 
                String jenisKelamin = view.getTextGender().getText(); 
                model.addMahasiswa(nama, jenisKelamin); 
 
                 
                view.getTextNama().setText(""); 
                view.getTextGender().setText(""); 
            } 
        }); 
 
         
        view.getBtnHapus().addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                int selectedRow = view.getTable().getSelectedRow(); 
                if (selectedRow >= 0) { // cek supaya dak error 
                    model.removeMahasiswa(selectedRow); 
                } 
            } 
        }); 
 
       
        view.getBtnClear().addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                model.clearMahasiswa(); 
            } 
        }); 
    }
}
