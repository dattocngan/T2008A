/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.Kiemtra60phut.bai4;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class People {
    String name, address;
    
    public People(){  
    }
    public People(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = scan.nextLine();
        System.out.println("Nhap dia chi:");
        address = scan.nextLine();
    }
    
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", address=" + address + '}';
    }
    
}
