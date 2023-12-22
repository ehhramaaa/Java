/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis;

/**
 *
 * @author Admin
 */
public class Motor extends Kendaraan {
    private boolean punyaTiang;
    
    public Motor(String merek, String warna, boolean punyaTiang) { 
        super(merek, warna); 
        this.punyaTiang = punyaTiang; 
    }
    
    @Override public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Punya Tiang: " + (punyaTiang ? "Ya" : "Tidak")); 
    }
}
