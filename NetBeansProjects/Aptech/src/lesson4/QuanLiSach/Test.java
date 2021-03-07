/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.QuanLiSach;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<AptechBook> bookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choose, n;
        do{
            Menu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    System.out.println("Nhap so sach can them: ");
                    n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin quyen sach thu " +(i+1)+":");
                        AptechBook book = new AptechBook();
                        book.input();
                        bookList.add(book);
                        System.out.println("");
                    }
                break;
                
                case 2:
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println("Thong tin quyen sach thu " +(i+1)+":");
                        bookList.get(i).display();
                        System.out.println("");
                    }
                break;
                
                case 3:
                    Collections.sort(bookList, new Comparator<AptechBook>() {
                        @Override
                        public int compare(AptechBook o1, AptechBook o2) {
                            if(o1.getYearPublishing() < o2.getYearPublishing()) {
                                return 1;
                            }
                            return -1;
                        }
                    });
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println("Thong tin quyen sach thu " +(i+1)+":");
                        bookList.get(i).display();
                        System.out.println("");
                    }
                break;
                
                case 4:
                    String bookSearch;
                    int check = 0;
                    System.out.println("Nhap ten sach can tim kiem:");
                    bookSearch = scan.nextLine();
                    for (int i = 0; i < bookList.size(); i++) {
                        if(bookList.get(i).getBookName().equals(bookSearch)){
                            System.out.println("Thong tin quyen sach thu " +(i+1)+":");
                            bookList.get(i).display();
                            System.out.println("");
                            check++;
                        }
                    }
                    if(check == 0){
                        System.out.println("Khong co sach theo yeu cau!!");
                        System.out.println("");
                    }
                break;
                
                case 5:
                    String authorSearch;
                    int check1 = 0;
                    System.out.println("Nhap ten tac gia can tim kiem:");
                    authorSearch = scan.nextLine();
                    for (int i = 0; i < bookList.size(); i++) {
                        if(bookList.get(i).getBookAuthor().equals(authorSearch)){
                            bookList.get(i).display();
                            check1++;
                        }
                    }
                    if(check1 == 0){
                        System.out.println("Khong co ten tac gia theo yeu cau!!");
                        System.out.println("");
                    }
                break;
                
                case 6:
                    System.out.println("Tam biet!!");
                break;
                
                default:
                    System.err.println("Nhap sai!!!");
                    System.out.println("");
                break;
            }
        }while(choose != 6);
    }
    static void Menu(){
        System.out.println("1.Nhập thông tin n cuốn sách của Aptech");
        System.out.println("2.Hiển thị thông tin vừa nhập");
        System.out.println("3.Sắp xếp thông tin giảm dần theo năm xuất bản và hiển thị");
        System.out.println("4.Tìm kiếm theo tên sách");
        System.out.println("5.Tìm kiếm theo tên tác giả");
        System.out.println("6.Thoát.");
    }
}
