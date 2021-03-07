/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.QuanliSoThu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Zoo {
    ArrayList<Chuong> DanhSachChuong = new ArrayList<>();
    void themChuong() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma chuong muon them:");
        int maChuong = scan.nextInt();
        Chuong chuong = new Chuong();
        chuong.maChuong = maChuong;
        DanhSachChuong.add(chuong);
    }
    
    void xoaChuong(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma chuong muon xoa:");
        int maChuong = scan.nextInt();
        for(int i = 0; i < DanhSachChuong.size(); i++){
            Chuong temp = DanhSachChuong.get(i);
            if(temp.maChuong == maChuong){
                DanhSachChuong.remove(i);
                break;
            }
        }
    }
    
    public void themConVat(){
        Scanner scan = new Scanner(System.in);
        animalOptions();
        System.out.println("Lua chon con vat:");
        int choose = Integer.parseInt(scan.nextLine());
        switch( choose ){
            case 1:
                Animal tiger = new Tiger();
                System.out.println("Ten:");
                tiger.name = scan.nextLine();
                System.out.println("Tuoi:");
                tiger.age = Integer.parseInt(scan.nextLine());
                System.out.println("Mo ta:");
                tiger.description = scan.nextLine();
                System.out.println("Chon ma chuong muon cho vao:");
                int maChuong = Integer.parseInt(scan.nextLine());
                for (Chuong x : DanhSachChuong) {
                    if( x.maChuong == maChuong ){
                        x.AnimalList.add(tiger);
                        break;
                    }
                }
                break;
            case 2:
                Animal dog = new Dog();
                System.out.println("Ten:");
                dog.name = scan.nextLine();
                System.out.println("Tuoi:");
                dog.age = Integer.parseInt(scan.nextLine());
                System.out.println("Mo ta:");
                dog.description = scan.nextLine();
                System.out.println("Chon ma chuong muon cho vao:");
                maChuong = Integer.parseInt(scan.nextLine());
                for (Chuong x : DanhSachChuong) {
                    if( x.maChuong == maChuong ){
                        x.AnimalList.add(dog);
                        break;
                    }
                }
                break;
            case 3:
                Animal cat = new Cat();
                System.out.println("Ten:");
                cat.name = scan.nextLine();
                System.out.println("Tuoi:");
                cat.age = Integer.parseInt(scan.nextLine());
                System.out.println("Mo ta:");
                cat.description = scan.nextLine();
                System.out.println("Chon ma chuong muon cho vao:");
                maChuong = Integer.parseInt(scan.nextLine());
                for (Chuong x : DanhSachChuong) {
                    if( x.maChuong == maChuong ){
                        x.AnimalList.add(cat);
                        break;
                    }
                }
                break;  
        }
    }
    public void animalOptions(){
        System.out.println("1.Ho");
        System.out.println("2.Cho");
        System.out.println("3.Meo");
    }
    
    public void xoaConVat(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten con vat muon xoa:");
        String name = scan.nextLine();
        for (Chuong chuong : DanhSachChuong) {
            for( int i = 0 ; i < chuong.AnimalList.size() ; i++ ){
                if(chuong.AnimalList.get(i).name.equals(name) ){
                    chuong.AnimalList.remove(i);
                }
            }
        }
    }
}
