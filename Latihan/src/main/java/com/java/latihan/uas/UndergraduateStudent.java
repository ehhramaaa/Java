/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.latihan.uas;

/**
 *
 * @author ehhramaa
 */
public class UndergraduateStudent extends Person implements Student {
    private final String kelas;
    
    public UndergraduateStudent(String npm, String name, int age, String kelas){
        super(npm, name, age);
        this.kelas = kelas;
    }
    
    @Override
    public void register() {
        System.out.println("\n|================================================|");
        System.out.println("|   Pendaftaran mahasiswa berhasil di lakukan    |");
        System.out.println("|================================================|");
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Informasi Mahasiswa");
        System.out.println("Npm  : " + getNpm());
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + getAge());
        System.out.println("Kelas: " + kelas + "\n");
    }
}
