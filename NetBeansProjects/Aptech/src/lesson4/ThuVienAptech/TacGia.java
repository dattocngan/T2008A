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
public class TacGia extends NhaXuatBan{
    String authorName, penName, birthDate;
    
    public TacGia(){
    }
    public TacGia(String authorName, String penName, String birthDate) {
        this.authorName = authorName;
        this.penName = penName;
        this.birthDate = birthDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ten tac gia:");
        authorName = scan.nextLine();
        System.out.println("But danh:");
        penName = scan.nextLine();
        System.out.println("Ngay sinh:");
        birthDate = scan.nextLine();
    }

    @Override
    public String toString() {
        return "TacGia{" + " authorName=" + authorName + ", penName=" + penName + ", birthDate=" + birthDate + '}';
    }

    @Override
    public void display() {
        System.out.println(this);
    }
    
    
}
