/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Person {
    String name; 
    int age;
    
    // Metode untuk mengambil data Person 
    void inputPersonData() { 
        Scanner inp = new Scanner(System.in); 
        System.out.print("Masukkan nama: "); 
        name = inp.nextLine(); 
        System.out.print("Masukkan umur: "); 
        age = inp.nextInt(); }
    
    // Metode untuk menampilkan data Person 
    void displayPersonInfo() {
        System.out.println("Nama: " + name); 
        System.out.println("Umur: " + age); 
    }
}
