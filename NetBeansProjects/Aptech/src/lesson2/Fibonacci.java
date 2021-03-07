/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max;
        max = scan.nextInt();
        int a = 1 , b = 1, tong = 0;
        System.out.print("1 1 ");
        while(true){
            tong = a + b;
            if( tong > max ) break;
            System.out.print(tong +" ");
            a = b;
            b = tong;
        }
    }
}
