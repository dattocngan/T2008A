/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MyPC
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(3);
        marks.add(1);
        marks.add(2);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
