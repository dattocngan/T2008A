 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.QuanLiBaiDoXe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class PeopleList{
   ArrayList<People> peopleList = new ArrayList<>();
   
   public void input(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Nhap so chu xe:");
       int n = Integer.parseInt(scan.nextLine());
       for (int i = 0; i < n; i++) {
           People people = new People();
           people.input();
           peopleList.add(people);
       }
   }
    
}
