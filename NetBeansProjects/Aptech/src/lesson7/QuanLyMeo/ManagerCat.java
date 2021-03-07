/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.QuanLyMeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class ManagerCat {
    ArrayList<Cat> catList = new ArrayList<>();
    
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("So con meo muon them:");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap thong tin " + n + " con meo:");
        for (int i = 0; i < n; i++) {
            Cat cat = new CatDetail();
            cat.nhap();
            catList.add(cat);
        }
    }
    
    public void hienThi(){
        for (Cat cat : catList) {
            cat.hienThi();
        }
    }
    
    public void sapXepASCII(){
        Collections.sort(catList,new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return  o1.getMau().compareToIgnoreCase(o2.getMau());
            }
        });
    }
    
    public void searchLoai(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Loai meo can tim kiem:");
        String searchLoai = scan.nextLine();
        for (Cat cat : catList) {
            if(cat.getLoai().equalsIgnoreCase(searchLoai)){
                cat.hienThi();
            }
        }
    }
}
