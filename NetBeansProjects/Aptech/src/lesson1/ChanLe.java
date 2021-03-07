/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class ChanLe {
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap x = ");
        int x;
        x = scan.nextInt();
        if( x % 2 == 0 ) System.out.println("x là số chẵn");
        else System.out.println("x là số lẻ");
    }

}
