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
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("DAT DEP TRAI");
        int x = 5;
        Scanner scan = new Scanner(System.in);
        int t;
        float y;
        System.out.print("Nhap t = ");
        t = scan.nextInt();
        System.out.print("Nhap y = ");
        y = scan.nextFloat();
        System.out.println("t = " + t + ", y = " + y);
    }

}
