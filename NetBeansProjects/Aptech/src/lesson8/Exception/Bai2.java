/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8.Exception;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author MyPC
 */
public class Bai2 {
    public static void main(String[] args) {
        input();
    }
    
    public static void input(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a;
            try{
                while(true){
                    System.out.println("Nhap:");
                    a = scan.nextInt();
                    if(a==100){
                        throw new Exception("Ban da nhap so 100!!");
                    }
                    list.add(a);
                }
            }catch (Exception e) {
                  e.printStackTrace();
//                System.out.println("Ban da nhap so 100!!");
            }finally{
                for (Integer integer : list) {
                    System.out.print(integer + " ");
                }
                System.out.println("");
                System.out.println("Finish");
            }     
    }
}
