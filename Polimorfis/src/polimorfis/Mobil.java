/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis;

/**
 *
 * @author Admin
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    public Mobil(String merek, String warna, int jumlahPintu) { 
        super(merek, warna); 
        this.jumlahPintu = jumlahPintu; 
    }
    
    @Override public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Jumlah Pintu: " + jumlahPintu); 
    }
}
