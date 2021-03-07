/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.QuanliSoThu;

/**
 *
 * @author MyPC
 */
public class Tiger extends Animal{

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }

    public Tiger(String name, int age) {
        super(name, age);
    }

    public Tiger(String name, String description, int age) {
        super(name, description, age);
    }
    
    

    @Override
    void tiengKeu() {
        System.out.println("Gru gru...");
    }
    
}
