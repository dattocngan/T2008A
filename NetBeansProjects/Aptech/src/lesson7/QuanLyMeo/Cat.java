/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7.QuanLyMeo;

/**
 *
 * @author MyPC
 */
public abstract class Cat {
    public final String ten = "Meo";
    String mau , loai;
    public abstract void nhap();
    
    public abstract void hienThi();
    
    public String getMau(){
        return mau;
    }
    public String getLoai(){
        return loai;
    }
}
