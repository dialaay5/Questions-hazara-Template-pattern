package com.file6;

public class Teacher {
    protected String name;
    protected String id_number;

    public Teacher(String name, String id_number) {
        this.name = name;
        this.id_number = id_number;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id_number='" + id_number + '\'' +
                '}';
    }
}
