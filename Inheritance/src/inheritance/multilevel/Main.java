/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.multilevel;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
    // Membuat objek CollegeStudent 
    CollageStudent collegeStudent = new CollageStudent();
    
    // Memanggil metode inputCollageStudentData()
    collegeStudent.inputCollageStudentData();
    
    // Menampilkan informasi lengkap mahasiswa perguruan tinggi 
    System.out.println("\nInformasi Mahasiswa Perguruan Tinggi:"); 
    collegeStudent.displayCollageStudentInfo();
    }
}
