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
public class Product {
    private String maHH, tenHH;
    private float soLuong, gia1SP;
    boolean price;
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        maHH = scan.nextLine();
        tenHH = scan.nextLine();
        soLuong = scan.nextFloat();
        gia1SP = scan.nextFloat();
    }

    public float getGia1SP() {
        return gia1SP;
    }
    
    
    public void display(){
        System.out.println("Ma san pham:" + maHH);
        System.out.println("Ten san pham:" + tenHH);
        System.out.println("So luong san pham:" + soLuong);
        System.out.println("Gia 1 san pham:" + gia1SP);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = scan.nextInt();
        int a = 0;
        float max = 0;
        Product[] mangSP = new Product[n];
        for (int i = 0; i < n; i++) {
            mangSP[i] = new Product();
            System.out.println("Nhap thong tin san pham thu " + (i+1) + ":");
            mangSP[i].input();
            if( mangSP[i].getGia1SP() > max ){
                max = mangSP[i].getGia1SP();
                a = i;
            }
        }
        mangSP[a].display();
    }
}
