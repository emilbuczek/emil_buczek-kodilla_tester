package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.homework.School;
import com.kodilla.collections.adv.maps.homework.Principal;

import java.util.HashMap;
import java.util.Map;

import static com.kodilla.collections.adv.maps.homework.Principal.FirstName;

public class SchoolDirectory {
    public static void main(String[] args) {

            Map<Principal, School> numberOfStudents = new HashMap<>();
            Principal John = new Principal("John", " Stevenson");
            Principal Jessie = new Principal("Jessie", "PinkMan");
            Principal Bart = new Principal("Bart", "Simpson");

            School johnSchool = new School(42);
            School jessieSchool = new School(254);
            School bartSchool = new School(40);

            numberOfStudents.put(John, johnSchool);
            numberOfStudents.put(Jessie, jessieSchool);
            numberOfStudents.put(Bart, bartSchool);

            System.out.println("Name of principal is:" + " " + Principal.FirstName + " " + Principal.LastName + " " +
                    " he is working at" + " " + johnSchool);

    }
}
