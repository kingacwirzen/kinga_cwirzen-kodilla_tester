package com.kodilla.abstracts.homework.job;

public class Singer extends Job {

    public Singer(int salary) {
        super(salary);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Making music");
    }

}
