/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8.QuanLyXeDiaBan;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        XeMayHaNoi haNoi = new XeMayHaNoi();
        XeMayHoaBinh hoaBinh = new XeMayHoaBinh();
        int choose, chon;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    hoaBinh.nhap();
                    break;
                case 2:
                    haNoi.nhap();
                    break;
                case 3:
                    System.out.println("1.Danh sach xe Hoa Binh");
                    System.out.println("2.Danh sach xe Ha Noi");
                    System.out.println("Lua chon khu vuc:");
                    chon = Integer.parseInt(scan.nextLine());;
                    if(chon == 1){
                        hoaBinh.sapXep();
                    }else{
                        haNoi.sapXep();
                    }
                    break;
                case 4:
                    System.out.println("1.Danh sach xe Hoa Binh");
                    System.out.println("2.Danh sach xe Ha Noi");
                    System.out.println("Lua chon khu vuc:");
                    chon = Integer.parseInt(scan.nextLine());;
                    if(chon == 1){
                        hoaBinh.search();
                    }else{
                        haNoi.search();
                    }
                    break;
                case 5:
                    System.out.println("Danh sach xe Hoa Binh:");
                    hoaBinh.hoaBinhList.forEach((xeMay) -> {
                        xeMay.hienthi();
                    });
                    System.out.println("Danh sach xe Ha Noi:");
                    haNoi.haNoiList.forEach((xeMay) -> {
                        xeMay.hienthi();
                    });
                    break;
                case 6:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Nhap sai chuong trinh!!");
                    break;
            }
        }while(choose != 6);
    }
    
    static void showMenu(){
        System.out.println("1. Nhập thông tin cho n xe máy tại tỉnh Hòa Bình.");
        System.out.println("2. Nhập thông tin cho n xe máy tại tỉnh Hà Nội.");
        System.out.println("3. Sắp xếp danh sách tăng theo biển số xe.");
        System.out.println("4. Tìm kiếm thông tin xe theo biển số xe.");
        System.out.println("5. Thống kê số lượng xe đang quản lý.");
        System.out.println("6. Thoát");
    }
}
