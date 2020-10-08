package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;

public class School extends Principal {

    private ArrayList<double[]> numberOfStudents = new ArrayList<>();

    public ArrayList<double[]> getNumberOfStudents() {
        return numberOfStudents;
    }

    public School(double ... numberOfStudents){
        super("John" , "Stevenson" );

        for (double school : numberOfStudents)
                this.numberOfStudents.add(numberOfStudents);
        }
}

