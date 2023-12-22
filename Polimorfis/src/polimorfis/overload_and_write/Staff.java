/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis.overload_and_write;

/**
 *
 * @author Admin
 */
public class Staff extends Pegawai {
    private double bonus;
    
    public Staff(String nama, double gajiPokok, double bonus) { 
        super(nama, gajiPokok); 
        this.bonus = bonus; 
    }
    
    @Override public double hitungGaji() { 
        // Gaji staf = Gaji pokok + Bonus 
        return super.hitungGaji() + bonus; 
    }
    
    @Override public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Bonus: " + bonus); 
    }
}
