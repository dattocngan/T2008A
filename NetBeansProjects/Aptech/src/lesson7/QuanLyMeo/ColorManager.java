/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.QuanLyMeo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class ColorManager {
    ArrayList<String> colorList = new ArrayList<>();
    
    public void input(){ 
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong mau muon cho vao:");
        int colorNum = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < colorNum; i++) {
            String color = scan.nextLine();
            colorList.add(color);
        }
    }
    public void hienThi(){
        for (String x : colorList) {
            System.out.println(x);
        }
    }
}
