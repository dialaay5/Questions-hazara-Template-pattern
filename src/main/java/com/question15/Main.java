package com.question15;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Drone drone = new Drone(100f,"Comca",400f,"engine power");
        System.out.println(drone);
        drone.takeOff();

        System.out.println("Airplane extends Aircraft");

    }

}
