/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thingy;
/*
---------
rectangle
---------
length double
width double
*/
/**
 *
 * @author cod39
 */
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double len,double wid){
        length=len;
        width=wid;
    }
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public void setLength(double len){
        length = len;
    }
    public void setWidth(double wid){
        width = wid;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return width*length;
    }
    /*
    Swag
    */
    public String toString(){
        return "Length: "+length+" Width: "+width+" Area: "+getArea();
    }
}
