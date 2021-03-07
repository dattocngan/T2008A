/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Employee {

    private String name, gender, country, position;
    private double wages;

    public Employee() {

    }

    public Employee(String name, String gender, String country, String position, double wages) {
        this.name = name;
        this.gender = gender;
        this.country = country;
        this.position = position;
        this.wages = wages;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        gender = scan.nextLine();
        country = scan.nextLine();
        position = scan.nextLine();
        wages = scan.nextDouble();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void Display() {
        System.out.format("\nName: %s\nGender: %s\nCountry: %s\nPosition: %s\nWages: %f\n", name, gender, country, position, wages);
    }

}
