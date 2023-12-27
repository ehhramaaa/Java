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

public class GraduateStudent extends Person implements Student {
    String program;

    GraduateStudent(String name, int age, String program) {
        super(name, age);
        this.program = program;
    }

    @Override
    public void register() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Registrasi Mahasiswa Magister:");
        System.out.print("Masukkan Nama: ");
        name = inp.nextLine();
        System.out.print("Masukkan Umur: ");
        age = inp.nextInt();
        inp.nextLine(); 
        System.out.print("Masukkan Program: ");
        program = inp.nextLine();
        System.out.println("Registrasi Mahasiswa Magister Berhasil!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Informasi Mahasiswa Program Magister:");
        System.out.println("Nama   : " + name);
        System.out.println("Umur   : " + age);
        System.out.println("Program: " + program);
    }
}
