/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.latihan.uas;

/**
 *
 * @author ehhramaa
 */
public class Person {
    protected String npm, name;
    protected int age;
    
    public Person(String npm, String name, int age){
        this.npm = npm;
        this.name = name;
        this.age = age;
    }
    
    public String getNpm() {
        return npm;
    }
    
    public String getNama() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
