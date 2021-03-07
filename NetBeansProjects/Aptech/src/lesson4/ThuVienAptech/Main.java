/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.ThuVienAptech;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Sach book = new Sach();
        book.input();
        book.display();
        TacGia author = new TacGia();
        author.input();
        author.display();
        NhaXuatBan manu = new NhaXuatBan();
        manu.input();
        manu.display();
    }
}
