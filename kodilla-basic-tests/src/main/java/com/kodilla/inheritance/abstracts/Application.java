package com.kodilla.inheritance.abstracts;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Person emil = new Person("Emil", 30, new Hunter("hunting", 3000));
        Person karol = new Person("Karol", 25, new Baker("baking", 2000));
        Person david = new Person("David", 40, new Programmer("programming", 40000));
        Person michal = new Person("Michal", 30, new Soldier("shooting" , 4000));

        List<Person> personList = new ArrayList<>();
        personList.add(emil);
        personList.add(karol);
        personList.add(david);
        personList.add(michal);

        for (Person person : personList){
            System.out.println("Emil is a " + person.getJob() + " and he's" + " " + person.job.getNameOfResponsibilities() +
                    " " + " and he's amount of salary is" + person.job.getSalary());
        }
    }
}