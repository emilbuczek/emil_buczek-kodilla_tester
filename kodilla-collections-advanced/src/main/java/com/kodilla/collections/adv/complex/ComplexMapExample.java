package com.kodilla.collections.adv.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        Student John = new Student("John" , " Stevenson");
        Student Jessie = new Student ("Jessie", "PinkMan");
        Student Bart = new Student ("Bart", "Simpson");

        Grades johnGrades = new Grades(5.0,4.0,4.5,5.0,5.0);
        Grades jessieGrades = new Grades(2.5,3.0,2.0);
        Grades bartGrades = new Grades(4.0,4.0,4.0,4.0,5.0);

        school.put(John, johnGrades);
        school.put(Jessie, jessieGrades);
        school.put(Bart,bartGrades);

        System.out.println(school.get(John));

        for(Map.Entry<Student, Grades> studentEntry : school.entrySet())
            System.out.println(studentEntry.getKey().getFirstName() + ", average:"+ studentEntry.getValue().getAverage()
            );

    }
}
