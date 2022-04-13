package com.netcracker;

import au.com.bytecode.opencsv.CSVReader;
import com.netcracker.chapter1.*;
import com.netcracker.chapter2.Car;
import com.netcracker.chapter2.ClassCSV;
import com.netcracker.chapter2.Point;
import com.netcracker.chapter3.IntSequence;
import com.netcracker.chapter3.ex1.Employee;
import com.netcracker.chapter3.ex1.Measurable;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws  IOException {
        NormalaizeAngle normalaizeAngle = new NormalaizeAngle();
        System.out.println("Normalizes angle(%): " + normalaizeAngle.normalaizeAngle());
        System.out.println("Normalizes angle(FloorMod): " + normalaizeAngle.normalaizeAngleFloorMod());

        FactorialClass factorialClass = new FactorialClass();
        System.out.println("Factorial number = " + factorialClass.evaluateFactorial());

        Substring substring = new Substring();
        substring.substringString();

        Lottery lottery = new Lottery();
        System.out.println("Lottery bilet: " + Arrays.toString(lottery.createLotteryBilet()));

        MagicMassive magicMassive = new MagicMassive();
        System.out.println(magicMassive.checkMagic());

        Point point = new Point(3,4).translate(1,3).scale(0.5);
        System.out.println(point);

        Car car = new Car(5.0);
        car.addGas(50);
        car.drive(7);
        System.out.println("Car drive 7 miles(current x and amount gas): " + car.getX() + " " + car.getCisternGas());
        car.drive(5);
        System.out.println("Car drive even 5 miles, but there is not enough gas and car drive only 3 miles (current x and amount gas): "
                + car.getX() + " " + car.getCisternGas());


        ClassCSV classCSV = new ClassCSV();
        classCSV.readFile();

        Employee[] employees =  {
            new Employee(200, "Vity"),
             new Employee(400, "John"),
             new Employee(600, "Kitty"),
             new Employee(800, "Bruce"),
             new Employee(1000, "Kain")
        };

        System.out.println("Average salary of an array of employees: " + average(employees));
        System.out.println(employees[larghest(employees)].getName());



          IntSequence intSequence = IntSequence.of(1,2,3,4,5);
          intSequence.printArray();

          System.out.println();

          IntSequence  intSequence1 = IntSequence.constans(1);
          //intSequence1.printArray();

    }


    public static int larghest(Measurable[] measurables){
        int maxIndex = 0;
        double max = 0;
        for (int i = 0; i < measurables.length; i++) {
            if(max < measurables[i].getMeasure()){
                max = measurables[i].getMeasure();
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    public static double average(Measurable[] measurables){
        double sum = 0;
        for (int i = 0; i < measurables.length; i++) {
            sum += measurables[i].getMeasure();
        }
        return sum/measurables.length;
    }
}

