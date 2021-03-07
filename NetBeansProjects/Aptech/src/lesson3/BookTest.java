/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Book book1 = new Book();
        book1.bookName = scan.nextLine();
        book1.authorName = scan.nextLine();
        book1.pageNumber = scan.nextInt();
        book1.price = scan.nextInt();
        book1.Display();
        
        Book book2 = new Book("De men phieu luu ky", "To Hoai", 300, 2032001);
        book2.Display();
    }
}
