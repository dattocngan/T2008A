 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8.QuanLyCovid19;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Citizen {
    Scanner scan = new Scanner(System.in);
    String patientName, cmtnd;
    int age;
    String gender;
    String permanentAddress, temporaryAddress;
    String healthStatus;
    String movingProcess;
    String[] healthStatusList = new String[3];
    ArrayList<String> movingProcessList = new ArrayList<>();
    ArrayList<Citizen> patientList = new ArrayList<>();

    public Citizen() {
        healthStatusList[0] = "Binh thuong";
        healthStatusList[1] = "Tiep xuc voi benh nhan";
        healthStatusList[2] = "Duong tinh voi Covid 19";
    }

    public Citizen(String patientName, String cmtnd, int age, String gender, String permanentAddress, String temporaryAddress, String healthStatus, String movingProcess) {
        this.patientName = patientName;
        this.cmtnd = cmtnd;
        this.age = age;
        this.gender = gender;
        this.permanentAddress = permanentAddress;
        this.temporaryAddress = temporaryAddress;
        this.healthStatus = healthStatus;
        this.movingProcess = movingProcess;
    }
    
    public void input(){
        System.out.println("So cong dan muon nhap:");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Citizen people = new Citizen();
            System.out.println("Nhap ten:");
            people.patientName = scan.nextLine();
            System.out.println("CMTND:");
            people.cmtnd = scan.nextLine();
            System.out.println("Tuoi:");
            people.age = Integer.parseInt(scan.nextLine());
            System.out.println("Gioi tinh:");
            people.gender = scan.nextLine();
            System.out.println("Dia chi thuong tru:");
            people.permanentAddress = scan.nextLine();
            System.out.println("Dia chi tam tru:");
            people.temporaryAddress = scan.nextLine();
            people.healthStatus = healthStatusList[0];
            patientList.add(people);
        }
        
    }
    
    public void patientNameSearch(){
        System.out.println("Nhap ten benh nhan muon tim kiem:");
        String name = scan.nextLine();
        int check = 0;
        for (Citizen patient : patientList) {
            if(patient.patientName.equalsIgnoreCase(name)){
                patient.display();
                check++;
            }
        }
        if(check == 0) System.out.println("Khong tim thay benh nhan nao!!");
    }
    
    public void cmtndSearch(){
        System.out.println("Nhap CMTND muon tim kiem:");
        String cmt = scan.nextLine();
        int check = 0;
        for (Citizen patient : patientList) {
            if(patient.cmtnd.equalsIgnoreCase(cmt)){
                patient.display();
                check++;
                break;
            }
        }
        if(check == 0) System.out.println("Khong tim thay benh nhan nao!!");
    }
    
    public void healthStatusSet(){
        System.out.println("Nhap CMTND muon tim kiem:");
        String cmt = scan.nextLine();
        int check = 0;
        for (Citizen patient : patientList) {
            if(patient.cmtnd.equalsIgnoreCase(cmt)){
                System.out.println("Da tim thay!!");
                patient.display();
                System.out.println("1.Binh thuong");
                System.out.println("2.Tiep xuc voi benh nhan");
                System.out.println("3.Duong tinh voi Covid 19");
                System.out.println("Thiet lap trang thai suc khoe la gi:");
                int choose = Integer.parseInt(scan.nextLine());
                if(choose == 1) patient.healthStatus = healthStatusList[0];
                else if(choose == 2) patient.healthStatus = healthStatusList[1];
                else patient.healthStatus = healthStatusList[2];
                System.out.println("Da thiet lap trang thai suc khoe thanh cong!!!");
                check++;
                break;
            }
        }
        if(check == 0) System.out.println("Khong tim thay benh nhan nao!!");
    }
    
    public void movingProcess(){
        int check = 0;
        for (Citizen people : patientList) {
            if(people.healthStatus == healthStatusList[1] || people.healthStatus == healthStatusList[2]){
                people.display();
                System.out.println("May muon khai bao may da di bao nhieu noi:");
                int num = Integer.parseInt(scan.nextLine());
                System.out.println("Nhap noi:");
                movingProcessList = new ArrayList<>();
                for (int i = 1; i <= num; i++) {
                    System.out.println("Dia diem thu " + i + " :" );
                    String location = scan.nextLine();
                    people.movingProcessList.add(location);
                }
                System.out.println("Da cap nhat trang thai di chuyen thanh cong!!");
                check++;
            }
        }
        if(check == 0) System.out.println("Khong ai bi benh!!");
    }
    
    public void searchRelativePeople(){
        System.out.println("Nhap CMTND muon tim kiem:");
        String cmt = scan.nextLine();
        int check = 0;
        for (Citizen patient : patientList) {
            if(patient.cmtnd.equalsIgnoreCase(cmt)){
                System.out.println("Da tim thay!!");
                patient.display();
                if(patient.healthStatus == healthStatusList[1] || patient.healthStatus == healthStatusList[2]){
                    int kiemtra = 0;
                    for (Citizen people : patientList){
                        if(people.cmtnd != patient.cmtnd){
                            for(int i = 0 ; i < patient.movingProcessList.size() ; i++ ){
                                if(patient.movingProcessList.get(i).equalsIgnoreCase(people.permanentAddress) || patient.movingProcessList.get(i).equalsIgnoreCase(people.temporaryAddress)){
                                    people.healthStatus = healthStatusList[1];
                                    kiemtra++;
                                    break;
                                }
                            }
                        }
                    }
                    if(kiemtra==0) System.out.println("Khong co ai thuoc khu vuc nguoi bi benh da di qua");
                    else System.out.println("Da thiet lap thanh cong!!");
                }else System.out.println("Nguoi nay khong bi benh");
                check++;
                break;
            }
        }
        if(check == 0) System.out.println("Khong tim thay benh nhan nao!!");
    }
    
    public void covidPatient(){
        int check = 0;
        for (Citizen patient : patientList) {
            if(patient.healthStatus == healthStatusList[2]){
                patient.display();
                check++;
            }
        }
        if(check == 0 ) System.out.println("Khong co ai duong tinh voi Covid 19!!");
    }
    
    public void watchingPatient(){
        int check = 0;
        for (Citizen patient : patientList) {
            if(patient.healthStatus == healthStatusList[1]){
                patient.display();
                check++;
            }
        }
        if(check == 0 ) System.out.println("Khong co ai nam trong dien bi theo doi!!");
    }
    
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Citizen{" + "patientName=" + patientName + ", cmtnd=" + cmtnd + ", age=" + age + ", gender=" + gender + ", permanentAddress=" + permanentAddress + ", temporaryAddress=" + temporaryAddress + ", healthStatus=" + healthStatus + ", movingProcessList=" + movingProcessList + '}';
    }

    

    
    
}
