/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.ThuVienAptech;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class NhaXuatBan {
    String foundDay, manuName, representativeName;
    int foundYear;
    
    public NhaXuatBan(){
    }
    public NhaXuatBan(String manuName, String representativeName, String foundDay, int foundYear) {
        this.manuName = manuName;
        this.representativeName = representativeName;
        this.foundDay = foundDay;
        this.foundYear = foundYear;
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getFoundDay() {
        return foundDay;
    }

    public void setFoundDay(String foundDay) {
        this.foundDay = foundDay;
    }

    public int getFoundYear() {
        return foundYear;
    }

    public void setFoundYear(int foundYear) {
        this.foundYear = foundYear;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ten nha xuat ban:");
        manuName = scan.nextLine();
        System.out.println("Ngay thanh lap:");
        foundDay = scan.nextLine();
        System.out.println("Ten nguoi dai dien:");
        representativeName = scan.nextLine();
        System.out.println("Nam thanh lap:");
        foundYear = scan.nextInt();
    }

    @Override
    public String toString() {
        return "NhaXuatBan{" + " foundDay=" + foundDay + ", manuName=" + manuName + ", representativeName=" + representativeName + ", foundYear=" + foundYear + '}';
    }
    
    public void display(){
        System.out.println(this);
    }
    
}
