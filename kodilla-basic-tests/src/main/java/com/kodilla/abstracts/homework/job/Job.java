package com.kodilla.abstracts.homework.job;

public abstract class Job {
    public int salary;

    public Job(int salary) {
        this.salary = salary;
    }

    public abstract void giveResponsibilities();

    public int getSalary() {
        return salary;
    }

    public static void showResponsibilities1() {
        System.out.println("Singing");
    }

    public void showResponsibilities2() {
        System.out.println("Cure people");
    }

    public void showResponsibilities3() {
        System.out.println("Teach people");
    }

}
