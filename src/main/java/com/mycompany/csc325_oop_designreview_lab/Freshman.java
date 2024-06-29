/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Freshman extends Student {
    //set instance variables
    private int credits;
    //parameterless constructor
    public Freshman() {
        super();
    }
    //constructor that takes name, age, and credits
    public Freshman(String name, short age, int credits) {
        super(name, age);
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
