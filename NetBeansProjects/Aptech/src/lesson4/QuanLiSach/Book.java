/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.QuanLiSach;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Book {
    private String bookName, bookAuthor, producer;
    private int yearPublishing;
    private float price;
    
    //Construct
    public Book(){
    }
    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }
    
    //set, get
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    //Input
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ten sach: ");
        bookName = scan.nextLine();
        System.out.print("Ten tac gia: ");
        bookAuthor = scan.nextLine();
        System.out.print("Nha san xuat: ");
        producer = scan.nextLine();
        System.out.print("Nam xuat ban: ");
        yearPublishing = scan.nextInt();
        System.out.print("Gia tien: ");
        price = scan.nextFloat();
    }
    
    //Display
    public void display(){
        System.out.println("Ten sach: " + bookName);
        System.out.println("Ten tac gia: " + bookAuthor);
        System.out.println("Nha san xuat: " + producer);
        System.out.println("Nam xuat ban: " + yearPublishing);
        System.out.println("Gia tien: " + price);
    }
    
}
