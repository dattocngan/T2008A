/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9.TestThithuchanh.Excercise1;

/**
 *
 * @author MyPC
 */
public class ConversionUtil {
    double cDegree, fDegree;

    public ConversionUtil() {
    }

    public ConversionUtil(double cDegree, double fDegree) {
        this.cDegree = cDegree;
        this.fDegree = fDegree;
    }

    public double getcDegree() {
        return cDegree;
    }

    public void setcDegree(double cDegree) {
        this.cDegree = cDegree;
    }

    public double getfDegree() {
        return fDegree;
    }

    public void setfDegree(double fDegree) {
        this.fDegree = fDegree;
    }
    public double fahrenheitToCelsius(double fDegree){
        cDegree = (5.0/9) * (fDegree-32);
        return cDegree;
    }
    
    public double celciusToFahrenheit(double cDegree){
        fDegree = (9.0/5) * cDegree + 32;
        return fDegree;
    }
}
