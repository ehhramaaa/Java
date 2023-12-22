/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfis;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Polimorfis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Input data Mobil"); 
        System.out.print("Merek: "); 
        String merekMobil = inp.nextLine(); 
        System.out.print("Warna: "); 
        String warnaMobil = inp.nextLine(); 
        System.out.print("Jumlah Pintu: "); 
        int jumlahPintuMobil = inp.nextInt();
        
        //inp.nextLine(); // Membersihkan buffer System.out.print("Merek: ");
        
        System.out.println("\nInput data Sepeda Motor:");
        String merekMotor = inp.nextLine(); 
        System.out.print("Warna: "); 
        String warnaMotor = inp.nextLine(); 
        System.out.print("Punya Tiang (true/false): "); 
        boolean punyaTiangMotor = inp.nextBoolean();
        
        // Membuat objek SepedaMotor menggunakan konstruktor overload 
        Mobil mobil = new Mobil(merekMobil, warnaMobil, jumlahPintuMobil);
        Motor sepedaMotor = new Motor(merekMotor, warnaMotor, punyaTiangMotor); 
        // Menampilkan informasi kendaraan (polimorfisme runtime) 
        System.out.println("\nInformasi Mobil:"); 
        mobil.tampilkanInfo(); 
        System.out.println("\nInformasi Sepeda Motor:"); 
        sepedaMotor.tampilkanInfo();
    }
}
