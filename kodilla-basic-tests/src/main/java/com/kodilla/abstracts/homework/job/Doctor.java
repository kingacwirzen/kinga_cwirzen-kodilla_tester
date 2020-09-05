package com.kodilla.abstracts.homework.job;

public class Doctor extends Job {

    public Doctor(int salary) {
        super(salary);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Heals people");
    }

}
