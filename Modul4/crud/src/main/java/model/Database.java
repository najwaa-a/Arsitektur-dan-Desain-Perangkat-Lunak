/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.Statement; 
import java.sql.SQLException; 

/**
 *
 * @author HP
 */
public class Database {
    static final String url = "jdbc:mysql://localhost:3306/moduladpl"; 
    static final String user = "root"; 
    static final String pass = ""; 
 
    static Connection conn; 
    public static Statement stmt; 
    public static ResultSet rs; 
 
    // Membuka koneksi 
    public void connect() { 
        try { 
            conn = DriverManager.getConnection(url, user, pass); 
            stmt = conn.createStatement(); 
            System.out.println("Koneksi berhasil!"); 
        } catch (Exception e) { 
            System.out.println("Koneksi Gagal: " + e.getMessage()); 
        } 
    } 
 
    // Eksekusi query INSERT, UPDATE, DELETE 
    public void query(String sql) { 
        try { 
            stmt.executeUpdate(sql); 
        } catch (SQLException ex) { 
            System.out.println("Kesalahan Query: " + ex.getMessage()); 
        } 
    } 
 
    // Eksekusi query SELECT 
    public ResultSet view(String sql) { 
        try { 
            rs = stmt.executeQuery(sql); 
        } catch (SQLException ex) { 
            System.out.println("Kesalahan View: " + ex.getMessage()); 
        } 
        return rs; 
    } 
 
    // Menutup koneksi 
    public void disconnect() { 
        try { 
            if (stmt != null) stmt.close(); 
            if (conn != null) conn.close(); 
            System.out.println("Koneksi ditutup."); 
        } catch (SQLException ex) { 
            System.out.println("Kesalahan saat menutup koneksi: " + ex.getMessage()); 
        } 
    } 
} 

