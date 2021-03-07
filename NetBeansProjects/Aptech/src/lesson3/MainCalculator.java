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
public class MainCalculator {
    public static void main(String[] args) {
        float x1,x2;
        Scanner scan = new Scanner(System.in);
        x1 = scan.nextFloat();
        x2 = scan.nextFloat();
        Calculator x = new Calculator();
        x.Cong(x1, x2);
        x.Tru(x1, x2);
        x.Nhan(x1, x2);
        x.Chia(x1, x2);
    }
}
