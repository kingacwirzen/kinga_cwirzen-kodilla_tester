package com.kodilla.abstracts.homework.job;

public class Processor {
    public void process(Job job) {
        System.out.println("makes" + " " + job.getSalary() + " " + "$ per month");
        job.giveResponsibilities();
    }

}
