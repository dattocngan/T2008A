/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.HCNPackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class HCNTest extends Hinhchunhat{
    public static void main(String[] args) {
        ArrayList<HCNInterface> hcnList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N mang hinh chu nhat:");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            Hinhchunhat hcn = new Hinhchunhat();
            System.out.println("Nhap chieu dai hinh chu nhat thu " + (i+1) +" :");
            hcn.chieudai = scan.nextFloat();
            System.out.println("Nhap chieu rong hinh chu nhat thu " + (i+1) +" :");
            hcn.chieurong = scan.nextFloat();
            hcnList.add(hcn);
        }
        int k = 0;
        float max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Chieu dai hinh chu nhat thu " + (i+1) + " :" + hcnList.get(i).getChieuDai() );
            
            System.out.println("Chieu rong hinh chu nhat thu " + (i+1) + " :" + hcnList.get(i).getChieuRong() );
            
            System.out.println("Dien tich hinh chu nhat thu " + (i+1) + " :" + hcnList.get(i).dientichHCN() );
            
            if( i == 0 ){
                max = hcnList.get(i).dientichHCN();
                k = i;
                continue;
            }
            if( hcnList.get(i).dientichHCN() > max ){
                max = hcnList.get(i).dientichHCN();
                k = i;
            }
        }
        System.out.println("Thong tin ve hinh chu nhat co dien tich lon nhat la:");
        System.out.println("Chieu dai: " + hcnList.get(k).getChieuDai());
        System.out.println("Chieu rong: " + hcnList.get(k).getChieuRong());
        System.out.println("Dien tich: " + hcnList.get(k).dientichHCN());
    }
}
