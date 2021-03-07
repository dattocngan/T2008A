/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author MyPC
 */
public class Tiger {
    //Dinh nghia cac thuoc tinh
    public String name;
    private int age;
    public String foodtype;
    String area; //friendly -> ke thua
    
    //Ham tao: duoc goi 1 lan luc khai bao new, ten trung class
    public Tiger(){
        //Ham tao ko doi so
    }
    public Tiger(String name1 , int age1){
        name = name1;
        age = age1;
    }
    //Dung this de chi vao doi tuong
    public Tiger(String name , int age , String foodtype){
        this.name = name;
        this.age = age;
        this.foodtype = foodtype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age >= 0 ){
            this.age = age;
        }else{
            System.err.println("Age is above 0!");
        }
    }
    
    
    
    //Function, chuc nang, method, phuong thuc
    public void running(){
        System.out.println("Tiger is running");
        System.out.println("Tiger is running");
        System.out.println("Tiger is running");
        System.out.println("Tiger is running");
    }
    public void eating(){
        System.out.println("Tiger is eating");
        System.out.println("Tiger is eating");
        System.out.println("Tiger is eating");
        System.out.println("Tiger is eating");
    }
    public void display(){
        System.out.format("\nName: %s \nAge: %d \nFoodtype: %s\n", name , age , foodtype);
    }
}
