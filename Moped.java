/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thingy;

/**
 -----------------------
 Moped
 -----------------------
 -year:int
 -make:String
 -speed:int
 -----------------------
 +Moped(y:int, m:String)
 +Moped()
 +getYear():int
 +getMake():String
 +getSpeed():int
 +setYear(int y)
 +setMake(String m)
 +setSpeed(int s)
 +accelerate()
 +brake()
 */
public class Moped {
    private int year;
    private String make;
    private int speed;
    /**
     * Constructor that takes in int year and string make
     * @param y
     * @param m 
     */
    public Moped(int y, String m){
        year = y;
        make = m;
        speed = 0;
    }
    /**
     * Constructor without parameters
     */
    public Moped(){
        year = 2000;
        make = "Scooter";
        speed = 0;
    }
    /**
     * Accessor that returns year value
     * @return 
     */
    public int getYear(){
        return year;
    }
    /**
     * Accessor that returns make value
     * @return 
     */
    public String getMake(){
        return make;
    }
    /**
     * Accessor that returns speed value
     * @return 
     */
    public int getSpeed(){
        return speed;
    }
    /**
     * setter that sets year to int parameter y
     * @param y 
     */
    public void setYear(int y){
        year = y;
    }
    /**
     * setter that sets make to string parameter m
     * @param m
     */
    public void setMake(String m){
        make = m;
    }
    /**
     * setter that sets speed to int parameter s
     * @param s
     */
    public void setSpeed(int s){
        speed = s;
    }
    /**
     * adds 5 to speed value
     */
    public void accelerate(){
        speed+=5;
    }
    /**
     * subtracts 5 from speed value
     */
    public void brake(){
        speed-=5;
    }
    /**
     * returns a string containing information about the moped object
     * @return 
     */
    public String toString(){
        return "Year: "+year+"\nMake: "+make+"\nSpeed: "+speed;
    }
}
