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
public class Sach extends TacGia{
    String bookName;
    float price;
    
    public Sach(){
        
    }

    public Sach(String penName , String manuName, String bookName, float price) {
        this.penName = penName;
        this.manuName = manuName;
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("But danh:");
        penName = scan.nextLine();
        System.out.println("Ten nha xuat ban:");
        manuName = scan.nextLine();
        System.out.println("Ten sach:");
        bookName = scan.nextLine();
        System.out.println("Gia tien:");
        price = scan.nextFloat();
    }

    @Override
    public String toString() {
        return "Sach{" + " penName=" + penName + ", manuName=" + manuName + ", bookName=" + bookName + ", price=" + price + '}';
    }

    @Override
    public void display() {
        System.out.println(this);
    }
    
    
    
}
