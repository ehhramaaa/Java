/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.latihan.uas;
import java.util.Scanner;
/**
 *
 * @author ehhramaa
 */
public class App {
    public static void main(String[] args) {
        String name, npm = null;
        int choise, age;
        boolean repeat = true;
        
        UniversityManagement manajemenMhs = new UniversityManagement();
        
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("|===================================|");
            System.out.println("|   Program University Management   |");
            System.out.println("|===================================|");

            System.out.println("Avaliable Menu");
            System.out.println("1.Register Mahasiswa \n2.Show Information Mahasiswa \n3.Exit Program");
            System.out.print("Select Menu:");
            choise = input.nextInt();

            switch(choise){
                case 1 -> {
                    try {
                        String repeatRegist;
                        input.nextLine();
                        do {
                            System.out.println("\n|===================================|");
                            System.out.println("|         Register Mahasiswa        |");
                            System.out.println("|===================================|");
                            
                            System.out.print("Student name :");
                            name = input.nextLine();
                            System.out.print("Student NPM  :");
                            npm = input.nextLine();
                            System.out.print("Student age  :");
                            age = input.nextInt();

                            input.nextLine();
                            String graduate;

                            do {
                                System.out.print("Is Graduated?(y/n):");
                                graduate = input.nextLine();

                                switch(graduate){
                                    case "y" -> {
                                        System.out.print("Studen Major :");
                                        String major = input.nextLine();

                                        GraduateStudent mahasiswa = new GraduateStudent(npm, name, age, major);
                                        manajemenMhs.daftarMahasiswa(mahasiswa);
                                        manajemenMhs.tampilkanInformasiMahasiswa();
                                        break;
                                    }
                                    case "n" -> {
                                        System.out.print("Student Class :");
                                        String kelas = input.nextLine();

                                        UndergraduateStudent mahasiswa = new UndergraduateStudent(npm, name, age, kelas);
                                        manajemenMhs.daftarMahasiswa(mahasiswa);
                                        manajemenMhs.tampilkanInformasiMahasiswa();
                                        break;
                                    }
                                    default -> {
                                        System.out.println("Input Not Valid!, Enter a Valid Input e.g y or n");
                                        break;
                                    }
                                 } 
                            }while(!graduate.equals("y") && !graduate.equals("n"));

                        System.out.print("\nWant Repeat Regist Mahasiswa ? (y/n):");
                        repeatRegist = input.nextLine();
                        }while(repeatRegist.equals("y"));
                    } catch (Exception e) {
                        System.out.println("Terjadi error: " + e.getMessage());
                    }
                    break;
                }
                case 2 -> {
                    System.out.println("\n|===================================|");
                    System.out.println("|       Information Mahasiswa       |");
                    System.out.println("|===================================|");
                    
                    if(npm != null){
                        manajemenMhs.tampilkanInformasiMahasiswa();
                    }else{
                        System.out.println("Anda Belum Melakukan Registrasi, Silahkan Melakukan Registrasi Terlebih Dahulu !\n");
                    }
                }
                case 3 -> {
                    System.out.println("\n|===================================|");
                    System.out.println("|      Thaks For Using Program      |");
                    System.out.println("|===================================|");
                    repeat = false;
                }
                default -> {
                    System.out.println("Input Not Valid, Enter a Valid Option e.g 1,2,3");
                    break;
                }
            }
        }while(choise > 3 || repeat == true);
    }
}
