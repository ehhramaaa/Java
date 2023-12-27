/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konsep.kasus.uas1;

/**
 *
 * @author Murnawan
 */
import java.util.Scanner;

public class UndergraduateStudent extends Person implements Student {
    String className;

    UndergraduateStudent(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    @Override
    public void register() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Registrasi Mahasiswa Program Sarjana:");
        System.out.print("Masukkan Nama: ");
        name = inp.nextLine();
        System.out.print("Masukkan Umur: ");
        age = inp.nextInt();
        inp.nextLine(); 
        System.out.print("Masukkan Nama Kelas: ");
        className = inp.nextLine();
        System.out.println("Registrasi Mahasiswa Program Sarjana Sukses!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Informasi Mahasiswa Program Sarjana:");
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);
        System.out.println("Kelas: " + className);
    }
}
