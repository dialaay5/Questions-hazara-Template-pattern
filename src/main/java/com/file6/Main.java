package com.file6;

public class Main {
    public static void main(String[] args) {
        Teacher mathTeacher = new MathTeacher("Mr.davis" , "809036125", 100);
        Teacher historyTeacher = new HistoryTeacher("Mr.tomas", "809023785", "MA in American History");
        System.out.println(mathTeacher);
        System.out.println(historyTeacher);

        System.out.println("can’t access the field “math_skills” because the objects are of the parent type, we can just by casting");

        identifyTeacher(mathTeacher);
        identifyTeacher(historyTeacher);
     }

     public static void identifyTeacher(Teacher teacher){
        if(teacher instanceof MathTeacher){
            System.out.println("math teacher");
            System.out.println(((MathTeacher)teacher).skills_math);
        }
        else if(teacher instanceof HistoryTeacher){
            System.out.println("history teacher");
            System.out.println(((HistoryTeacher)teacher).field_of_profession);
        }
     }
}
