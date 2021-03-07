/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class BaiTap {
    private static boolean IntCheck(int n){
        if( n <= 1 ) return false;
        for( int i = 2 ; i <= sqrt(n) ; i++ ){
            if( n % i == 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        int []a;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        a = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            a[i] = scan.nextInt();
        }
        for( int i = 0 ; i < n ; i++ ){
            if( IntCheck( a[i] ) ) System.out.println( a[i] );
        }
    }
}
