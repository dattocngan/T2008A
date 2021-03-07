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
public class Calculator {
    public float x1 , x2;
    public void Cong(float x1, float x2){
        System.out.println( (int)(x1+x2) ); 
    }
    public void Tru(float x1, float x2){
        System.out.println((int)(x1 - x2)); 
    }
    public void Nhan(float x1, float x2){
        System.out.println((int)(x1 * x2)); 
    }
    public void Chia(float x1, float x2){
        System.out.println(x1 / x2); 
    }
}
