/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author MyPC
 */
public class Animal {
    String name, foodType;
    int age;
    
    public Animal(){
    }

    public Animal(String name, String foodType, int age) {
        this.name = name;
        this.foodType = foodType;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //showSound -> chac chan dong vat nao cung co
    public void showSound(){
        //Am thanh cua moi dong vat la khac nhau -> ko the mo ta chinh xac duoc am thanh cua dong vat
        //Khai bao ra -> class con se co
    }
    
    public void running(){
        System.out.println("running...");
    }
    
    public void sleeping(){
        System.out.println("sleeping...");
    }
}
