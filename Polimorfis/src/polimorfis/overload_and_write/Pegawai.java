/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis.overload_and_write;

/**
 *
 * @author Admin
 */
public class Pegawai {
    protected String nama; 
    protected double gajiPokok;
    
    public Pegawai(String nama, double gajiPokok) { 
        this.nama = nama; 
        this.gajiPokok = gajiPokok; 
    }
    
    public double hitungGaji() { 
        return gajiPokok; 
    }
    
    public void tampilkanInfo() { 
        System.out.println("Nama: " + nama); 
        System.out.println("Gaji Pokok: " + gajiPokok); 
    }
}
