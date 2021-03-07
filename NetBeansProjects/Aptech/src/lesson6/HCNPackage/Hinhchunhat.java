/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.HCNPackage;

/**
 *
 * @author MyPC
 */
public class Hinhchunhat implements HCNInterface{
    float chieudai , chieurong;

    public Hinhchunhat() {
    }

    public Hinhchunhat(float chieudai, float chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    
    

    @Override
    public float dientichHCN() {
        return chieudai*chieurong;
    }

    @Override
    public float getChieuDai() {
        return chieudai;
    }

    @Override
    public float getChieuRong() {
        return chieurong;
    }

    @Override
    public void setDaiRong(float cd, float cr) {
        chieudai = cd;
        chieurong = cr;
    }

    
}
