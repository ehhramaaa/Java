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
public class Student extends Person {
    // Atribut kelas Student 
    String className;
    
    // Metode untuk mengambil data Student 
    public void inputStudentData() { 
        Scanner inp = new Scanner(System.in);
        
        // Memanggil metode inputPersonData() dari kelas induk 
        inputPersonData(); 
        System.out.print("Masukkan nama kelas: "); 
        className = inp.nextLine();
    } 

    // Metode untuk menampilkan data lengkap Student 
    public void displayStudentInfo() {
        // Memanggil metode displayPersonInfo() dari kelas induk 
        displayPersonInfo();
        
        System.out.println("Kelas: " + className);
    }
}