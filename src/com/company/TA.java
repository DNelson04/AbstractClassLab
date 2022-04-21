package com.company;
import java.util.Date;

public class TA extends Employee{
    private int wageRate;
    private int daysOff;

    public TA(String ssn, String name, Date hireDate, int wageRate, int daysOff){
        super(ssn, name, hireDate);
        this.daysOff = daysOff;
        this.wageRate = wageRate;
    }

    public TA(){
        super();
        this.wageRate = (int)(Math.random()*20)+15;
        this.daysOff = (int)(Math.random()*3);
    }

    public double getWageRate() {
        return wageRate;
    }
    public void setWageRate(int salary) {
        this.wageRate = salary;
    }

    @Override
    public int getDaysOff() {
        return daysOff;
    }
    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    @Override
    public double getPay() {
        return wageRate * 224;
    }

    @Override
    public String toString() {
        return "TA{" + this.getHireDate() +
                ", wageRate=" + wageRate +
                ", daysOff=" + daysOff +
                '}';
    }
}
