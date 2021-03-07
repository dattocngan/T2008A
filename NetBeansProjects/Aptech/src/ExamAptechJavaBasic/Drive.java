/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamAptechJavaBasic;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Drive {
    public static void main(String[] args) {
        GeometricObject[] objectList = new GeometricObject[2];
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input info of circle:");
        System.out.println("Radius:");
        float radius = scan.nextFloat();
        circle.radius = radius;
        objectList[0] = circle;
        while(true){
            System.out.println("");
            System.out.println("Input info of rectangle:");
            System.out.println("Width:");
            float width = scan.nextFloat();
            System.out.println("Height:");
            float height = scan.nextFloat();
            System.out.println("");
            if( width > height ){
                System.out.println("Height must be longer than width!!");
                System.out.println("Please try again");
                continue;
            }
            rectangle.width = width;
            rectangle.height = height;
            objectList[1] = rectangle;
            System.out.println("Sum areas of all the geometric objects in an array is: " + sumArea(objectList));
            break;
        }
    }
    
    public static double sumArea(GeometricObject[] a){
        double sum = 0;
        for (GeometricObject geometricObject : a) {
            sum += geometricObject.getArea();
        }
        return sum;
    }
}
