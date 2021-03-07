/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.showSound();
        dog.showSound();
        
        //Tinh chat da hinh 
        Animal animal = new Dog();
        
        //animal -> kieu du lieu la Animal
        //animal = new Dog() -> animal chinh la doi tuong Dog
        
        animal.showSound();
        
        //Dieu dac biet trong tinh da hinh
        
//        animal.showMessage("123");
        
        if(animal instanceof Dog){
            ((Dog)animal).showMessage("Hello");
        }
        
        //Su dung trong 1 so truong hop
        //Khai bao 1 mang animalList -> quan ly duoc tat ca dong vat
        ArrayList<Animal> animalList = new ArrayList<>();
        
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(animal);
        System.out.println("==========");
        for (Animal animal1 : animalList) {
            animal1.showSound();
            if(animal1 instanceof Dog){
                ((Dog) animal1).showMessage("De vl");
            }
        }
    }
}
