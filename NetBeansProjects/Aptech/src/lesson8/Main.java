/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int s;
        //Exception
        //De bo qua khoi code
        
        try{
            //Bat dau xu ly
            //Khoi tao rat nhieu tai nguyen => yeu cau can xoa di => sau khi su dung xong
            s = x/y;
            System.out.println(s);
            //Ket thuc xu ly ko gap Exeception
            //Neu dat xoa tai nguyen o day => miss => neu xay ra exception => ko goi duoc
        } catch(Exception e){//Bat loi
            //Khi trong try xay ra Exception
            System.err.println("error...");
            //Biet Exception => message cho nguoi dung biet
        }finally{
            x = 0;
            y = 0;
            s = 0;
            System.out.println("Xoa thanh cong...");
            //Gap Exception hay ko deu goi vao khoi code nay
            System.out.println("finish");
            //Do vay de an toan => se la noi de xoa toan bo tai nguyen
        }
   
    }
    
    public void test(){
        Student std = new Student();
        std.input();
    }
    
    //Inner class: la 1 lop doi tuong nam trong lop khac
    //Thong thuong la cac class trong lop cha
    public class Student{
        String name, address;

        public Student() {
        }

        public Student(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public void input(){
            System.out.println("nhap....");
        }
    }
}
