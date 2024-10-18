/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thingy;

/**
 *
 * @author cod39
 */
public class Thingy {

    public static void main(String[] args) {
        Rectangle livingRoom = new Rectangle();
        livingRoom.setLength(10);
        livingRoom.setWidth(12);
        
        System.out.println("The area of the living room is "+livingRoom.getArea());
        
        Rectangle kitchen = new Rectangle();
        kitchen.setLength(5);
        kitchen.setWidth(4);
        System.out.println("Dimensions of the kitch:\nWidth: "+kitchen.getWidth()+"\nLength: "+kitchen.getLength());
        
        Rectangle garage = new Rectangle();
        garage.setWidth(15);
        garage.setLength(13);
        
        System.out.println("Area of garage is "+garage.getArea());
        
        Rectangle den = new Rectangle(12,16);
        System.out.println(den);
    }
}
