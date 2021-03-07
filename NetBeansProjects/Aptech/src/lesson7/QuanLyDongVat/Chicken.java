/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.QuanLyDongVat;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Chicken extends Animal{
    private int numberOfLeg;

    public Chicken() {
    }

    public Chicken(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public Chicken(int numberOfLeg, String name, double weight) {
        super(name, weight);
        this.numberOfLeg = numberOfLeg;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Number of legs:");
        numberOfLeg = Integer.parseInt(scan.nextLine());
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Number of legs: " + numberOfLeg);
    }
    
    
}
