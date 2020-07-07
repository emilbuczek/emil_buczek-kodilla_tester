package com.kodilla.inheritance.abstracts;

public class Person extends Job {
    public String firstName;
    public int age;
    public String job;

    public Person(String firstName, int age,String job){
        super("Hunting", 5);
        Person person= new Person("Emil" , 30 , "Hunter");
        Person person1= new Person("Karol", 25, "Baker");
        Person person2= new Person("David", 40 , "Tester");
    }

    @Override
    public void getJob() {

    }
}