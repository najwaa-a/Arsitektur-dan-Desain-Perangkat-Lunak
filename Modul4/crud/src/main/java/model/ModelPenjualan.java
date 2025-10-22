/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 

/**
 *
 * @author HP
 */
public class ModelPenjualan {
    private String kode; 
    private String nama; 
    private int harga; 
 
    // Constructor 
    public ModelPenjualan(String kode, String nama, int harga) { 
        this.kode = kode; 
        this.nama = nama; 
        this.harga = harga; 
    } 
 
    // Ge er & Se er 
    public String getKode() { return kode; } 
    public void setKode(String kode) { this.kode = kode; } 
    public String getNama() { return nama; } 
    public void setNama(String nama) { this.nama = nama; } 
    public int getHarga() { return harga; } 
    public void setHarga(int harga) { this.harga = harga; } 
 
    // READ (ambil semua data) 
    public static List<ModelPenjualan> getAllPenjualan() { 
        List<ModelPenjualan> daftarPenjualan = new ArrayList<>(); 
        Database db = new Database(); 
        db.connect(); 
        ResultSet rs = db.view("SELECT * FROM tabel_penjualan"); 
        try { 
            while (rs.next()) { 
                daftarPenjualan.add(new ModelPenjualan( 
                        rs.getString("kode"), 
                        rs.getString("nama"), 
                        rs.getInt("harga") 
                )); 
            } 
        } catch (SQLException e) { 
            System.out.println("Kesalahan saat membaca data: " + e.getMessage()); 
        } 
        db.disconnect(); 
        return daftarPenjualan; 
    } 
 
    // CREATE / UPDATE (save) 
    public void save() { 
        Database db = new Database(); 
        db.connect(); 
        ResultSet rs = db.view("SELECT * FROM tabel_penjualan WHERE kode='" + 
kode + "'"); 
        try { 
            if (rs.next()) { 
                // UPDATE 
                db.query("UPDATE tabel_penjualan SET nama='" + nama + "', harga=" 
+ harga + 
                         " WHERE kode='" + kode + "'"); 
            } else { 
                // INSERT 
                db.query("INSERT INTO tabel_penjualan (kode, nama, harga) VALUES ('" + 
                         kode + "', '" + nama + "', " + harga + ")"); 
            } 
        } catch (SQLException e) { 
            System.out.println("Kesalahan: " + e.getMessage()); 
        } 
        db.disconnect(); 
    } 
 
    // DELETE 
    public static void delete(String kode) { 
        Database db = new Database(); 
        db.connect(); 
        db.query("DELETE FROM tabel_penjualan WHERE kode='" + kode + "'"); 
        db.disconnect(); 
    } 
} 

