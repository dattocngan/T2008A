/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.Kiemtra60phut.bai1;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int sum = n*(n+1) / 2;
        System.out.println("Tong cac so nguyen tu 0 -> N la: " + sum);
    }
}
