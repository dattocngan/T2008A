/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author MyPC
 */

// 1 thang con chi co 1 thang bo
public class Student extends People{
    String rollno;
    public Student(){
//        super(); An va tu hieu la se goi xem co thang cha khong
        System.out.println("Student init");
    }
    
    public Student(String rollno, String name, String address, int age) {
        super(name, address, age);
        this.rollno = rollno;
    }
    
    public void display(){
        System.out.println("Learning...");
    }
    
    //Ghi de
    @Override
    public void running() {
        super.running(); // Keep the origin source
        System.out.println("Xin chao, toi la sinh vien");; //To change body of generated methods, choose Tools | Templates.
    }
    
    //Overloading
    public void running(String s1){
        System.out.println("Overloading" + s1);
    }
    
}
