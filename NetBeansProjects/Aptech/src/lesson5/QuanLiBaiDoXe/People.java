/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.QuanLiBaiDoXe;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class People {
    String name,  address, gender;
    int year, id, age;
    
    public People(){
    }

    public People(String name, String address, String gender, int year, int id, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.year = year;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Id:");
        id = Integer.parseInt(scan.nextLine());
        System.out.println("Ten:");
        name = scan.nextLine();
        System.out.println("Tuoi:");
        age = Integer.parseInt(scan.nextLine());
        System.out.println("Dia chi:");
        address = scan.nextLine();
        System.out.println("Gioi tinh:");
        gender = scan.nextLine();
        System.out.println("Nam sinh:");
        year = Integer.parseInt(scan.nextLine());
    }
    
    public void showInfo(){
        System.out.println("Id: " + id);
        
        System.out.println("Ten: " + name);
        
        System.out.println("Tuoi: " + age);
        
        System.out.println("Dia chi: " + address);
        
        System.out.println("Gioi tinh: " + gender);
        
        System.out.println("Nam sinh: " + year);
        
    }
}
