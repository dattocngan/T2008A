/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.QuanLiBaiDoXe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PeopleList peopleList = new PeopleList();
        Zone zoneList = new Zone();
        int choose, n;
        do{
            Menu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    peopleList.input();
                break;
                
                case 2:
                    zoneList.input();
                break;
                
                case 3:
                    zoneList.inputVehicle();
                break;
                    
                case 4:
                    zoneList.sort();
                break;
                
                case 5:
                    zoneList.showInfor();
                break;
                
                case 6:
                    System.out.println("Tam biet!!");
                break;
                
                default:
                    System.err.println("Nhap sai!!!");
                    System.out.println("");
                break;
            }
        }while(choose != 6);
    }
    
    static void Menu(){
        System.out.println("1. Nhập thông tin N people.");
        System.out.println("2. Nhập thông tin N Area -> Lưu vào Zone");
        System.out.println("3. Nhập thông tin N vehicle và tự động tìm kiếm khu vự phù hợp để lưu chữ.");
        System.out.println("4. Hiển thị thông tin các xe được sở hữu bởi 1 người theo Tên");
        System.out.println("5. Dùng giải thuật Quick Sort để sắp xếp theo thứ tự giảm dần theo diện tích của xe trong từng khu vực.");
        System.out.println("6. Sử dụng kết quả 5 hiển thị thông tin xe cộ trong Zone đó.");
    }
}
