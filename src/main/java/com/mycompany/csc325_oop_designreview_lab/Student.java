/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    //Set instance variables
    private String name;
    private String address;
    private short age;
    private int gpa;

    //Parameterless constructor
    public Student() {
        super();
    }

    //Constructor with name and age
    public Student(String name, short age) {
        super(name, age);
    }

    //Constructor with name, age, and gpa
    public Student(String name, short age, int gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    //Override a method for returning the address
    @Override
    public String getAddress() {
        return address;
    }

    //Override a method for setting the address
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    //Gets and Returns GPA
    public int getGpa() {
        return gpa;
    }

    //Sets GPA
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    //Gives Name Address Age and GPA when the object is printed
    @Override
    public String toString() {
        return getName()+" | Address: "+getAddress()+" Age: "+getAge()+" GPA: "+getGpa();
    }

    // ToDo 1: Make this class a child of Human
	// ToDo 2: Fix the resulting errors
	// ToDo 3: Add a field for GPA and create a setter and a getter
	// ToDo 4: Add comments to your code
}
