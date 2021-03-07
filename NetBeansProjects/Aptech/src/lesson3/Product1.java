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
public class Product1 {
    String name, manu;
    float price;
    
    public Product1(){
        
    }

    public Product1(String name, String manu, float price) {
        this.name = name;
        this.manu = manu;
        this.price = price;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = scan.nextLine();
        System.out.println("Nhap NSX:");
        manu = scan.nextLine();
        System.out.println("Nhap gia:");
        price = scan.nextFloat();
    }

    @Override
    public String toString() {
        return "Product1{" + "ten=" + name + ", NSX=" + manu + ", Gia tien=" + price + '}';
    }
    
    public void display(){
        System.out.println(this);
    }
}
