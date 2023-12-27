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
import java.util.ArrayList;

public class UniversityManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("\nUniversity Management System");
            System.out.println("1. Register Undergraduate Student");
            System.out.println("2. Register Graduate Student");
            System.out.println("3. Display Student Information");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = inp.nextInt();
            inp.nextLine(); 

            switch (choice) {
                case 1:
                    UndergraduateStudent undergrad = new UndergraduateStudent("", 0, "");
                    undergrad.register();
                    studentList.add(undergrad);
                    break;
                case 2:
                    GraduateStudent grad = new GraduateStudent("", 0, "");
                    grad.register();
                    studentList.add(grad);
                    break;
                case 3:
                    for (Student student : studentList) {
                        student.displayInfo();
                        System.out.println("-------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Keluar Program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }
}
