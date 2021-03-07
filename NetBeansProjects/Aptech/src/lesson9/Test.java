/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(12);
        list.forEach((integer) -> {
            System.out.println(integer);
        });
        
        //Cach 2: tao 1 object tu interface -> Ko tao class moi
        IRunning run = new IRunning(){
            @Override
            public void onRunning(String msg) {
                System.out.println("Test" + msg);
            }
        };
        run.onRunning("OKOK");
        
        //Xuat phat tu cach 2 -> cho phep rut gon cau lenh lai -> Su dung cu phap lamba
        IRunning run1 = (String msg) -> {
            System.out.println("Dat" + msg);
        };
        run1.onRunning(" dep trai");
    }
}
