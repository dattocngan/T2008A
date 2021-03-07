/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.QuanLyDongVat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Animal implements IAnimal{
    private String name;
    private double weight;
    ArrayList<Animal> list = new ArrayList<>();
    
    Animal animal;
    int select, countAnimal = 0, countCat = 0 , countChicken = 0;
    public void inputDataForAnimal(){
        selectAnimal();
        animal.input();
        list.add(select,animal);
    }
    String a;
    public void displayDataOfAnimal(){
        int checkAnimal = countAnimal, checkCat = countCat, checkChicken = countChicken;
        for (Animal x : list) {
            if(checkAnimal == countAnimal){
                System.out.println("List of Animal:");
            }
            else if(checkAnimal == 0 && checkCat == countCat){
                System.out.println("List of Cat:");
            }
            else if(checkCat == 0 && checkChicken == countChicken){
                System.out.println("List of Chicken:");
                checkChicken--;
            }
            x.display();
            if( checkAnimal > 0 ){
                checkAnimal--;
                continue;
            }
            if(checkCat > 0 && checkAnimal == 0 ){
                checkCat--;
                continue;
            }
            if(checkChicken > 0 && checkCat == 0){
                checkChicken--;
                continue;
            }
        }
    }
    
    public void selectAnimal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Animal");
        System.out.println("2.Cat");
        System.out.println("3.Chicken");
        System.out.println("Select animal:");
        int choose = Integer.parseInt(scan.nextLine());
        if(choose == 1 ){
            select = 0;
            animal = new Animal();
            countAnimal++;
        }
        else if(choose == 2 ){
            select = 1;
            animal = new Cat();
            countCat++;
        }
        else if(choose == 3 ){
            select = 2;
            animal = new Chicken();
            countChicken++;
        }
    }

    public Animal() {
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        name = scan.nextLine();
        System.out.println("Weight:");
        weight = Double.parseDouble(scan.nextLine());
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }

    
    
    
}
