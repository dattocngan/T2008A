/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.QuanLyDongVat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Scanner scan = new Scanner(System.in);
        int choose;
        do{
            showMenu();
            System.out.println("Select program:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    animal.inputDataForAnimal();
                    break;
                case 2:
                    animal.displayDataOfAnimal();
                    break;
                default:
                    System.err.println("Wrong command!!");
                    break;
            }
        }while( choose != 2 );
    }
    
    static void showMenu(){
        System.out.println("1. Input data for Animal");
        System.out.println("2. Display data of Animal");
    }
}
