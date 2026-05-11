package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        HoverCraft hoverCraft = new HoverCraft();
        SemiTruck semiTruck = new SemiTruck();
        Moped moped = new Moped();

        car.setColor("Red");
        hoverCraft.setTopSpeed(100);
        semiTruck.setNumberOfPassengers(2);
        moped.setModel("v12");

        System.out.println(car.getColor());
        System.out.println(hoverCraft.getTopSpeed());
        System.out.println(semiTruck.getNumberOfPassengers());
        System.out.println(moped.getModel());

    }
}
