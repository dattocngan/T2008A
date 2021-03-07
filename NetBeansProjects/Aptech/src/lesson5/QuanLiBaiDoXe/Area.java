/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.QuanLiBaiDoXe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Area{
    String site;
    int width, length;
    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public Area() {
    }
    
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    
    public void sort(){
        Collections.sort(vehicleList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                if(o1.getS() < o2.getS()){
                    return -1;
                }
                return 1;
            }
        });
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Vi tri: ");
        site = scan.nextLine();
        System.out.println("Chieu rong: ");
        width = scan.nextInt();
        System.out.println("Chieu dai: ");
        length = scan.nextInt();
    }
    
    public boolean checkFree(Vehicle vehicle){
        //xep cheo.
        int usedWidth = 0;
        int usedLength = 0;
        for (Vehicle v : vehicleList) {
            usedWidth += v.getWidth();
            usedLength += v.getLength();
        }
        
        int freeWidth = width - usedWidth;
        int freeLength = length - usedLength;
        if( freeWidth >= vehicle.getWidth() && freeLength >= vehicle.getLength() ) return true;
        return false;
    }
    
    public void showInfor(){
        for (Vehicle vehicle : vehicleList) {
            vehicle.showInfo();
        }
    }
}
