/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.Kiemtra60phut.bai3;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.input();
        book1.display();
        Book book2 = new Book("De men phieu luu ki", "To Hoai", "Kim Dong", 2002);
        book2.display();
    }
}
