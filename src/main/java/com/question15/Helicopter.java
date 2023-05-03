package com.question15;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Month;

@Getter
public class Helicopter extends Aircraft{
    private String m_engine_power;

    public Helicopter(float m_max_speed, String m_manufacturer, float m_max_altitude, String m_engine_power) {
        super(m_max_speed, m_manufacturer, m_max_altitude);
        this.m_engine_power = m_engine_power;

    }


    @Override
    public String toString() {
        return "Helicopter{" +
                "super:[" + super.toString() + "] " +
                "m_engine_power='" + m_engine_power + '\'' +
                '}';
    }
}
