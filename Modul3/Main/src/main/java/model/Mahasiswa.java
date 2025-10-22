/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    private String nama;
    private String jenisKelamin;
    
    public Mahasiswa(String nama, String jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getJeniskelamin(){
        return jenisKelamin;
    }
}
