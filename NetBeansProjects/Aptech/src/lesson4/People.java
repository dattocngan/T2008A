/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author MyPC
 */
public class People {
    String name, address;
    int age;
    public People(){
        System.out.println("People init");
    }

    public People(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public void running(){
        System.out.println("Running...");
    }
}
