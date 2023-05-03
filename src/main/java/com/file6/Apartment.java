package com.file6;

public class Apartment {
    protected String address;
    protected int size;

    public Apartment(String address, int size) {
        this.address = address;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", size=" + size +
                '}';
    }
}
