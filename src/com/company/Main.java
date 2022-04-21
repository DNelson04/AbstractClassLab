package com.company;

import java.util.Date;
//CSCI 185 M05 Spring 2022
//Daniel Nelson
//M2: Abstract Class Lab
//3/11/22
public class Main {

    public static void main(String[] args) {
        Professor p = new Professor("1300809", "Daniel", new Date(), 99456, 4);
        TA t = new TA("423124", "Alex", new Date(), 37, 3);
        System.out.println(p.samePay(t));
        System.out.println(p.sameDaysOff(t));
        Professor[] professors =new Professor[4];
        TA[] tas = new TA[4];
        for(int i = 0; i < 4; i++){
            professors[i] = new Professor();
            tas[i] = new TA();
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Ta #" + (i+1) + " and professor " + (j+1) + " Same pay?       " + professors[i].samePay(tas[j]));
                System.out.println("Ta #" + (i+1) + " and professor " + (j+1) + " Same Days off?? " + professors[i].sameDaysOff(tas[j]));
            }
        }
    }
}