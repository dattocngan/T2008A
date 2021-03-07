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
public class Zone {
    ArrayList<Area> areaList = new ArrayList<>();
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so khu vuc cho zone:");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            Area area = new Area();
            area.input();
            areaList.add(area);
        }
   }
    
    
    
    public void inputVehicle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so xe can them:");
        int n = scan.nextInt();
        int choose;
        for (int i = 0; i < n; i++) {
            showOptions();
            choose = scan.nextInt();
            Vehicle vehicle;
            if( choose == 1 ){
                vehicle = new Car();
            }else{
                vehicle = new Container();
            }
            vehicle.input();
            //tim khu vuc luu xe co
            for( int j = 0 ; j < areaList.size() ; j++ ){
                if(areaList.get(i).checkFree(vehicle)){
                    areaList.get(i).addVehicle(vehicle);
                    break;
                }
            }
        }
    }
    
    public void showOptions(){
        System.out.println("1.Nhap Car");
        System.out.println("2.Nhap Container");
        System.out.println("Lua chon:");
    }
    
    public void sort(){
        for (Area area : areaList) {
            area.sort();
        }
    }
    
    public void showInfor(){
        for (Area area : areaList) {
            area.showInfor();
        }
    }
    
}
