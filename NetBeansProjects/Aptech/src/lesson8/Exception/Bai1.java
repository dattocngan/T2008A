/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        float x,y;
        try {
            System.out.println("Nhap x:");
            x = scan.nextInt();
            System.out.println("Nhap y:");
            y = scan.nextInt();
            if(y==0) throw new Exception();
            float z = chia(x, y);
            System.out.println("Thuong: " + z);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Error > InputMismatchException");
        } catch (Exception e){
            System.out.println("Loi y = 0");
        } finally{
            System.out.println("Ket thuc!!");
        }
    }
    
    static float chia(float x , float y){
        return x / y;
    }
}
