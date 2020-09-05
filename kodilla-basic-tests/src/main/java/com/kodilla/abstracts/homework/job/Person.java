package com.kodilla.abstracts.homework.job;

public class Person {
    public String firstName;
    public int age;
    public String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    Person singer = new Person("Ania", 16, "singer");
    Person teacher = new Person("Wojtek", 90, "teacher");
    Person doctor = new Person("Adam", 50, "doctor");

    public static void main(String[] args) {
        Singer singer = new Singer(4000);
        Singer.showResponsibilities1();
        Doctor doctor = new Doctor(2000);
        singer.showResponsibilities2();
        Teacher teacher = new Teacher(1000);
        teacher.showResponsibilities3();
    }

}
