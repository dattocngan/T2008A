/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Product1Menu {
    public static void main(String[] args) {
        ArrayList<Product1> productList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choose,n;
        do{
           Menu();
           System.out.println("Chon chuong trinh:");
           choose = Integer.parseInt(scan.nextLine());
           switch (choose) {
                case 1:
                    System.out.println("Nhap so phan tu can them N: ");
                    n = Integer.parseInt(scan.nextLine());

//                    Product product = new Product(); Khai bao sai
                    for (int i = 0; i < n; i++) {
                        Product1 product = new Product1();
                        product.input();

                        productList.add(product);
                    }
                    break;
                case 2:
                    for (int i = 0; i < productList.size(); i++) {
                        productList.get(i).display();
                    }
                    break;
                case 3:
                    //Sap xep
                    Collections.sort(productList, new Comparator<Product1>() {
                        @Override
                        public int compare(Product1 o1, Product1 o2) {
                            if(o1.price < o2.price) {
                                return 1;
                            }
                            return -1;
                        }
                    });
                    
                    for (int i = 0; i < productList.size(); i++) {
                        productList.get(i).display();
                    }
                    break;
                case 4:
                    System.out.println("Thoat!!!");
                    break;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }
        }while( choose != 4 );
    }
    static void Menu(){
        System.out.println("1.Nhap thong tin cho san pham");
        System.out.println("2.Hien thi thong tin vua nhap");
        System.out.println("3.Sap xep thong tin giam dan theo gia va hien thi");
        System.out.println("4.Thoat chuong trinh");
        
    }
}
