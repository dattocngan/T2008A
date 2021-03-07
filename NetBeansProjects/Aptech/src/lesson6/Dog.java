/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author MyPC
 */
public class Dog extends Animal{

    @Override
    public void showSound() {
        System.out.println("Gau gau...");
    }
    
    public void showMessage(String msg){
        System.out.println("Xin chao: " + msg);
    }
            
}
