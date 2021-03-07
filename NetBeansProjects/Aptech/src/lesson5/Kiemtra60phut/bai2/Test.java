/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.Kiemtra60phut.bai2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Nhap N: ");
        int n = scan.nextInt();
        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            list.add(a);
        }
        System.out.print("Cac so chia het cho 2 la: ");
        for (int a: list) {
            if( a % 2 == 0 ) System.out.print( a + " ");
        }
        System.out.println("");
    }
}
