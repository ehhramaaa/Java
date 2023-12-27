/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.onlineorderapp;

import java.util.Scanner;

/**
 *
 * @author ehhramaa
 */
public class OnlineOrderApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OnlineMarket market = new OnlineMarket();
        Product product1 = new Product("Fullstack", 1000000, 10);
        Product product2 = new Product("Automation", 800000, 15);

        // Add Product To Online Market
        market.addProduct(product1);
        market.addProduct(product2);
        int choise;
        do {
            System.out.println("|===================================|");
            System.out.println("|         Online Order Apps         |");
            System.out.println("|===================================|");

            System.out.println("Avaliable Menu");
            System.out.println("1.Show Product List \n2.Order Product \n3.Order List \n4.Exit Program");
            System.out.print("Select Menu:");
            choise = input.nextInt();

            switch (choise) {
                case 1 -> {
                    System.out.println("\n|===================================|");
                    System.out.println("|             Product List          |");
                    System.out.println("|===================================|");
                    market.showProductList();
                    break;
                }
                case 2 -> {
                    System.out.println("\n|===================================|");
                    System.out.println("|            Order Product          |");
                    System.out.println("|===================================|");
                    market.showProductList();

                    input.nextLine();

                    System.out.print("Select Product: ");
                    String name = input.nextLine();
                    System.out.print("Enter Order Quantity: ");
                    int qty = input.nextInt();

                    market.orderProduct(name, qty);
                    break;
                }
                case 3 -> {
                    System.out.println("\n|===================================|");
                    System.out.println("|             Order List            |");
                    System.out.println("|===================================|");
                    market.showOrderList();
                    break;
                }
                case 4 -> {
                    System.out.println("\n|===================================|");
                    System.out.println("|      Thanks For Using Program     |");
                    System.out.println("|===================================|");
                    choise = 0;
                    break;
                }
                default -> {
                    System.out.println("Input Not Valid, Enter a Valid Option e.g 1,2,3,4");
                    break;
                }
            }
        } while (choise != 0);
    }
}
