package com.netcracker.chapter3.ex1;

public class Employee implements Measurable{

    private double salary;

    public String getName() {
        return name;
    }

    private String name;

    public Employee(double salary, String name) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
