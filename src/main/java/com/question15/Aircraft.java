package com.question15;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Month;

@Getter
public class Aircraft {
    private final String m_manufacturer;
    private float m_max_speed;
    private float m_max_altitude;
    private final LocalDate m_production_date;

    public Aircraft(float m_max_speed, String m_manufacturer, float m_max_altitude) {
        this.m_max_speed = m_max_speed;
        this.m_manufacturer = m_manufacturer;
        this.m_max_altitude = m_max_altitude;
        this.m_production_date = LocalDate.of(2020, Month.JANUARY, 8);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "m_manufacturer='" + m_manufacturer + '\'' +
                ", m_max_speed=" + m_max_speed +
                ", m_max_altitude=" + m_max_altitude +
                ", m_production_date=" + m_production_date +
                '}';
    }
}
