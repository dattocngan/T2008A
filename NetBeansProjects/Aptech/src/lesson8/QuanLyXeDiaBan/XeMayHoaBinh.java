/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8.QuanLyXeDiaBan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author MyPC
 */
public class XeMayHoaBinh extends XeMay{
    int n;
    ArrayList<XeMay> hoaBinhList = new ArrayList<>();

    public XeMayHoaBinh() {
    }

    public XeMayHoaBinh(int n) {
        this.n = n;
    }

    public XeMayHoaBinh(int n, String bienso, String loaixe, String mauxe, float giatien) {
        super(bienso, loaixe, mauxe, giatien);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<XeMay> getHoaBinhList() {
        return hoaBinhList;
    }

    public void setHoaBinhList(ArrayList<XeMay> hoaBinhList) {
        this.hoaBinhList = hoaBinhList;
    }

    @Override
    public String getBienso() {
        return bienso;
    }

    @Override
    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    @Override
    public String getLoaixe() {
        return loaixe;
    }

    @Override
    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    @Override
    public String getMauxe() {
        return mauxe;
    }

    @Override
    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    @Override
    public float getGiatien() {
        return giatien;
    }

    @Override
    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong xe o Hoa Binh muon them:");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap thong tin xe thu " + i + ":");
            XeMay xemay = new XeMayHoaBinh();
            System.out.println("Bien so xe:");
            xemay.bienso = scan.nextLine();
            System.out.println("Loai xe:");
            xemay.loaixe = scan.nextLine();
            System.out.println("Mau xe:");
            xemay.mauxe = scan.nextLine();
            System.out.println("Gia tien:");
            xemay.giatien = Float.parseFloat(scan.nextLine());
            hoaBinhList.add(xemay);
        }
    }
    
    public void sapXep(){
        Collections.sort(hoaBinhList, (XeMay o1, XeMay o2) -> o1.bienso.compareToIgnoreCase(o2.bienso));
        System.out.println("Danh sach xe may Hoa Binh sau khi da sap xep theo bien so xe:");
        hoaBinhList.forEach((xeMay) -> {
            xeMay.hienthi();
        });
    }
    
    public void search(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap bien so xe muon tim kiem:");
        String bien = scan.nextLine();
        int check = 0;
        check = hoaBinhList.stream().filter((xeMay) -> (xeMay.bienso.equalsIgnoreCase(bien))).map((xeMay) -> {
            xeMay.hienthi();
            return xeMay;
        }).map((_item) -> 1).reduce(check, Integer::sum);
        if(check == 0) System.out.println("Khong tim thay xe nao co bien so xe nhu vay!!");
    }

    @Override
    public void hienthi() {
        System.out.println("XeMay{" + "bienso=" + bienso + ", loaixe=" + loaixe + ", mauxe=" + mauxe + ", giatien=" + giatien + '}');
    }
    
}
