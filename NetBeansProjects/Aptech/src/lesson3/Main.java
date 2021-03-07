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
public class Main {
    public static void main(String[] args) {
        //Mo ta 1 tiger cu the: ABC , 2 , Dog
        //new Tiger() -> Ham tao -> Khoi tao khong gian luu tru cho doi tuong tiger duoc tao
        Tiger tiger = new Tiger();
        tiger.name = "Trung Duc";
//        tiger.age = 30;
        tiger.foodtype = "dog meat";
        tiger.display();
        Tiger tiger2 = new Tiger();
        tiger2.name = "Tien Dat";
        tiger2.setAge(8);
        tiger2.foodtype = "meat";
        tiger2.display();
        Tiger tiger3 = new Tiger("Datprovip",18);
        tiger3.foodtype = "Sua chua";
        tiger3.display();
    }
}
