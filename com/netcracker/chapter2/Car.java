package com.netcracker.chapter2;

public class Car {

    private double cisternGas = 0;
    private final double gasInMiles;
    private double x = 0;

    public Car(double gasInMiles) {
        this.gasInMiles = gasInMiles;
    }

    public void addGas(double gas){
        cisternGas += gas;
    }

    public void drive(double miles){
        cisternGas -= gasInMiles*miles;
        if(cisternGas > 0){
            x+=miles;
        }else{
            x+=miles - Math.abs(cisternGas/gasInMiles);
            cisternGas = 0;
            System.out.println("There is not enough gas");
        }
    }

    public double getCisternGas() {
        return cisternGas;
    }

    public double getGasInMiles() {
        return gasInMiles;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cisternGas=" + cisternGas +
                ", gasInMiles=" + gasInMiles +
                ", x=" + x +
                '}';
    }
}
