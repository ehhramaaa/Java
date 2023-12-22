/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis;

/**
 *
 * @author Admin
 */
public class Kendaraan {
    protected String merek; 
    protected String warna;
    
    public Kendaraan(String merek, String warna) { 
        this.merek = merek; 
        this.warna = warna; 
    }
    
    public void tampilkanInfo() { 
        System.out.println("Merek: " + merek); 
        System.out.println("Warna: " + warna); 
    }
}
