/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.latihan.uas;

/**
 *
 * @author ehhramaa
 */
public class Clear {
    public void screen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
