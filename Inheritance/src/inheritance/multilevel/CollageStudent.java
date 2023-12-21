/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.multilevel;
import inheritance.Student;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class CollageStudent extends Student {
    // Atribut kelas CollegeStudent 
    String major;
    
    // Metode untuk mengambil data CollegeStudent 
    void inputCollageStudentData() {
        Scanner inp = new Scanner(System.in); 
        // Memanggil metode inputStudentData() dari kelas induk 
        inputStudentData();
        
        System.out.print("Masukkan jurusan: "); 
        major = inp.nextLine();
    }
    
    // Metode untuk menampilkan data CollegeStudent 
    void displayCollageStudentInfo() {
        // Memanggil metode displayStudentInfo() dari kelas induk 
        displayStudentInfo(); 
        System.out.println("Jurusan: " + major);
    }
}
