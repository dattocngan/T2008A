/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a , b , c , x;
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        if( a == 0 ){
            if( b == 0 ){
                if( c == 0 ){
                    System.out.println("PTVN");
                }else{
                    System.out.println("PTVSN");
                }
            }else{
                x = -c / b;
                System.out.println("PT co 1 nghiem la: " + x );
            }
        }else{
            float delta;
            delta = b * b - 4 * a * c;
            if(delta < 0){
                System.out.println("PTVN");
            }else if(delta == 0){
                x = -b / ( 2 * a );
                System.out.println("PT co 1 nghiem la: " + x );
            }else{
                float x1 , x2;
                x1 =(float) (( -b + sqrt(delta) ) / ( 2 * a ));
                x2 =(float) (( -b - sqrt(delta) ) / ( 2 * a ));
                System.out.println("PT co 2 nghiem phan biet la: " + x1 + " " + x2);
            }
        }
    }
}
