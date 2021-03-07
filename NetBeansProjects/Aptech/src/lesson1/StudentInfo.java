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
public class StudentInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, address, email, phone_number;
        int age;
        System.out.print("Họ và tên: ");
        name = scan.nextLine();
        System.out.print("Tuổi: ");
        age = Integer.parseInt(scan.nextLine());
        System.out.print("Địa chỉ: ");
        address = scan.nextLine();
        System.out.print("Email: ");
        email = scan.nextLine();
        System.out.print("Số điện thoại: ");
        phone_number = scan.nextLine();
        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + phone_number);
    }
}
