/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.Kiemtra60phut.bai3;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Book {
    String bookName, authorName, manu;
    int year;
    
    public Book(){
    }
    public Book(String bookName, String authorName, String manu, int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.manu = manu;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ten sach:");
        bookName = scan.nextLine();
        System.out.println("Ten tac gia:");
        authorName = scan.nextLine();
        System.out.println("Ten NXB:");
        manu = scan.nextLine();
        System.out.println("Nam xuat ban:");
        year = scan.nextInt();
    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", authorName=" + authorName + ", manu=" + manu + ", year=" + year + '}';
    }
    
}
