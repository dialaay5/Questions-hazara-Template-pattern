package com.file6;

public class StudioApartment extends Apartment{
    protected int rooms_of_number;

    public StudioApartment(String address, int size, int rooms_of_number) {
        super(address, size);
        this.rooms_of_number = rooms_of_number;
    }

    @Override
    public String toString() {
        return "StudioApartment{" +
                "super:[" + super.toString() + "] " +
                "rooms_of_number=" + rooms_of_number +
                '}';
    }
}
