/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.single;

import inheritance.Student;

/**
 *
 * @author Admin
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student(); 
        // Memanggil metode inputStudentData() 
        student.inputStudentData(); 
        // Menampilkan informasi lengkap siswa menggunakan metode displayStudentInfo() 
        System.out.println("\nInformasi Siswa:"); 
        student.displayStudentInfo();
    }
}
