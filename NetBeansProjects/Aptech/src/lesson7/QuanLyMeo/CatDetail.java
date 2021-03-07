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
public class CatDetail extends Cat{
    String loai;
    String noisong;

    public CatDetail() {
    }

    public CatDetail(String loai, String mau, String noisong) {
        this.loai = loai;
        this.mau = mau;
        this.noisong = noisong;
    }

    @Override
    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }
    
    

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Loai meo:");
        loai = scan.nextLine();
        System.out.println("Mau meo:");
        mau = scan.nextLine();
        System.out.println("Noi song:");
        noisong = scan.nextLine();
    }

    @Override
    public void hienThi() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CatDetail{" + "loai=" + loai + ", mau=" + mau + ", noisong=" + noisong + '}';
    }
    
}
