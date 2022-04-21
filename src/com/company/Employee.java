package com.company;

import java.util.Date;

public abstract class Employee {
    private String ssn;
    private String name;
    private Date hireDate;

    public Employee(String ssn, String name, Date hireDate){
        this.ssn = ssn;
        this.name = name;
        this.hireDate = hireDate;
    }

    public Employee(){
        this.ssn = "Unknown";
        this.name = "unknown";
        this.hireDate = new Date();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public abstract double getPay();
    public abstract int getDaysOff();

    public boolean samePay(Employee e){
        return (this.getPay() == e.getPay());
    }
    public boolean sameDaysOff(Employee e){
        return (this.getDaysOff() == e.getDaysOff());
    }
}
