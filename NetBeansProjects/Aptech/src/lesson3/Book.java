/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author MyPC
 */
public class Book {
    public String bookName , authorName;
    public int pageNumber , price;
    
    public Book(){
        
    }
    public Book(String bookName , String authorName , int pageNumber , int price){
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.price = price;
    }
    
    public void Display(){
        System.out.format("\nName of book: %s\nName of author: %s\nNumber of pages: %d\nPrice: %d\n", bookName,authorName,pageNumber,price);
    }
}
