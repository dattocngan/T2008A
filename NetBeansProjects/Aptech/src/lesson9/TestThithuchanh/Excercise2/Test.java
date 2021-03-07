/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9.TestThithuchanh.Excercise2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("+Enter a string:");
        String str = scan.nextLine();
        System.out.println("+Result:");
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            System.out.println("        " + st.nextToken());
        }
    }
}
