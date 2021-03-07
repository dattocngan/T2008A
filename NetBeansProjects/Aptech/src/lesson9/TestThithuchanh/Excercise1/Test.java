/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9.TestThithuchanh.Excercise1;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConversionUtil check = new ConversionUtil();
        int choose;
        float x;
        do{
            showMenu();
            System.out.println("Select program:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    System.out.println("Fahreheit:");
                    x = Float.parseFloat(scan.nextLine());
                    System.out.println("Celsius: " + check.fahrenheitToCelsius(x));
                    break;
                case 2:
                    System.out.println("Celsius:");
                    x = Float.parseFloat(scan.nextLine());
                    System.out.println("Fahreheit : " + check.celciusToFahrenheit(x));
                    break;
                case 3:
                    System.out.println("Goodbye!!");
                    break;
                default:
                    System.out.println("Wrong program!!");
                    break;
            }
        }while(choose != 3);
    }
    
    public static void showMenu(){
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit");
    }
}
