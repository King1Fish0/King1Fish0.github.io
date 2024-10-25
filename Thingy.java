/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thingy;

/**
 *create a method outside of main named printStatus
 * when printStatus is given a moped object, have the method print the status of moped (give year, make, and current speed)
 * continue in main
 * create scanner object name keyboard
 * prompt user to enter the year of their moped
 * save keyboard.nextInt to int value year
 * prompt user to enter make of moped
 * save keyboard.next to String value make
 * use printStatus to display status of moped
 * create a for loop that loops four times
 * within the loop, call the accelerate method within the moped object
 * use printStatus at the end of every loop
 * create a for loop that repeats three times
 * within the loop, call the brake method within the moped object
 * call printStatus at the end of every loop
 */
import java.util.*;
public class Thingy {
    /*
    Prints given parameter moped object
    */
    public static void printStatus(Moped moped){
        System.out.println("A "+moped.getYear()+" "+moped.getMake()+" going "+moped.getSpeed()+" miles per hour.");
    }
    public static int isValid(Scanner keyboard){//prompts user to input a double, repeats till a valid double is given
        
        int year = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter a year between 1995 and 2023: ");
            if (keyboard.hasNextInt()) {
                year = keyboard.nextInt();
                if (year >= 1995 && year <= 2023) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Year must be between 1995 and 2023.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                keyboard.next(); // Clear the invalid input
            }
        }

        return year;

    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);//creates scanner object
        
        int year = isValid(keyboard);//saves users int input
        
        System.out.println("Enter the make of your Moped (such as Yamaha, Vespa, or Lexmoto");
        String make = keyboard.next();//saves users string input
        
        Moped first = new Moped(year,make);//creates moped object with user inputs as parameters
        
        printStatus(first);//prints moped status
        for(int i = 0; i<4; i++){//loops for 4 times
            first.accelerate();//adds 5 to moped speed
            printStatus(first);//prints moped status
        }
        
        for(int i = 0; i < 3; i++){//loops 3 times
            first.brake();//subtracts 5 from moped speed
            printStatus(first);//prints moped status
        }
    }
}
