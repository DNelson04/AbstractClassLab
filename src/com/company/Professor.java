package com.company;

import java.util.Date;

public class Professor extends Employee{
    private int yearlySalary;
    private int daysOff;

    public Professor(String ssn, String name, Date hireDate, int yearlySalary, int daysOff) {
        super(ssn, name, hireDate);
        this.yearlySalary = yearlySalary;
        this.daysOff = daysOff;
    }
    public Professor(){
        super("Unknown", "Unknown", new Date((int)((Math.random()*11)+2011), (int)(Math.random()*11), (int)(Math.random()*30)));
        this.yearlySalary = (int)(Math.random()*20_000)+100_000;
        this.daysOff = (int)(Math.random()*3);
    }
    public double getYearlySalary() {
        return yearlySalary;
    }
    public void setYearlySalary(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    @Override
    public int getDaysOff(){
        return daysOff;
    }
    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    @Override
    public double getPay() {
        return yearlySalary/12;
    }

    @Override
    public String toString() {
        return "Professor{" + this.getHireDate() +
                ", yearlySalary=" + this.yearlySalary +
                ", daysOff=" + this.daysOff +
                '}';
    }
}
