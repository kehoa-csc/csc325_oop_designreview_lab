/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Senior extends Student {
    //set instance variables
    private int credits;
    //parameterless constructor
    public Senior() {
        super();
    }
    //constructor that takes name, age, and credits
    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < 85) { //ensures credits is at least 85.
            credits = 85;
        }
        this.credits = credits;
    }
    //Gets and returns amount of credits
    public int getCredits() {
        return credits;
    }
    //Sets amount of credits
    public void setCredits(int credits) {
        this.credits = credits;
    }
    //Gives Name Age and Credits when the object is printed
    @Override
    public String toString() {
        return getName()+" | Age: "+getAge()+" Credits: "+getCredits();
    }
}
