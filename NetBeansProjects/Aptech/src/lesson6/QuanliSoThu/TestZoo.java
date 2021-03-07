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
public class TestZoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Zoo zoo = new Zoo();
        Chuong chuong = new Chuong();
        int choose;
        do{
            Menu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    zoo.themChuong();
                break;
                case 2:
                    zoo.xoaChuong();
                break;
                case 3:
                    zoo.themConVat();
//                    for (Chuong x : zoo.DanhSachChuong) {
//                        System.out.println(x.maChuong);
//                    }
                break;
                case 4:
                    zoo.xoaConVat();
                break;
                case 5:
                    for (Chuong x : zoo.DanhSachChuong) {
                        System.out.println("Ma chuong: " + x.maChuong);
                        if( x.AnimalList.isEmpty() ){
                            System.out.println("Chuong nay khong co con nao");
                            continue;
                        }
                        for( int i = 0 ; i < x.AnimalList.size() ; i++ ){
                            x.AnimalList.get(i).tiengKeu();
                            x.AnimalList.get(i).xemThongTin();
                        }
                    }
                break;
                case 6:
                    System.out.println("Tam biet!!!");
                break;
                default:
                    System.out.println("Nhap sai!!!");
                break;
            }
        }while( choose != 6 );
    }
    
    static void Menu(){
        System.out.println("1.Them chuong");
        System.out.println("2.Xoa chuong");
        System.out.println("3.Them con vat");
        System.out.println("4.Xoa con vat");
        System.out.println("5.Xem tat ca cac con vat");
        System.out.println("6.Thoat");
    }
}
