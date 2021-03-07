/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.QuanLyMeo;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class UsingManagerCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ManagerCat cat = new ManagerCat();
        ColorManager color = new ColorManager();
        int choose;
        do{ 
            Menu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch( choose ){
                case 0:
                    color.input();
                    break;
                case 1:
                    cat.input();
                    break;
                case 2:
                    cat.hienThi();
                    break;
                case 3:
                    cat.sapXepASCII();
                    break;
                case 4:
                    cat.searchLoai();
                    cat.hienThi();
                    break;
                case 5:
                    for (String mau : color.colorList) {
                        for( int i = 0 ; i < cat.catList.size() ; i++ ){
                            if( cat.catList.get(i).getMau().equalsIgnoreCase(mau)){
                                cat.catList.get(i).hienThi();
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
        }while(choose != 6);
    }
    
    static void Menu(){
        System.out.println("0.Nhap danh sach ma mau");
        System.out.println("1.Nhap thong tin cua N con meo");
        System.out.println("2.Hien thi thong tin");
        System.out.println("3.Sap xep danh sach theo mau");
        System.out.println("4.Tim kiem thong tin theo loai");
        System.out.println("5.Sap xep danh sach mau theo bang mau trong lop ColorManager");
        System.out.println("6.Thoat");
    }
}
