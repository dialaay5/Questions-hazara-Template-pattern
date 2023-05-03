package com.file6;

public class MathTeacher extends Teacher{
    protected int skills_math;


    public MathTeacher(String name, String id_number , int skills_math) {
        super(name, id_number);
        this.skills_math = skills_math;
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "super:[" + super.toString() + "] " +
                "skills_math=" + skills_math +
                '}';
    }
}
