/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.latihan.uas;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ehhramaa
 */
public class UniversityManagement {
    private List<Student> daftarMahasiswa;

    public UniversityManagement() {
        daftarMahasiswa = new ArrayList<>();
    }
    
    public void daftarMahasiswa(Student mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
        mahasiswa.register();
    }
    
    public void tampilkanInformasiMahasiswa() {
        for (Student mahasiswa : daftarMahasiswa) {
            mahasiswa.displayInfo();
        }
    }
}
