/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfis.overload_and_write;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Input data Staf:"); 
        System.out.print("Nama: "); 
        String namaStaf = inp.nextLine(); 
        System.out.print("Gaji Pokok: "); 
        double gajiPokokStaf = inp.nextDouble(); 
        System.out.print("Bonus: "); 
        double bonusStaf = inp.nextDouble();
        
        Staff staf = new Staff(namaStaf, gajiPokokStaf, bonusStaf); 
        System.out.println("\nInput data Manajer:"); 
        System.out.print("Nama: "); inp.nextLine(); 
        // Membersihkan buffer 
        String namaManajer = inp.nextLine(); 
        System.out.print("Gaji Pokok: "); 
        double gajiPokokManajer = inp.nextDouble(); 
        System.out.print("Tunjangan: ");
        double tunjanganManajer = inp.nextDouble();
        
        Manajer manajer = new Manajer(namaManajer, gajiPokokManajer, tunjanganManajer);
        
        System.out.println("\nInformasi Staf:"); 
        staf.tampilkanInfo(); 
        System.out.println("Total Gaji: " + staf.hitungGaji());
        
        System.out.println("\nInformasi Manajer:"); 
        manajer.tampilkanInfo(); 
        System.out.println("Total Gaji: " + manajer.hitungGaji());
        
    }
}
