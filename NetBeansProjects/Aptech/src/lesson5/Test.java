/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone("A");
        Phone p2 = new Phone("B");
        System.out.println("A > " + Phone.YEAR);
        System.out.println("B > " + Phone.YEAR);
        
        showMenu();
    }
    
    static void showMenu(){
        System.out.println("Nhap 1");
        System.out.println("Nhap 2");
    }
}
