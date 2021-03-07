/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class Lesson2 {
    public static void main(String[] args) {
        int[] t = new int[5];
        //length 5 ; index 0 -> 4
        
        //Khai bao mang dong -> dynamic.
        ArrayList<Integer> list = new ArrayList<>(); //Tao ra 1 mang dong
        //THem 1 phan tu vao mang
        list.add(12); // length = 1;
        list.add(55); // length = 2;
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phan tu >> " + list.get(i));
        }
        
        //Xoa 1 phan tu di
        list.remove(0);
        
        ArrayList<String> list2 = new ArrayList<>();
        
        //Khai bao mang chua nhieu kieu du lieu: int, String, char, ...
        ArrayList<?> list3 = new ArrayList<>();
    }
}
