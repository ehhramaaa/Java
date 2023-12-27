package com.mycompany.onlineorderapp;

import java.util.Scanner;
import java.util.ArrayList;

public class OnlineMarket implements OrderProduct {
    private ArrayList<Product> productList;
    private ArrayList<String> orderList;

    public OnlineMarket() {
        this.productList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void orderProduct(String name, int qty) {
        Product selectedProduct = null;
        for (Product product : productList) {
            if (product.name.equals(name)) {
                selectedProduct = product;
                break;
            }
        }

        // Jika produk ditemukan, lanjutkan dengan pemesanan
        if (selectedProduct != null) {
            // Memeriksa apakah stok mencukupi
            if (qty > 0 && qty <= selectedProduct.stock) {
                // Melakukan pemesanan
                String order = "Order: " + name + ", Quantity: " + qty;
                orderList.add(order);

                // Mengurangi stok produk
                selectedProduct.stock -= qty;

                System.out.println("Order Successful!");
            } else {
                System.out.println("Quantity Order Not Valid Or Stock Not Enough.");
            }
        } else {
            System.out.println("Product Not Found.");
        }
    }

    @Override
    public void showOrderList() {
        for (String order : orderList) {
            System.out.println(order);
        }
    }

    public void showProductList() {
        for (Product product : productList) {
            product.getInfo();
            System.out.println("|===================================|");
        }
    }
}
