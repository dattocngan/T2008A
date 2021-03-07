/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author MyPC
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.Input();
        employee1.Display();
        
        Employee employee2 = new Employee("Nguyen Tien Dat", "Nam", "Ha Noi", "Giam doc", 184000000);
        employee2.Display();
    }
}
