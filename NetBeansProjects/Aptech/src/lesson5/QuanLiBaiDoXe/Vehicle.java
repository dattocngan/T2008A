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
public class Vehicle{
    String manu, carNum;
    int year, idOwner, width, length;
    
    public Vehicle(){
    }

    public Vehicle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    

    public Vehicle(String manu, String carNum, int year, int idOwner, int width, int length) {
        this.manu = manu;
        this.carNum = carNum;
        this.year = year;
        this.idOwner = idOwner;
        this.width = width;
        this.length = length;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nha san xuat:");
        manu = scan.nextLine();
        System.out.println("Bien so xe:");
        carNum = scan.nextLine();
        System.out.println("Nam san xuat:");
        year = scan.nextInt();
        System.out.println("Id cua chu so huu:");
        idOwner = scan.nextInt();
        System.out.println("Chieu dai:");
        length = scan.nextInt();
        System.out.println("Chieu rong:");
        width = scan.nextInt();
    }
    
    public void showInfo(){
        System.out.println("Nha san xuat: " + manu);
        
        System.out.println("Bien so xe: " + carNum);
        
        System.out.println("Nam san xuat: " + year);
        
        System.out.println("Id cua chu so huu: " + idOwner);
        
        System.out.println("Chieu dai: " + length);
        
        System.out.println("Chieu rong: " + width);
    }
    
    public int getS(){
        return length*width;
    }
}
