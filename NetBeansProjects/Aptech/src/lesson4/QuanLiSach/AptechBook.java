/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.QuanLiSach;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class AptechBook extends Book{
    private String language;
    private int semester;
    
    //Construct
    public AptechBook(){
    }
    public AptechBook(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }
    
    //Get and Set
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    //Input
    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Ngon ngu: ");
        language = scan.nextLine();
        System.out.print("Hoc ki: ");
        semester = scan.nextInt();
    }
    
    //Display
    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ngon ngu: " + language);
        System.out.println("Hoc ki: " + semester);
    }

    
}
