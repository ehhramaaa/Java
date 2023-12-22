/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis.overload_and_write;

/**
 *
 * @author Admin
 */
public class Manajer extends Pegawai {
    private double tunjangan;
    
    public Manajer(String nama, double gajiPokok, double tunjangan) { 
        super(nama, gajiPokok); 
        this.tunjangan = tunjangan; 
    }
    
    @Override public double hitungGaji() { 
        // Gaji manajer = Gaji pokok + Tunjangan 
        return super.hitungGaji() + tunjangan; 
    }
    
    @Override public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Tunjangan: " + tunjangan); 
    }
}
