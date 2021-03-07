/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "ABC";
        s1 += "XYZ";
        s1 = s1.concat("OKOK"); //noi chuoi
        
        //Quan ly du lieu String phuc tap
        //Add du lieu => tu dong mo rong khong gian bo nho => cham hon buffer => quan ly tai nguyen tot
        StringBuilder builder = new StringBuilder();
        builder.append("A!");
        builder.append("A2");
        //insert,delete,...
        
        System.out.println(builder.toString());
        
        //Nen dung StringBuilder
        
        //Quan ly nhanh => ton tai nguyen
        StringBuffer buffer = new StringBuffer();
        buffer.append("B1");
        buffer.append("B2");
        System.out.println(buffer.toString());
    }
}
