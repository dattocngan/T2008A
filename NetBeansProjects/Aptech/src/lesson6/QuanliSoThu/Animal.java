/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.QuanliSoThu;

/**
 *
 * @author MyPC
 */
public abstract class Animal {
    String name, description;
    int age;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, String description, int age) {
        this.name = name;
        this.description = description;
        this.age = age;
    }
    
    
    
    void xemThongTin(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Mo ta: " + description);
    }
    
    abstract void tiengKeu();
}
