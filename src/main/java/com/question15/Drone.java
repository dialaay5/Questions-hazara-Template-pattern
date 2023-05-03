package com.question15;

import java.time.LocalDate;

public class Drone extends Helicopter{


    public Drone(float m_max_speed, String m_manufacturer, float m_max_altitude, String m_engine_power) {
        super(m_max_speed, m_manufacturer, m_max_altitude, m_engine_power);
    }

    public void takeOff(){
        System.out.println("taking off now!!! ");
    }

    @Override
    public String toString() {
        return "Drone{" +
                "super:[" + super.toString() + "] " +
                "}";
    }
}
