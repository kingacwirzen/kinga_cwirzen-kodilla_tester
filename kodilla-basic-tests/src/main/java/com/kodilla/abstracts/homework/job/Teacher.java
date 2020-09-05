package com.kodilla.abstracts.homework.job;

public class Teacher extends Job{

    public Teacher(int salary) {
        super(salary);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Teaching");
    }

}
