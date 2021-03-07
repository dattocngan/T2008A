/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.Kiemtra60phut.bai4;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Student extends People{
    String rollNo;
    
    public Student(){
    }

    public Student(String rollNo) {
        this.rollNo = rollNo;
    }
    public Student(String rollNo, String name, String address) {
        super(name, address);
        this.rollNo = rollNo;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap ma sinh vien:");
        rollNo = scan.nextLine();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + '}';
    }
    
    
}
