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
public class Car extends Vehicle{

    public Car() {
        super(2, 3);
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nha san xuat:");
        manu = scan.nextLine();
        System.out.println("Bien so xe:");
        carNum = scan.nextLine();
        System.out.println("Nam san xuat:");
        year = scan.nextInt();
        System.out.println("Id cua chu so huu:");
        idOwner = scan.nextInt();
    }
    
    
}
