/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamAptechJavaBasic;

import java.util.Date;

/**
 *
 * @author MyPC
 */
public abstract class GeometricObject {
    String color;
    boolean filled;
    java.util.Date dateCreated;

    protected GeometricObject() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    
}
